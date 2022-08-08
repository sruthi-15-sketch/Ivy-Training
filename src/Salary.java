import java.util.Scanner;
public class Salary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[7];
        int total=0;
        int x=0;
        int flag=0;
        for(int i=0;i<7;i++){
            arr[i]=sc.nextInt();
            x+=arr[i];
        }
        if (x>40){
            total=40*100+(x-40)*125;
           x=x-40;
           flag=1;
        }
        total=x*100;
        for(int i=1;i<6;i++){
            if(arr[i]>8){
                total+=(arr[i]-8)*15;
            }
        }
        if(arr[6]>0){
                  total+=arr[6]*25;
              if(arr[6]>8){
                  total+=(arr[6]-8)*15;}
        }
        if(arr[0]>0){
            total+=arr[0]*50;
            if(arr[0]>8){
                total+=(arr[0]-8)*15;}
        }
     System.out.println(total);
    }
}
