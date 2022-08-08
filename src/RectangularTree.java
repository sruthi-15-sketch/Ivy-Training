import java.util.Scanner;
public class RectangularTree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int m=sc.nextInt();
        if ((m-1)%col==0 || m<=col || (row-1)*col<m){
            System.out.println("Mango Tree");
        }
        else{
            System.out.println("Not a Mango Tree");
        }
    }
}
