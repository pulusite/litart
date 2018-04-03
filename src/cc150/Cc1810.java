package cc150;

import java.util.*;

/**
 * Created by zhangdong on 12/13/17.
 */
public class Cc1810 {
    LinkedList<String> transform(String startWord, String stopWord, Set<String> dictionary){
        startWord=startWord.toUpperCase();
        stopWord=stopWord.toUpperCase();
        Queue<String> actionQueue=new LinkedList<>();
        Set<String> visitedSet=new HashSet<>();

        return null;
    }
    Set<String> getOneEditWords(String word){
        Set<String> words=new TreeSet<>();
        for (int i = 0; i < word.length(); i++) {
            char[] wordArray=word.toCharArray();
            for(char c='A';c<='Z';c++){
                if (c!=word.charAt(i)){
                    wordArray[i]=c;
                    words.add(new String(wordArray));
                }
            }
        }
        return words;
    }

}
