import java.util.Scanner;
public class Lab {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int n=sc.nextInt();
        int res=n-x;
        if(res<n-y && n-y<0){
            System.out.println("L2");
            res=n-y;
        }
        else if(res<n-z && n-z<0   ){
            System.out.println("L3");
        }
        else    {


            System.out.println("L1");
        }

    }
}
