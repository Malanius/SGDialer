package sgdialer;

/**
 *
 * @author Malanius
 * @version 0.0
 */
public class Dialer {
    private int actualPos = 0;
    private char symbols[] = new char[38];//Symbols array
    //Consrtructor
    public Dialer(char[] symbols){
        this.symbols = symbols;
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
            System.err.printf("[Dialer]: Encoding symbol [%s]", adressArray[i]);
            ringMove(calculateRoute(getSymbolPos(adressArray[i])));
        }
    }
    
    private int getSymbolPos(char symb){
        int pos = -1;
        do{
            pos++;
        }while (symbols[pos] == symb);
        System.err.printf("[Dialer]: Found symbol %s at %s position.\n", symb, pos);
        return pos;
    }
    private int calculateRoute(int pos){
        int route;
                
        return route;
    }
    public void ringMove(int route){
        
    }
}//End of class
