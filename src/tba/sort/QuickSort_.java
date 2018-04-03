package tba.sort;

/**
 * Created by dongzhang on 7/6/17.
 */
public class QuickSort_ {
    public static void quickSort(int[] arr,int low,int high){
        if (low<high){
            int privot=partition(arr,low,high);//将数组分为两部分
            quickSort(arr,low,privot-1);//递归排序左子数组
            quickSort(arr,privot+1,high);//递归排序右子数组
        }
    }
    private static int partition(int[] arr,int low,int high){
        int privot=arr[low];//枢轴记录
        while (low<high){
            while (low<high && arr[high]>=privot) --high;
            arr[low]=arr[high];
            while (low<high && arr[low]<=privot) ++low;
            arr[high]=arr[low];
        }
        arr[low]=privot;
        return low;
    }

    private static void quick(int[] a) {
        if(a.length>0){
            quickSort(a,0,a.length-1);
        }
    }
    public static void main(String[] args) {
        int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1,8};
        System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        //快速排序
        quick(a);
        System.out.println();
        System.out.println("排序之后：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
