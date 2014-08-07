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
        int chr = (int) 'a'; //Integer for character, begining at a
        for (int i = 0; i <= 25; i++) {
            symbols[i] = (char) (chr + i);
            //Message for testing
            System.out.println(String.format("Writing character %s to array on pos %s...", (char) (chr + i), i));

        }
        //Fills the character array with number characters
        chr = 48; //Sets the char to zero
        for (int i = 26; i <= 36; i++) {
            symbols[i] = (char)chr;
            chr++;
            //Message for testing
            System.out.println(String.format("Writing character %s to array on pos %s...", (char) (chr + i), i));

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
