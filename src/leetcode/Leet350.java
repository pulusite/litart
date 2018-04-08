package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by zhangdong on 12/27/17.
 */
public class Leet350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1==null || nums2==null) return null;
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i]))
                map.put(nums1[i],map.get(nums1[i])+1);
            else map.put(nums1[i],1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                map.put(nums2[i],map.get(nums2[i])-1);
                list.add(nums2[i]);
            }
        }
        int[] res=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i]=list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2};
        Leet350 leet=new Leet350();
        int[] res=leet.intersect(nums1,nums2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
