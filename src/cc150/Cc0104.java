package cc150;

/**
 * Created by zhangdong on 2017/12/14.
 *
 * 空格替换为20%
 * lenth为字符串中的末尾
 */
public class Cc0104 {
    public void replaceSpaces(char[] str,int length){
        int spaceCount=0,newLength,i;
        for (i = 0; i < str.length; i++) {
            if (str[i]==' '){
                spaceCount++;
            }
        }
        newLength=length+spaceCount*2;
        str[newLength]='\0';
        for (i = length-1; i >=0 ; i--) {
            if (str[i]==' '){
                str[newLength-1]='0';
                str[newLength-2]='2';
                str[newLength-3]='%';
                newLength=newLength-3;
            }else {
                str[newLength-1]=str[length];
                newLength=newLength-1;
            }
        }
    }
}
