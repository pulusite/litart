package tba.mianshi.sort;

/**
 * Created by zhangdong on 8/26/17.
 */
public class InsertSort_ {
    public void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;//把i处的值加入到正确的位置
        }
    }

    public static void halfSort(int a[]) {
        int start;
        int end;
        int temp = 0;
        int mid, j;

        for (int i = 1; i < a.length; i++) {
            start = 0;
            end = i - 1;
            temp = a[i];

            while (start <= end) {
                mid = (start + end) / 2;
                if (temp < a[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            //while循环完后，start=end+1,此时start为当前插入数字所待坑位！
            //把坑位给当前插入的数据挪出来
            for (j = i - 1; j >= start; j--) {
                a[j + 1] = a[j];
            }
            //将当前插入数字挪入它该待的坑位
            a[start] = temp;
        }
    }

    public static void main(String[] args) {
        InsertSort_ is = new InsertSort_();
        int[] arr = {8, 3, 9, 5, 0, 6, 4, 1, 2, 7};
        is.insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
