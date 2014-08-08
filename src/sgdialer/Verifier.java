package sgdialer;

/**
 * Verifies validity of inputed adres
 *
 * @author Malanius
 * @version 0.0
 */
public class Verifier {

    private char symbols[] = new char[38];//Symbols array
    //Consrtructor

    public Verifier(char[] symbols) {
        this.symbols = symbols;
        //Testing message
        System.err.print("[Verifier]: Sucessfully obtained symbol array: ");
        String strSymbols = "";
        for (int i = 0; i < this.symbols.length; i++) {
            strSymbols += this.symbols[i];
        }
        System.err.println(strSymbols);
    }//End of Constructor

    public boolean verify(String adress) {
        //Lenght check - curently only 7 symbol adresses accepted
        if (adress.length() == 7) {
            //Point ot orogin chceck # is only valid
            if (adress.endsWith("#")) {
                return true;
            } else { //POO chcek fail
                System.err.println(String.format("[Verifier]: Invalid point of origin: %s", adress.charAt(6)));
                return false;
            }//End of POO chceck
        } else {//Lengh chcek fail
            //Testing message
            System.err.println(String.format("[Verifier]: Invalid adress lenght detected: %s symbols.", adress.length()));
            return false;
        }//End of lengh chceck
    }
}//End of class
