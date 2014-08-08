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
                if (this.checkRepeat(adress) == 7){
                    System.err.println("Corect adress recevied.");
                    return true;
                }
                else{
                    System.err.println("[Verifier]: Repeating symbols detected.");
                    return false;
                }
            } else { //POO chcek fail
                System.err.println(String.format("[Verifier]: Invalid point of origin: %s", adress.charAt(6)));
                return false;
            }//End of POO chceck
        } else {//Lengh chcek fail
            //Testing message
            System.err.println(String.format("[Verifier]: Invalid adress lenght detected: %s symbols.", adress.length()));
            return false;
        }//End of lengh chceck
    }//End of verify

    private int checkRepeat(String adress) {
        //FIXME polish the repeat check, for now repeat = 7 means correct input as the each uniqe symbol finds itself...
        int repeat = 0;
        for (int i = 0; i < 7; i++) {
            for (int o = 0; o < 7; o++){
                if(adress.charAt(i) == adress.charAt(o)){
                    repeat++;
                }
            }
        }
        return repeat;
    }
}//End of class
