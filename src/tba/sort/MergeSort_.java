package tba.sort;

import org.junit.Test;

/**
 * Created by zhangdong on 2017/12/26.
 */
public class MergeSort_ {
    public int[] merge(int[] nums1,int[] nums2){
        int len1=nums1.length,len2=nums2.length;
        int[] res=new int[len1+len2];
        int index1=0,index2=0,index=0;
        while (index1<len1 && index2<len2){
            while (nums1[index1] <= nums2[index2]) {
                res[index++]=nums1[index1++];
            }
            while (nums1[index1]>nums2[index2]){
                res[index++]=nums2[index2++];
            }
        }

        return res;
    }

    @Test
    public void test(){
        int[] nums1={1,3,7,9};
        int[] nums2={2,3,4,6,7,8};
        int[] res=merge(nums1,nums2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
