package jan_30_2025;

public class rotatedString {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "llohe";

        if(str1.equals(str2)){

            System.out.println("False");

        }

        else{

            for(int i=0; i<str1.length(); i++){
        
                String str = str1.substring(i , str1.length()) + str1.substring(0, i);
        
                if(str.equals(str2)){
                    System.out.println("True");
                    return;
                }
        
            }

            System.out.println("False");

        }

    }

   

}
