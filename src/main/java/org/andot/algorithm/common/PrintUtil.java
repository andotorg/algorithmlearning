package org.andot.algorithm.common;

/**
 * 打印工具
 * @author Lucas
 */
public class PrintUtil {
    private PrintUtil () {}

    /**
     *
     * @param arr
     */
    public static void printArray(int[] arr) {
        System.err.print("数组：{ ");
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i]);
            if (i != arr.length - 1) {
                System.err.print(", ");
            }
        }
        System.err.println(" }");
    }
}
