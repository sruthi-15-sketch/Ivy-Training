import java.util.Scanner;
public class Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int max=0;
        int max_roll=0;
        int min=99999;
        int min_roll=0;
        for (int i = 0; i <10; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
                max_roll=i;
            }
            if(arr[i]<min){
                min=arr[i];
                min_roll=i;
            }
        }
        System.out.println("Max Marks secured by roll no : "+ (max_roll+1));
        System.out.println("Min Marks secured by roll no : "+ (min_roll+1));
    }
}
