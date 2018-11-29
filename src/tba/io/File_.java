package tba.io;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/**
 * Created by zhangdong on 2018/4/18.
 */
public class File_ {
    public static void main(String[] args) throws Exception{
        System.out.println(new File("").getAbsolutePath());
        String filePath=System.getProperty("user.dir")+File.separator+"resource/";
        String codePath=System.getProperty("user.dir")+File.separator+"src/tba/io/";
        File_ file_=new File_();
        file_.inToFile(filePath);
//        file_.fileToDisplay1();
//        file_.systemInToDisplay();

//        File file=new File(".");
//        System.out.println(file.getAbsolutePath());
//        String[] list=file.list();
//        for(String dirItem : list)
//            System.out.println(dirItem);
    }

    //将标准输入（键盘输入）显示到标准输出（显示器），支持字符。
    @Test
    public void systemInToDisplay(String curPath){
        char ch;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));  //将字节流转为字符流，带缓冲
        try {
            while ((ch = (char) in.read()) != 'c'){
                System.out.print(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //File_.java的内容打印到显示器
    public void fileToDisplay1(String curPath) throws Exception{
        BufferedReader in = new BufferedReader(new FileReader(new File("").getAbsolutePath()+File.separator+"src/tba/io/File_.java"));
        String s;
        try {
            while ((s = in.readLine()) != null){
                System.out.println(s);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void fileToDisplay2(String curPath) throws Exception{
        FileReader in = new FileReader("AtomicityTest.java");
        int b;
        try {
            while ((b = in.read()) != -1){
                System.out.print((char)b);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void fileToDisplay3(String curPath) throws Exception{
        FileInputStream in = new FileInputStream("AtomicityTest.java");
        int n = 50;
        byte[] buffer = new byte[n];
        try {
            while ((in.read(buffer,0,n) != -1 && n > 0)){
                System.out.print(new String(buffer));
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    将文件A的内容拷贝到文件B
    public void fileCopy(String curPath) throws IOException {
        FileInputStream in = new FileInputStream("AtomicityTest.java");
        FileOutputStream out = new FileOutputStream("copy.txt");
        int b;
        while ((b = in.read()) != -1){
            out.write(b);
        }
        out.flush();
        in.close();
        out.close();
    }
    //将标准输入的内容写入文件
    public void inToFile(String curPath) throws IOException {
        Scanner in = new Scanner(System.in);
        FileWriter out = new FileWriter(curPath+ "io/systemIn.log");
        String s;
        while (!(s = in.nextLine()).equals("Q")){
            out.write(s + "\n");
        }
        out.flush();
        out.close();
        in.close();
    }
}
