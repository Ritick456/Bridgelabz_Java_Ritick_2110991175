package jan_30_2025;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int n1 = str1.length();
        int n2 = str2.length();

        if(n1 != n2){
            System.out.println("Not an Anagram");
            return;
        }
        else{
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            char[] char1 = str1.toCharArray();
            char[] char2 = str2.toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);
            
            if(Arrays.equals(char1, char2)){
                System.out.println("String are Anagram");
            }
            else{
                System.out.println("String are not Anagram");

            }
        }
    }
}
