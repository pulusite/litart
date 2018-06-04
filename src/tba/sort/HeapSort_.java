package tba.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by zhangdong on 2017/12/25.
 * Parent(i)  return (i-1)/2
 * Left(i）  rerutn 2i+1
 * Right(i)  return 2i+2
 */
public class HeapSort_ {
    private void heapSort(int[] nums) {
        int len=nums.length;
        //循环建堆
        for(int i=0;i<len-1;i++){
            //建堆
            buildMaxHeap(nums,len-1-i);
            //交换堆顶和最后一个元素
            swap(nums,0,len-1-i);
            System.out.println(Arrays.toString(nums));
        }
    }

    private void buildMaxHeap(int[] nums,int lastIndex){
        for (int i = (lastIndex-1)/2; i >= 0; i--) {  //从第中间结点开始
            //k保存正在判断的节点
            int k=i;
            //如果当前k节点的子节点存在
            while(k*2+1<=lastIndex){
                //k节点的左子节点的索引
                int biggerIndex=2*k+1;
                //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在
                if(biggerIndex<lastIndex){
                    //若果右子节点的值较大
                    if(nums[biggerIndex]<nums[biggerIndex+1]){
                        //biggerIndex总是记录较大子节点的索引
                        biggerIndex++;
                    }
                }
                //如果k节点的值小于其较大的子节点的值
                if(nums[k]<nums[biggerIndex]){
                    //交换他们
                    swap(nums,k,biggerIndex);
                    //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值
                    k=biggerIndex;
                }else{
                    break;
                }
            }
        }
    }

    private int leftChild(int i) {
        return 2 * i + 1;
    }

    private int rightChild(int i) {
        return 2 * i + 2;
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    @Test
    public void test() {
        int[] nums = {8, 3, 9, 5, 0, 6, 4, 1, 2, 7};
        heapSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
