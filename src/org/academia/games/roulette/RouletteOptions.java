package org.academia.games.roulette;

/**
 * All the possible values for the roulette game
 */
public enum RouletteOptions {

    /**
     * @param value refers to the number value
     * @param color refers to the color RED or BLACK, the zero is the only GREEN
     * @param oddOrEven if the value is odd, if the value is even, the zero is #0
     * @param upOrDown refers to the first (DOWN) or second (UP) half of values, the zero is #0
     * @param dozen refers to the first #1, second #2 or third #3 dozen
     */

    ZERO(0, "GREEN", "ZERO", "ZERO", "" + 0),
    ONE(1, "RED", "ODD", "DOWN", "" + 1),
    TWO(2, "BLACK", "EVEN", "DOWN", "" + 1),
    THREE(3, "RED", "ODD", "DOWN", "" + 1),
    FOUR(4, "BLACK", "EVEN", "DOWN", "" + 1),
    FIVE(5, "RED", "ODD", "DOWN", "" + 1),
    SIX(6, "BLACK", "EVEN", "DOWN", "" + 1),
    SEVEN(7, "RED", "ODD", "DOWN", "" + 1),
    EIGHT(8, "BLACK", "EVEN", "DOWN", "" + 1),
    NINE(9, "RED", "ODD", "DOWN", "" + 1),
    TEN(10, "BLACK", "EVEN", "DOWN", "" + 1),
    ELEVEN(11, "BLACK", "ODD", "DOWN", "" + 1),
    TWELVE(12, "RED", "EVEN", "DOWN", "" + 1),
    THIRTEEN(13, "BLACK", "ODD", "DOWN", "" + 2),
    FOURTEEN(14, "RED", "EVEN", "DOWN", "" + 2),
    FIFTEEN(15, "BLACK", "ODD", "DOWN", "" + 2),
    SIXTEEN(16, "RED", "EVEN", "DOWN", "" + 2),
    SEVENTEEN(17, "BLACK", "ODD", "DOWN", "" + 2),
    EIGHTEEN(18, "RED", "EVEN", "DOWN", "" + 2),
    NINETEEN(19, "RED", "ODD", "UP", "" + 2),
    TWENTY(20, "BLACK", "EVEN", "UP", "" + 2),
    TWENTYONE(21, "RED", "ODD", "UP", "" + 2),
    TWENTYTWO(22, "BLACK", "EVEN", "UP", "" + 2),
    TWENTYTHREE(23, "RED", "ODD", "UP", "" + 2),
    TWENTYFOUR(24, "BLACK", "EVEN", "UP", "" + 2),
    TWENTYFIVE(25, "RED", "ODD", "UP", "" + 3),
    TWENTYSIX(26, "BLACK", "EVEN", "UP", "" + 3),
    TWENTYSEVEN(27, "RED", "ODD", "UP", "" + 3),
    TWENTYEIGHT(28, "BLACK", "EVEN", "UP", "" + 3),
    TWENTYNINE(29, "BLACK", "ODD", "UP", "" + 3),
    THIRTY(30, "RED", "EVEN", "UP", "" + 3),
    THIRTYONE(31, "BLACK", "ODD", "UP", "" + 3),
    THIRTYTWO(32, "RED", "EVEN", "UP", "" + 3),
    THIRTYTHREE(33, "BLACK", "ODD", "UP", "" + 3),
    THIRTYFOUR(34, "RED", "EVEN", "UP", "" + 3),
    THIRTYFIVE(35, "BLACK", "ODD", "UP", "" + 3),
    THIRTYSIX(36, "RED", "EVEN", "UP", "" + 3);

    private int value;
    private String color;
    private String oddOrEven;
    private String upOrDown;
    private String dozen;

    RouletteOptions(int value, String color, String oddOrEven, String upOrDown, String dozen) {

        this.value = value;
        this.color = color;
        this.oddOrEven = oddOrEven;
        this.upOrDown = upOrDown;
        this.dozen = dozen;

    }

    public int getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }

    public String getOddOrEven() {
        return oddOrEven;
    }

    public String getUpOrDown() {
        return upOrDown;
    }

    public String getDozen() {
        return dozen;
    }

    @Override
    public String toString() {
        if (value == 0) {
            return "NUMBER = " + value;
        }

        return "NUMBER = " + value +
                "\nCOLOR = " + color +
                "\n" + oddOrEven +
                "\n" + upOrDown +
                "\nDOZEN = " + dozen +"\n";
    }
}
