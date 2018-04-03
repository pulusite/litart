package tba.sort;

/**
 * Created by zhangdong on 2017/12/25.
 */
public class HeapSort_ {
    private static void heapSort(int[] arr){
        for (int i = arr.length/2; i >=0; i--) {
            heapAdjust(arr,i,arr.length);
        }
        for (int i =arr.length-1; i >0; i--) {
            swap(arr,0,i);
            heapAdjust(arr,0,i);
        }
    }
    private static void heapAdjust(int[] arr,int i,int n){
        int child;
        int father;
        for (father = arr[i]; leftChild(i) < n; i=child) {
            child=leftChild(i);
            //
            if (child!=n-1&&arr[child]<arr[child+1]){
                child++;
            }
            if (father<arr[child]){
                arr[i]=arr[child];
            }else{
                break;
            }
        }
        arr[i]=father;
    }
    private static int leftChild(int i){
        return 2*i+1;
    }
    private static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
