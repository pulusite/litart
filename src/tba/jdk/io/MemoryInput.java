package tba.jdk.io;

import java.io.StringReader;

/**chmod 777 *.*
 * Created by dongzhang on 5/21/17.
 */
public class MemoryInput {
    public static void main(String[] args) throws Exception{
        StringReader in = new StringReader(BufferedReader_.read(System.getProperty("user.dir")+"/src/tba/io/MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1){
            System.out.print((char)c);
        }
    }
}
