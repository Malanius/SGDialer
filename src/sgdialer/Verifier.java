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
        return (checkLenght(adress) && checkPOO(adress) && checkRepeat(adress));
    }//End of verify

    private boolean checkLenght(String adress) {
        if (adress.length() == 7) {
            System.err.println("[Verifier]: Correct adress lenght.");
            return true;
        } else {
            System.err.println(String.format("[Verifier]: Invalid adress lenght detected: %s symbols.", adress.length()));
            return false;
        }
    }//End of chceck lenght

    private boolean checkPOO(String adress) {
        if (adress.endsWith("#")) {
            System.err.println("[Verifier]: Valid point of origin specified.");
            return true;
        } else {
            System.err.println("[Verifier]: Invalid point of origin specified!");
            return false;
        }
    }//End of  checkPOO

    private boolean checkRepeat(String adress) {
        //FIXME polish the repeat check, for now repeat == 7 means correct input as the each uniqe symbol finds itself...
        int repeat = 0;
        for (int i = 0; i < 7; i++) {
            for (int o = 0; o < 7; o++) {
                if (adress.charAt(i) == adress.charAt(o)) {
                    repeat++;
                }
            }
        }
        if (repeat == 7){
            System.err.println("[Verifier]: Each symbol is uniqe.");
            return true;
        }
        else{
            System.err.println("[Verifier]: Repeating symbols detected.");
            return false;
        }
    }//End of chcech repeat
}//End of class
