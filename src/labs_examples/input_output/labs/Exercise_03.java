package labs_examples.input_output.labs;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Input/Output Exercise 3: variety
 * <p>
 * 1) Demonstrate the usage of at least two additional Byte Streams
 * 2) Demonstrate the usage of at least two additional Character Streams
 * 3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 * 4) Demonstrate the use of the DataInputStream and DataOutputStream
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int c;

        try (FileInputStream fin = new FileInputStream("src/labs_examples/input_output/files/KtoD.txt")) {

            while ((c = fin.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
        System.out.println();

        try (FileInputStream ofin = new FileInputStream("src/labs_examples/input_output/files/KtoD.txt")) {

            while ((c = ofin.read()) != -1) {
                c++;
                System.out.print((char) c);
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}

