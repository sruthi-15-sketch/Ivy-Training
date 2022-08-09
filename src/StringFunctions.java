import java.util.*;
public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("Length of a string: " + (str1.length()));
        String merge_str=str1.concat(str2);
        System.out.println("Merging: " + (merge_str));
        String split_string1=merge_str.substring(0,str1.length());
        String split_string2=merge_str.substring(str1.length(),merge_str.length());
        System.out.println("Split: " + (split_string1+" "+split_string2));
        StringBuilder str=new StringBuilder(str1);
        str.reverse();
        System.out.println("Reverse: " + (str.toString()));
        System.out.println("Equal: " + (str1.equals(str2)));
    }
}