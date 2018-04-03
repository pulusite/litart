package tba.sort;

/**
 * Created by zhangdong on 2017/12/25.
 */
public class BinaryInsertSort_ {
    public void binaryInsertSort(int[] nums){
        int left,right,num;
        int middle,j,i;
        int n=nums.length;
        for(i = 1; i < n; i++)
        {
            left = 0;// 准备
            right = i-1;
            num = nums[i];
            while( right >= left)// 二分法查找插入位置
            {
                middle = ( left + right ) / 2; //　指向已排序好的中间位置
                if( num < nums[middle] )// 即将插入的元素应当在在左区间
                    right = middle-1;
                else                    //　即将插入的元素应当在右区间
                    left = middle+1;
            }
    //每次查找完毕后，left总比right大一，a[left]总是存放第一个比num大的数，因此应从此处开始，每个元素右移一位，并将num存入a[left]中，这样就保证了a[0...i]是排好序的
            for( j = i-1; j >= left; j-- ) //　后移排序码大于R[i]的记录
                nums[j+1] = nums[j];
            nums[left] = num;// 插入
        }
    }

    public static void main(String[] args) {
        BinaryInsertSort_ bis = new BinaryInsertSort_();
        int[] arr = {8,3,9,5,0,6,4,1,2,7};
        bis.binaryInsertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
