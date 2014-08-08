package sgdialer;

import java.util.Scanner;

/**
 *
 * @author Malanius
 * @version 0.0
 */
public class SGDialer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Testing message
        System.err.println("[Main]: Creating array filler.");
        ArrayFiller symbolArray = new ArrayFiller();
        //Test message
        System.err.println("[Main]: Creating verifier.");
        Verifier verifier = new Verifier(symbolArray.getSymbols());
        //Test message
        System.err.println("[Main]: Creatig dialer.");
        Dialer dialer = new Dialer(symbolArray.getSymbols());
        //Test message
        System.err.println("[Main]: Creating scanner.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the dialing computer. Please note that valid symbols are: " + symbolArray.writeSymbols());
        System.out.println("The point of origin symbol is \"#\"");
        System.out.print("Insert adress to dial: ");
        String adress = sc.nextLine();
        if (adress.equals("exit")) {//Exit command chceck
            System.err.println("[Main]: Recevied shutdown command...");
            System.out.println("Terminating dial program...");
            System.exit(0);
        } else {//No exit command recevied
            //Verify adress
            if (verifier.verify(adress)) {//Correct adress is dialed
                System.out.println("Dialing " + adress);
                dialer.dial(adress);
            } else {//Verify chcek fail
                System.out.println("Invalid adres input.");
                System.err.println("[Main]: Resseting program...");
                main(null);//Restart the program
            }
        }

    }//End of main

    public void writeMessage(String message) {
        System.out.println(message);
    }
}//End of class
