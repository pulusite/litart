package tba.io;

import java.io.*;

/**
 * Created by dongzhang on 5/21/17.
 */
public class FileOutput {
    static String file = "FileOutput.out";

    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new StringReader(BufferedReader_.read("")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null){
            out.println(lineCount++ +":" +s);
        }
        out.close();
        System.out.println(BufferedReader_.read(file));
    }
}
