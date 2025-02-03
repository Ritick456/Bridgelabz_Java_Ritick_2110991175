package jan_30_2025;

public class concatString {
    public static void main(String[] args) {
        
        String str1 = "hello";
        String str2 = "world";

        StringBuilder sb = new StringBuilder();
        sb.append(str1+str2);
        //sb.append(str2);
        System.out.println(sb);

    }
}
