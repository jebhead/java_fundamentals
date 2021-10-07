package labs_examples.input_output.labs;

import java.io.*;

public class Buff_In_Stream_Exer1 {
    public static void main(String[] args) {

        FileInputStream in = null;
        BufferedInputStream bin = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("/Users/jebhead/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/byte_data");
            bin = new BufferedInputStream(in);
            out = new FileOutputStream("/Users/jebhead/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/byte_data_copy.txt");

            byte[] buff = new byte[5];
            int bytesIn = 0;

            while ((bytesIn = bin.read(buff)) != -1) {

                System.out.print(new String(buff, 0, bytesIn));
                out.write(bytesIn);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bin.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

