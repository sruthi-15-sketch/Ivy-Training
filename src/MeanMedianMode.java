import java.util.*;
public class MeanMedianMode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        float sum=0;
        for (int i = 0; i <n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Mean: "+(sum/n));
        Arrays.sort(arr);
        if(n%2!=0){
            System.out.println("Median: "+arr[((n+1)/2)-1]);
        }
        else {
            float median=(float)((n/2)+((n/2)+1))/2;
            System.out.println("Median: " + median);
        }

    }
}
