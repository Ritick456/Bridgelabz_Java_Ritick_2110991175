package jan_30_2025;

import java.util.Scanner;

public class Panngram {

    public String check(){

        Panngram obj = new Panngram();
        
        return "hello";
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toLowerCase();
        int[] freq = new int[26];

        for(int i=0; i<str.length(); i++){
           
            char ch = str.charAt(i);
            if(ch == ' ') continue;
            else if(ch >=97 && ch <= 122) freq[ch-97]++;
            else{
                System.out.println("String are not paangram");
                return;
            }

        }

        boolean flag = false;

        for(int i=0; i<freq.length; i++){

            if(freq[i] == 0){
                flag = true;
                break;
            }

        }

        if(flag){
            System.out.println("String is not pangram");
        }
        else{
            System.out.println("String are pangram");
        }
        check();



    }
}





