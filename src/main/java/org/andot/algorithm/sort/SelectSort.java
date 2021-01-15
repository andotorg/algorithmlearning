package org.andot.algorithm.sort;

/**
 * 选择排序
 *
 * @author Lucas
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {1, 23, 53, 23, 21, 4, 7, 5, 8};
        // 第i次排序
        for (int i = 0; i < arr.length -1; i++) {
            int k = i;
            // 选最小的值
            for (int j = k+1; j < arr.length; j++) {
                if (arr[j] < arr[k]) {
                    // 记下目前找到最小值的位置
                    k = j;
                }
            }
            // 在内层循环结束，也就是找到本轮循环最小的数以后，再进行交换
            if (i != k) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }

        System.err.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + ", ");
        }
        System.err.print("}");
    }
}
