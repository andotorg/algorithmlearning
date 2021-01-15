package org.andot.algorithm.sort;

import org.andot.algorithm.common.PrintUtil;

/**
 * 快速排序
 * @author Lucas
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 85, 21, 5, 41, 76, 60, 96, 32, 16, 51, 35};
        quicksort(arr, 0, arr.length-1);

        PrintUtil.printArray(arr);
    }

    /**
     * 1、先输入开始节点到结束节点
     * 2、判断如果开始节点大于等于结束节点话，则直接停止递归循环
     * 3、定义基准值，默认是从左侧未排序的开始节点设置为基准值
     * 4、如果当前移动的开始位置小于结束位置则进行继续移动比较
     * 5、按照基准值为标准切割的左右两部分，也需要依次进行移动进行，
     *      在移动的时候，判断先从右侧结束值，往开始方向移动，当前移动的值大于等于基准值的时候，说明，该值不需要放在基准值的左侧，所以执行j--, 意义在于跳过该值，如果不需要--了，则会执行下一步
     *      然后从左侧开始值，往结束方向移动，当前移动的值小于等于基准值的时候，说明，该值不需要放在基准值的右侧，所以执行i++, 意义在于跳过该值，如果不需要++了，则会执行，下一步
     * 6、通过上面，左右值移动，得到最终左侧需要放在右侧的右侧需要放在左侧的，直接就可以相互互换位置即可
     * 7、然后互换之后，需要把基准值的位置放入新的基准值的值，把新的基准值的值，放入旧的基准值的值
     * 8、根据旧基准值分为的两段，每段再分开，然后进行再次循环，到第2步，直到结束
     * @param arr
     * @param left
     * @param right
     */
    public static void quicksort(int[] arr, int left, int right){
        if(left >= right) {
            return;
        }
        int i = left; int j = right;
        int key = arr[left];
        while(i<j) {
            while(arr[j] >= key && i < j) {
                j--;
            }

            while (arr[i] <= key && i < j) {
                i++;
            }

            if( i < j ) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[left] = arr[i];
        arr[i] = key;
        quicksort(arr, left, i-1);
        quicksort(arr, i+1, right);
    }
}
