package tba.mianshi;

/**
 * Created by zhangdong on 6/4/18.
 */
public class ReverseWord {
    public void reverseSentence(String sentence){
        if(sentence == null)
            return;
        String sentenceReverse = reverse(sentence);
        String[] splitStrings = sentenceReverse.split(" ");
        String resultBuffer = "";
        System.out.println();
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
