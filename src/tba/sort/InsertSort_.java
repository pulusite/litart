package tba.sort;

/**
 * Created by zhangdong on 8/26/17.
 */
public class InsertSort_ {
    public void insertSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j;
            for(j=i-1;j>=0;j--){
                if (arr[j]>temp) {
                    arr[j+1]=arr[j];
                }else {
                    break;
                }
            }
            arr[j+1]=temp;//把i处的值加入到正确的位置
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
