package sgdialer;

/**
 *
 * @author Malanius
 * @version 0.0
 */
class Verifier {

    private char[] symbols; //Symbols array
    private String message; //Output message of operations

    //Constructor
    public Verifier() {
        symbols = new char[38];
        //Fills the symbols array with alphabet characters
        int a = (int) 'a'; //Get the ASCII number for a
        int z = (int) 'z'; //Get the ASCII number for z
        int chr = (int) 'a'; //Integer for character, begining at a
        for (int i = 0; i <= (z - a); i++) {
            //Message for testing
            System.out.println(String.format("Writing character %s to array...", (char) (chr + i)));
            symbols[i] = (char)(chr + i);
        }
        //Fills the character array with number characters
        int zero = (int)'0';
        int nine = (int)'9';
        chr = zero; //Setss the char to zero
        for (int i = (z-a); i <= (z - a +9); i++){
            //Message for testing
            System.out.println(String.format("Writing character %s to array...", (char) (chr + i)));
        }
    }//Constructor end

    /**
     * @return the symbols
     */
    public char[] getSymbols() {
        return symbols;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    protected boolean verify() {
        return true;
    }//End of verify
}//End of class
