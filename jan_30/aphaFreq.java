package jan_30_2025;

import java.util.Scanner;

public class aphaFreq {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] freq = new int[26];

        for(int i=0; i<str.length(); i++){

            char ch = str.charAt(i);
            int index = ch - 97;
            freq[index]++;

        }

        for(int i=0; i<freq.length; i++){

            if(freq[i] > 0){
            int asci = i + 97;
            char ch = (char)asci;
            System.out.println( ch  + " " + freq[i] + " ");
            }

        }


    }
}
