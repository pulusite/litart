package tba.mianshi.sort;

import org.junit.Test;

/**
 * Created by zhangdong on 2017/12/26.
 */
public class MergeSort_ {
    public void merge(int[] nums,int low,int mid,int high){
        int[] tmp=new int[high-low+1];// 申请一个辅助数组
        int i=low,j=mid+1,k=0;
        while (i<=mid && j<=high){
            if (nums[i]<=nums[j]){
                tmp[k++]=nums[i++];
            }else {
                tmp[k++]=nums[j++];
            }
        }
        while (i<=mid){
            tmp[k++]=nums[i++];
        }
        while (j<=high){
            tmp[k++]=nums[j++];
        }
        for (i=low,k=0; i<=high; i++) {
            nums[i]=tmp[k++];
        }
    }

    public void mergeSort(int[] nums,int low,int high){
        if (low<high){
            int mid=(low+high)/2;
            mergeSort(nums,low,mid);//对nums[low:mid]中的元素合并排序
            mergeSort(nums,mid+1,high);//对nums[mid+1,high]中的元素合并排序
            merge(nums,low,mid,high);//合并操作
        }
    }

//    public int[] merge(int[] nums1,int[] nums2){
//        int len1=nums1.length-1,len2=nums2.length-1;
//        int[] res=new int[len1+len2+2];
//        int index1=0,index2=0,index=0;
//        while (index1<len1 && index2<len2){
//            if (nums1[index1] <= nums2[index2]) {
//                res[index++]=nums1[index1++];
//            }else {
//                res[index++]=nums2[index2++];
//            }
//        }
//        while (index1<len1){
//            res[index++]=nums1[index1++];
//        }
//        while (index2<len2){
//            res[index++]=nums2[index2++];
//        }
//        return res;
//    }

    @Test
    public void test(){
        int[] nums = {8, 3, 9, 5, 0, 6, 4, 1, 2, 7};
        mergeSort(nums,0,nums.length-1);
        for (int i = 0; i < nums.length-1; i++) {
            System.out.print(nums[i]+" ");
        }
//        int[] nums1={1,3,7,9};
//        int[] nums2={2,3,4,6,7,8};
//        int[] res=merge(nums1,nums2);
//        for (int i = 0; i < res.length; i++) {
//            System.out.print(res[i]+" ");
//        }
    }
}
