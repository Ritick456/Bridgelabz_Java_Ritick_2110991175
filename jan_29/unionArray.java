package java_29_jan;

import java.util.Arrays;

public class unionArray {

    public static int[] union(int[] arr1, int[] arr2 ){
        int n = arr1.length;
        int m = arr2.length;

        int[] res = new int[n+m];
        
        for(int i=0; i<n; i++) res[i] = arr1[i];

        int k = n-1;
        boolean isduplicate = false;
        for(int i=0; i<m; i++){
            isduplicate = false;
            for(int j=0; j<m; j++){
                if(res[j]==arr2[i]){
                    isduplicate = true;
                    break;
                }
            }
            if(!isduplicate){
                res[k++]= arr2[i];
            }
        }

        int[] finalAns = new int[k];

        for(int i=0; i<finalAns.length; i++) finalAns[i]=res[i];
       


        return finalAns;
    }

    

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,5,5,5};
        int[] arr2 = {6,7,8,9,3,4,5};

        int[] ans = union(arr1,arr2);

        System.out.println(Arrays.toString(ans));

        
      

        


    }
}
