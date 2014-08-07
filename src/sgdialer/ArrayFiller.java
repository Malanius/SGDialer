package sgdialer;

/**
 * Creates the symbol array
 * @author Malanius
 * @version 0.0
 */
class ArrayFiller {

    public char[] symbols = new char[38]; //Symbols array
    private String message; //Output message of operations

    //Constructor
    public ArrayFiller() {
        //Fills the symbols array with alphabet characters
        int chr = (int) 'a'; //Integer for character, begining at a
        for (int i = 0; i <= 25; i++) {
            symbols[i] = (char) (chr + i);
            //Message for testing
            System.out.println(String.format("[Verifier]: Writed character %s to array on pos %s...", (char) (chr + i), i));

        }
        //Fills the character array with number characters
        chr = (int) '0'; //Sets the char to zero
        for (int i = 26; i <= 35; i++) {
            symbols[i] = (char) chr;
            //Message for testing
            System.out.println(String.format("[Verifier]: Writed character %s to array on pos %s...", (char) chr, i));
            chr++;
        }
        symbols[36] = '-';
        symbols[37] = '.';
        System.out.print(String.format("[Verifier]: Created array of %s symbols: ", symbols.length));
        System.out.println(writeSymbols());
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

    private String writeSymbols() {
        String strSymb = "";
        for (int o = 0; o < symbols.length; o++) {
            strSymb += symbols[o];
        }
        return strSymb;
    }

    protected boolean verify() {
        return true;
    }//End of verify
}//End of class