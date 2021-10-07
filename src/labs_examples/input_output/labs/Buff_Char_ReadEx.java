package labs_examples.input_output.labs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buff_Char_ReadEx {
    /**
     * Input/Output Exercise 2: File encryption
     * <p>
     * -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
     * -For example, change every 'a' to '-' and every 'e' to '~' .
     * -Make sure you close the connections to both files.
     * <p>
     * Then, ead back the encrypted file using the BufferedReader and
     * print out the unencrypted version. Does it match the original file?
     */

    public static void main(String args[]) throws IOException {

        int i;

        String fileReadPath = "src/labs_examples/input_output/files/char_data.txt";
        String fileWritePath = "src/labs_examples/input_output/files/char_data_re_rewrite.txt";

        FileInputStream fin = null;
        FileOutputStream fout = null;

        // Copy a File.
        try {
            // Attempt to open the files.
            fin = new FileInputStream(fileReadPath);
            fout = new FileOutputStream(fileWritePath);

            do {
                i = fin.read();
                if (i != -1)
                    if ((char) i == 'u')
                            i = '3';
                    if ((char) i == 'o')
                        i = '6';
                    if ((char) i == 's')
                        i = '7';
                    if ((char) i == 'A')
                        i = '#';
                    if ((char) i == 'e')
                        i = '%';

                System.out.print((char) i);
                fout.write(i);

            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException exc) {
                System.out.println("Error Closing Input File");
            }
            try {
                if (fout != null) {
                    fout.close();
                }
            } catch (IOException exc) {
                System.out.println("Error Closing Output File");
            }
        }
    }
}

