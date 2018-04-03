package tba.sort;

/**
 * Created by zhangdong on 8/26/17.
 */
public class InsertSort_ {
    public void insertSort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if (nums[j+1]<nums[j]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }else {
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        InsertSort_ is = new InsertSort_();
        int[] arr = {8,3,9,5,0,6,4,1,2,7};
        is.insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

//    public void insertSort(int[] arr){
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = i-1; j >=0; j--) {
//                if (arr[j+1]<arr[j]){
//                    int temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//    }
