package google;

import java.util.List;

/**
 * Created by zhangdong on 2017/11/2.
 * Given a set of n strings arr[], find the smallest string that contains each string in the given set as substring. We may assume that no string in arr[] is substring of another string.
 * <p>
 * Examples:
 * Input:  arr[] = {"geeks", "quiz", "for"}
 * Output: geeksquizfor
 * <p>
 * Input:  arr[] = {"catg", "ctaagt", "gcta", "ttca", "atgcatc"}
 * Output: gctaagttcatgcatc
 */
public class ShortestSuperstring_ {
    public String findShortestSuperstring(String[] arrStr) {
        String result=arrStr[0];
        for (int i = 1; i < arrStr.length; i++) {
            if (result.startsWith(arrStr[i])){

            }
        }

        return null;
    }
}
