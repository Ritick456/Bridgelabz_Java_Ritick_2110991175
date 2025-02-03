package java_29_jan;

import java.util.Arrays;

public class frequency {

    public static int[] findfrequency(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int x : arr)
            max = Math.max(x, max);
        int[] frequencyArray = new int[max + 1];

        for (int i = 0; i < n; i++) {
            frequencyArray[arr[i]]++;
        }
        int count = 0;
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] != 0) {
                System.out.println(i + " frequency is " + frequencyArray[i]);
            } else {
                count++;

            }
        }
        int[] ans = new int[frequencyArray.length - count];
        int k = 0;
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] != 0) {

                ans[k++] = frequencyArray[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 0, 3, 5, 7, 6, 2, 1, 7, 9, 0, 7, 6, 5, 4, 1, 2, 22 };
        System.out.println(Arrays.toString(findfrequency(arr)));
    }
}
