package jan_30_2025;

import java.util.Scanner;

public class countChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int lowerAlpha = 0;
        int upperAlpha = 0;
        int digit = 0;
        int specialChar = 0;

        for(int i=0; i<str.length(); i++){

            int asci = (int)str.charAt(i);
            if(asci >= 64 && asci <=90) upperAlpha++;
            else if(asci >= 97 && asci <=122) lowerAlpha++;
            else if(asci >= 48 && asci <= 57) digit++;
            else specialChar++;
        
        }

        System.out.println("LowerAlphabets : " + lowerAlpha);
        System.out.println("UpperAlphabets : " + upperAlpha);
        System.out.println("Digits : " + digit);
        System.out.println("SpecialCharacter : " + specialChar);



    }
    
}