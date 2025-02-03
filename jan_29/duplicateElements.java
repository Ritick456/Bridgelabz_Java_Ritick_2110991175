package java_29_jan;

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class duplicateElements {


    public static HashSet<Integer> removeDuplicate(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for(int x:arr) hs.add(x);
        return hs  ;

    }

    public static ArrayList<Integer> removeDuplicateMap(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int x:arr) hm.put(x,hm.getOrDefault(x, 0)+1);
        // arr = new int[hm.size()];
        ArrayList<Integer> ls = new ArrayList<>();

        
       for(Entry<Integer,Integer> entry: hm.entrySet()){
            // System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            if(entry.getValue()>0){
                ls.add(entry.getKey());
            }
       }

        return ls;
        
    }

    public static  int[] removeDuplicateBrute(int[] arr ){
        int n = arr.length;
        int count =0;

        for(int i=0;  i<n; i++){
            for(int j=1; j<n; j++){
                if(arr[i]==arr[j] && i!=j){
                    arr[i]=0;
                    count++;
                }
            }
        }
        int[] ans = new int[arr.length-count];
        int i=0;
        for(int x:arr) if(x!=0) ans[i++]=x;

        // System.out.println(count);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,3,6,7,3,4,9,2,3,5};

        // System.out.println( Arrays.toString(removeDuplicateSorted(arr)) );   
        System.out.println( removeDuplicateMap(arr)) ;   
        // System.out.println( Arrays.toString(removeDuplicateBrute(arr)) ); 
        System.out.println(Arrays.toString(removeDuplicateBrute(arr)));  


        // System.out.println( removeDuplicate(arr));

    }
}
