package sgdialer;

/**
 * Verifies validity of inputed adres
 * @author Malanius
 * @version 0.0
 */
public class Verifier {
    private char symbols[] = new char[38];//Symbols array
    //Consrtructor
    public Verifier(char[] symbols){
        this.symbols = symbols;
        //Testing message
        System.err.print("[Verifier]: Sucessfully obtained symbol array: ");
        String strSymbols = "";
        for (int i = 0; i < this.symbols.length; i++){
            strSymbols += this.symbols[i]; 
        }
        System.err.println(strSymbols);
    }//End of Constructor
}//End of class
