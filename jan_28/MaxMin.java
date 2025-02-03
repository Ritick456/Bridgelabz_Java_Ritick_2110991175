package jan_28;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            mini = Math.min(mini, arr[i]);
            if(mini > arr[i]){
                mini = arr[i];
            }
            if(maxi < arr[i]){
                maxi = arr[i];
            }
        }
        
        System.out.println("The minimum value is -> " + mini);
        System.out.println("The maximum value is -> " + maxi);

    }
}
