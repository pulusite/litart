package tba.io;

import java.io.*;

/**
 * Created by zhangdong on 2018/4/8.
 */
public class InputStreamAnalyze {
    public static void main(String[] args) throws Exception{
        String curDir=System.getProperty("user.dir");
        //FileInputStream
        InputStream iss=InputStreamAnalyze.class.getClassLoader().getResourceAsStream("io.txt");
        InputStream fin = new FileInputStream(curDir+File.separator+"resource"+File.separator+"io.txt");

        File f = new File("io.txt");
        InputStream out = new FileInputStream(f);
        //ByteArrayInputStream
        //DataInputStream

        //FileOutputStream
        OutputStream fout = new FileOutputStream("io.txt");

        OutputStream fileOutputStream = new FileOutputStream(f);


        try{
            byte bWrite [] = {11,21,3,40,5};
            OutputStream os = new FileOutputStream("test.txt");
            for(int x=0; x < bWrite.length ; x++){
                os.write( bWrite[x] ); // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for(int i=0; i< size; i++){
                System.out.print((char)is.read() + "  ");
            }
            is.close();
        }catch(IOException e){
            System.out.print("Exception");
        }

    }
}
