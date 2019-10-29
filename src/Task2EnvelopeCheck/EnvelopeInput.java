package Task2EnvelopeCheck;
import java.util.Scanner;

public class EnvelopeInput extends Envelope{
String wrongInputNotAPositiveNumber = "The input was wrong,- positive number was expected";
String wrongInputNotANumber = "The input was wrong,- number was expected";
String wrongInputNotDouble = "The input was wrong,- double was expected";

    Scanner input = new Scanner(System.in);

    protected void getParameters() {
        try {
            System.out.println("Input Envelope 1 side 1: ");
            setEnvelope1side1(input.nextDouble());
            System.out.println("Input Envelope 1 side 2: ");
            setEnvelope1side2(input.nextDouble());
//            System.out.println("Input Envelope 2 side 1: ");
//            setEnvelope2side1(input.nextDouble());
//            System.out.println("Input Envelope 2 side 2: ");
//            setEnvelope2side2(input.nextDouble());
        }catch (Exception ex) { //why it doesn't work with InputMismatchException?
            System.out.println(wrongInputNotANumber);
        }
    }

}
