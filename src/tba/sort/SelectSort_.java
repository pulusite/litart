package tba.sort;

/**
 * Created by zhangdong on 2017/12/25.
 */
public class SelectSort_ {
    public void selectSort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            int min=nums[i];
            int index=0;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j]<min){
                    min=nums[j];
                    index=j;
                }
            }
            nums[index]=nums[i];
            nums[i]=min;
        }
    }

    public static void main(String[] args) {
        SelectSort_ ss = new SelectSort_();
        int[] arr = {8,3,9,5,0,6,4,1,2,7};
        ss.selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
