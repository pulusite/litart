package google;

/**
 * Created by zhangdong on 2017/11/2.
 * Given a string, find the length of the longest substring T that contains at most k distinct characters.
 * For example, Given s = “eceba” and k = 2,
 * T is "ece" which its length is 3.
 */
public class Leet340_ {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (s == null) return 0;
        int from = 0;
        int[] histogram = new int[256];
        int distinct = 0;
        char[] sa = s.toCharArray();
        int max = 0;
        for(int i=0; i<sa.length; i++) {
            if (histogram[sa[i]] == 0) distinct ++;
            histogram[sa[i]] ++;
            while (distinct > k) {
                histogram[sa[from]] --;
                if (histogram[sa[from]] == 0) distinct --;
                from ++;
            }
            max = Math.max(max, i-from+1);
        }
        return max;
    }
}
