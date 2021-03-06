package org.andot.algorithm.sort;

import org.andot.algorithm.common.PrintUtil;

/**
 * 希尔排序(Shell’s Sort)是插入排序的一种，是直接插入排序算法的一种更高版本的改进版本。
 *
 * 把记录按步长gap分组，对每组记录采用直接插入排序方法进行排序；
 * 随着步长逐渐减小，所分成的组包含的记录越来越多；
 * 当步长值减小到1时，整个数据合成一组，构成一组有序记录，完成排序；
 * @author Lucas
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {2, 85, 21, 5, 41, 76, 60, 96, 32, 16, 51};
        shellSort(arr);
        PrintUtil.printArray(arr);
    }

    private static void shellSort (int[] arr) {
        // 设置步长
        for (int step = arr.length / 2; step > 0; step /= 2) {
            // 对一个步长区间进行比较
            for (int i = step; i < arr.length; i++) {
                int value = arr[i];
                int k;
                // 对步长区间中具体的元素进行比较
                for (k = i - step; k >= 0 && arr[k] > value; k -= step) {
                    // j 为左区间的取值， j+step为右区间与左区间的对应值
                    arr[k + step] = arr[k];
                }
                // 此时step为一个负数，[j+step] 为左区间上的初始交换值
                arr[k + step] = value;
            }
        }
    }
}
