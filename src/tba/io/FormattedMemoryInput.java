package tba.io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;

/**
 * Created by dongzhang on 5/21/17.
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws Exception{
        try{
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedReader_.read(
                                    System.getProperty("user.dir")+"/src/cc/io/FormattedMemoryInput.java").getBytes()));
            while (true)
                System.err.print((char)in.readByte());
        }catch (EOFException e){
            System.err.println("End of stream");
        }


    }
}
