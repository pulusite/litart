package tba.zd_exercise;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangdong on 6/3/18.
 */
public class HeapSort_ {

     class Heap {

        private List<Integer> A;

        private int heapSize;

        public List<Integer> getA() {
            return A;
        }

        public void setA(List<Integer> a) {
            A = a;
        }

        public int getHeapSize() {
            return heapSize;
        }

        public void setHeapSize(int heapSize) {
            this.heapSize = heapSize;
        }

    }
    // 左节点下标
    public int left(int i) {
        return i * 2 + 1;
    }

    // 右节点下标
    public int right(int i) {
        return i * 2 + 2;
    }

    // 父节点下标
    public int parent(int i) {
        return (i - 1) / 2;
    }

    /**
     * 递归实现的堆排序
     * @param heap 堆
     * @param i 当前坐标
     */
    public void MaxHeapify(Heap heap, int i) {
        int l = left(i);
        int r = right(i);
        int largest = i;
        if (l < heap.getHeapSize() && heap.getA().get(l) > heap.getA().get(i)) {
            largest = l;
        }
        if (r < heap.getHeapSize() && heap.getA().get(r) > heap.getA().get(largest)) {
            largest = r;
        }
        if (largest != i) {
            int temp = heap.getA().get(i);
            heap.getA().set(i, heap.getA().get(largest));
            heap.getA().set(largest, temp);
        } else
            return;
        MaxHeapify(heap, largest);
    }

    /**
     * 非递归实现的堆排序
     * @param heap 堆
     * @param i 当前坐标
     */
    public void MaxHeapifyNoRecursive(Heap heap, int i) {
        while (true) {
            int l = left(i);
            int r = right(i);
            int heapSize = heap.getHeapSize();
            List<Integer> A = heap.getA();
            int largest = i;
            if (l < heapSize && A.get(l) > A.get(i)) {
                largest = l;
            }
            if (r < heapSize && A.get(r) > A.get(largest)) {
                largest = r;
            }
            if (largest != i) {
                int temp = A.get(i);
                A.set(i, A.get(largest));
                A.set(largest, temp);
            } else
                return;
            i = largest;
        }
    }

    /**
     * 构建最大堆
     * @param heap 堆
     */
    public void BuildMaxHeap(Heap heap) {
        int heapsize = heap.getHeapSize();
        for (int i = (heapsize - 1) / 2; i>= 0; i--) {
            MaxHeapify(heap, i);
        }
    }

    /**
     * 堆排序算法
     * @param heap 堆
     */
    public void heapSort(Heap heap) {
        BuildMaxHeap(heap);
        int length = heap.getA().size(), heapSize = heap.getHeapSize();
        for (int i = length - 1; i > 0; i--) {
            int temp = heap.getA().get(i);
            heap.getA().set(i, heap.getA().get(0));
            heap.getA().set(0,temp);
            heap.setHeapSize(--heapSize);
            MaxHeapify(heap, 0);
        }
    }

    @Test
    public void test(){
        int[] nums={8,3,9,5,0,6,4,1,2,7};
        List list=Arrays.asList(nums);
        Heap heap=new Heap();
        heap.setA(list);
        heapSort(heap);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        for (int i = 0; i < heap.getA().size(); i++) {
            System.out.print(heap.getA().get(i)+" ");
        }
    }
}
