package jan_31_2025;

public class zigzagOrder {

    public static void merge(int[] ans , int[] arr1, int[] arr2){

        int i = 0;
        int j = 0;

        int k =0;
        while(i<arr1.length && j<arr2.length){
            ans[k++] = arr1[i];
            ans[k++] = arr2[j];
            i++;
            j++;
        }

        while(i<arr1.length){
            ans[k++] = arr1[i];
            i++;
        }

        while(j<arr2.length){
            ans[k++] = arr2[j];
            j++;
        }


    }
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        int[] ans = new int[arr1.length + arr2.length];

        merge(ans, arr1, arr2);

        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }

        
    }
}
