package tba.mianshi;

import org.junit.Test;

/**
 * Created by zhangdong on 2018/6/5.
 *题目一：输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串为“I am a Student.",则输出为”Student. a am i".
 * 翻转单词的顺序VS左旋转单词的顺序
 */
public class ReverseWordsInSentence {
    @Test
    public void test(){
        System.out.println(reverseWord("   I am a Student."));
    }

    public String reverseWord(String s){
        String[] strings=s.split(" ");
        StringBuilder res=new StringBuilder();
        for (int i = strings.length-1; i >= 0; i--) {
            if (i!=0){
                res.append(strings[i]+" ");
            }else {
                res.append(strings[i]);
            }
        }
        return res.toString();
    }

    public void reverseSentence(String sentence){
        if(sentence == null)
            return;
        String sentenceReverse = reverse(sentence);
        String[] splitStrings = sentenceReverse.split(" ");
        String resultBuffer = "";
        for(String s:splitStrings)
            resultBuffer = resultBuffer+reverse(s)+" ";
        System.out.println(resultBuffer);
    }

    public String reverse(String str){
        char[] array = str.toCharArray();
        for(int i = 0;i<(array.length)/2;i++){
            char temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-i-1]=temp;
        }
        return String.valueOf(array);
    }
}
/**
 *
 * 题目二：字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转的功能。比如输入字符串”abcdefg"和数字2,该函数将返回左旋转2位得到的结果“cdefgab"
 *
 * **/
class E42LeftRotateString {
    public String reverse(String str){
        char[] arr = str.toCharArray();
        for(int i = 0;i<(arr.length+1)/2;i++){
            char temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1]= temp;
        }
        return String.valueOf(arr);
    }
    public void leftRotateString(String sentence,int index){
        if(sentence == null || index >sentence.length() || index <0)
            return;
        String[] splitStrings = {sentence.substring(0, index),sentence.substring(index, sentence.length())};
        String resultBuffer = "";
        for(int i =0;i<splitStrings.length;i++){
            splitStrings[i] =reverse(splitStrings[i]);
            resultBuffer+=splitStrings[i];
        }

        System.out.println(reverse(resultBuffer));
    }
    public static void main(String[] args){
        String str= "abcdefg";
        E42LeftRotateString test = new E42LeftRotateString();
        test.leftRotateString(str, 2);
    }
}