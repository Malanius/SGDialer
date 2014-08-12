package sgdialer;

/**
 *
 * @author Malanius
 * @version 0.0
 */
public class Dialer {
    private int actualPos;
    private char symbols[] = new char[38];//Symbols array
    //Consrtructor
    public Dialer(char[] symbols){
        this.symbols = symbols;
        actualPos = 0; //Since gate is restarted on each run
        //Testing message
        System.err.print("[Dialer]: Sucessfully obtained symbol array: ");
        String strSymbols = "";
        for (int i = 0; i < this.symbols.length; i++){
            strSymbols += this.symbols[i]; 
        }
        System.err.println(strSymbols);
    }//End of Constructor
    public void dial(String adress){
        char[] adressArray = adress.toCharArray();
        for (int i = 0; i < adress.length(); i++){
            System.err.printf("[Dialer]: Encoding symbol [%s]\n", adressArray[i]);
            ringMove(calculateRoute(getSymbolPos(adressArray[i])));
        }
    }
    
    private int getSymbolPos(char symb){
        int pos = -1;
        do{
            pos++;
        }while (symbols[pos] != symb);
        System.err.printf("[Dialer]: Found symbol %s at %s position.\n", symb, pos);
        return pos;
    }
    private int calculateRoute(int pos){
        int route = 0;
        int actualToLeftBound = actualPos;
        int actualToRightBound = symbols.length - actualPos;
        int targetToLeftBound = pos;
        int targetToRightBound = symbols.length - pos;
        int routeToLeft = actualToLeftBound - targetToLeftBound;
        System.err.printf("[Dialer]: Route to left is %s\n", routeToLeft);
        int routeToRight = actualToRightBound - targetToRightBound;
        System.err.printf("[Dialer]: Route to right is %s\n", routeToRight);
        if (routeToRight < routeToLeft){
            route = routeToRight;
            System.err.printf("[Dialer]: Will move to right by %s steps.\n", routeToRight);
        }
        else{
            route = routeToLeft * (-1); //Negative output will move motors to left
            System.err.printf("[Dialer]: Will move to left by %s steps.\n", routeToLeft);
        }
        return route;
    }
    public void ringMove(int route){
        System.out.printf("[Dialer]: Moving motors by %s steps\n", route);
    }
}//End of class
