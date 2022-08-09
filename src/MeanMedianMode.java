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
        HashMap<Integer,Integer> map1=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map1.containsKey(arr[i])){
                map1.put(arr[i],map1.get(arr[i])+1);
            }
            else{
                map1.put(arr[i],1);
            }
        }
        int max=0;
        for(Map.Entry<Integer,Integer> entry:map1.entrySet()){
            if (entry.getValue()>max){
                max=entry.getKey();
            }
        }
        System.out.println("Mode: "+max);
    }
}
