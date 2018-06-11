package tba.mianshi.suanfa;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangdong on 2018/6/5.
 */
public class RemoveArrayRepeat {

    @Test
    public void test(){
        int[] nums={8, 3, 9, 5, 0, 6, 4, 1, 2, 7,3,5,0,8};
        for (int i = 0; i < removeRepeat(nums); i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public int removeRepeat(int[] nums){
        int len=nums.length;
        boolean[] booleans=new boolean[len];
        Map<Integer,Boolean> map=new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.get(nums[i])==null){
                map.put(nums[i],true);
                booleans[i]=true;
            }else {
                booleans[i]=false;
            }
        }
        int index=0;
        for (int i = 0; i < len; i++) {
            if (booleans[i]){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}
