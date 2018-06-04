package tba.zd_exercise;

/**
 * Created by zhangdong on 6/3/18.
 */
public class QuickSort_ {
    private void quictSort(int[] nums,int low,int high){
        if (low<high){
            int mid=partition(nums,0,nums.length);
            quictSort(nums,0,mid-1);
            quictSort(nums,mid+1,high);
        }
    }

    public int partition(int[] nums,int low,int high){
        int tmp=nums[low];//基准元素
        while (low<high){
            //找到右边比基准元素小的位置
            while (low<high && nums[high]>tmp){
                high--;
            }
            nums[low]=nums[high];
            while (low<high ){

            }
        }
        return 0;
    }
}
