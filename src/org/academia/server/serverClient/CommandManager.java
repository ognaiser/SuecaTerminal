package org.academia.server.serverClient;

import org.academia.games.ClientDispatcher;
import org.academia.server.Server;

import java.util.List;

public class CommandManager {

    private List<Server.ClientHandler> clientHandlers ;
    private ClientDispatcher clientDispatcher = new ClientDispatcher();

    public CommandManager(List<Server.ClientHandler> clientHandlers) {
        this.clientHandlers = clientHandlers;
    }

    public void handle(Server.ClientHandler clientHandler, String msg) {

        switch (msg){
            case "!help":
                list(clientHandler);
                break;
            case "!getchips":
                getChips(clientHandler);
                break;
            case "!play sueca":
                clientHandler.delete();
                clientHandler.disconnect();
                clientDispatcher.addToSuecaQueue(clientHandler);
                break;
            case "!exit sueca":
                clientDispatcher.removeFromSueca(clientHandler);
                break;
            case "!exit president":
                clientDispatcher.removeFromPresident(clientHandler);
                break;
            case "!play roulette":
                clientHandler.delete();
                clientHandler.disconnect();
                clientDispatcher.startRoulette(clientHandler);
                break;
            case "!play president":
                clientHandler.delete();
                clientHandler.disconnect();
                clientDispatcher.addToPresidentQueue(clientHandler);
                break;
            case "!enter stripclub":
                clientHandler.delete();
                clientHandler.disconnect();
                clientDispatcher.enterClub(clientHandler);
                break;
            case "!exit":
                //clientHandler.delete();
                //clientHandler.disconnect();
                break;
            default:
                defaultMsg(clientHandler);
                break;
        }
    }

    private void defaultMsg(Server.ClientHandler clientHandler) {
        clientHandler.send("Command not Found! type !help for help!");
    }

    private void list(Server.ClientHandler handler){
        handler.send("!help -> List all commands!");
        handler.send("!getchips -> get 100 chips ");
        handler.send("!play sueca -> Enter queue for sueca!");
        handler.send("!play roulette -> Play a roulette");
    }

    private void getChips(Server.ClientHandler handler){

        if (handler.getClient().getChips() == 0){
            handler.getClient().addChips(100);
            handler.send("You received 100 chips! Your chips: " + handler.getClient().getChips());
            handler.getClient().setChipsCoolddown(System.currentTimeMillis());
        }

        if (System.currentTimeMillis() > (handler.getClient().getChipsCoolddown() + Server.CHIPSCOOLDOWN)){
            handler.getClient().addChips(100);
            handler.send("You received 100 chips! Your chips: " + handler.getClient().getChips());
            handler.getClient().setChipsCoolddown(System.currentTimeMillis());
        }else{
            handler.send("Get Chips still in cooldown, " + ((Server.CHIPSCOOLDOWN - (System.currentTimeMillis() - handler.getClient().getChipsCoolddown())) / 1000) + "seconds to go!");
        }

    }


}
