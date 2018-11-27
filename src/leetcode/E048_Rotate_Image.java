package leetcode;

import org.junit.Test;

/**
 * Created by zhangdong on 9/18/18.
 */
public class E048_Rotate_Image {

    public void rotate(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = i; j<matrix[0].length; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i =0 ; i<matrix.length; i++){
            for(int j = 0; j<matrix.length/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }

    @Test
    public void test(){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrix.length);

        rotate(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        }


        //第一种方式：
        int a[][]={{1,2,3},{4,5,6}};

        //第二种方式；
        int[][] ints = new int[4][2];
//        ints[i][j] =__; //分别赋值

        //第三种方式：第二维的长度可以动态申请
        int[][] arr3 = new int[5][];//五行的长度
        for(int i=0; i<arr3.length; ++i){
            arr3[i]=new int[i+1];   //列的长度每次都变化。每次都要重新申请空间(长度)
            for(int j=0; j<arr3[i].length; ++j)
                arr3[i][j]= i+j;
        }
    }
}
