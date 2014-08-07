package sgdialer;

/**
 *
 * @author Malanius
 * @version 0.0
 */
public class Dialer {
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
}//End of class
