package jan_31_2025;

public class moveZeros {
    public static void main(String[] args) {

        int[] arr = {1,2,0,3,0};


        int j = 1;
        int i = 0;

        while(j<arr.length){
            if(arr[i] == 0){
                i++;
                continue;
            }
            if(j == i){
                j++;
                continue;
            }
            if(arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }

        for(int k=0; k<arr.length; k++){
            System.out.println(arr[k]);
        }

    }
}
