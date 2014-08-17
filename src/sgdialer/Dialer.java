package sgdialer;

/**
 *
 * @author Malanius
 * @version 0.0
 */
public class Dialer {

    private int actualPos;
    private char symbols[];//Symbols array
    //Consrtructor

    public Dialer(char[] symbols) {
        this.symbols = symbols;
        actualPos = 0; //Since gate is restarted on each run
        //Testing message
        System.err.print("[Dialer]: Sucessfully obtained symbol array: ");
        String strSymbols = "";
        for (int i = 0; i < this.symbols.length; i++) {
            strSymbols += this.symbols[i];
        }
        System.err.println(strSymbols);
    }//End of Constructor

    public void dial(String adress) {
        char[] adressArray = adress.toCharArray();
        for (int i = 0; i < adress.length(); i++) {
            System.err.printf("[Dialer]: Encoding symbol [%s]\n", adressArray[i]);
            ringMove(calculateRoute(getSymbolPos(adressArray[i],true)));
            actualPos = getSymbolPos(adressArray[i],false);
            System.out.printf("[Dialer]: Symbol [%s] susessfully encoded.\n", adressArray[i]);
            System.err.printf("[Dialer]: Current pos is %s.\n", actualPos);
        }
    }

    private int getSymbolPos(char symb, boolean out) {
        int pos = -1;
        do {
            pos++;
        } while (symbols[pos] != symb);
        if (out) {
            System.err.printf("[Positioner]: Found symbol %s at %s position.\n", symb, pos);
        }
        return pos;
    }

    private int calculateRoute(int pos) {
        int route;
        //Steps to rotate in each diretion
        int toLeft;
        int toRight;
        if (pos > actualPos) {
            toRight = actualPos + pos;
            toLeft = actualPos + (symbols.length - pos);
            System.err.printf("[Router]: Left: %s Right: %s\n", toLeft, toRight);
        } else {
            toRight = (symbols.length - actualPos) + pos;
            toLeft = actualPos - pos;
            System.err.printf("[Router]: Left: %s Right: %s\n", toLeft, toRight);
        }
        if (toRight >= toLeft) {
            System.err.printf("[Router]: Will move to left.\n");
            route = toLeft * (-1);
        } else {
            System.err.printf("[Router]: Will move to right.\n");
            route = toRight; //Negative values for left turning
        }
        return route;
    }//End of calculate route

    public void ringMove(int route) {
        System.out.printf("[Motors]: Moving motors by %s steps\n", route);
        //Placeholder for motor moving code
    }
}//End of class
