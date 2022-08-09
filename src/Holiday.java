public class Holiday {
    private String name;
    private int day;
    private String month;
    Holiday(String name,int day,String month){
        this.name=name;
        this.day=day;
        this.month=month;
    }
    public static boolean inSameMonth(Holiday obj1, Holiday obj2){
         return (obj1.month==obj2.month);
    }
    public static double avgDate(Holiday[] holidays) {
        int sum = 0;
        for (int i = 0; i < holidays.length; i++) {
            sum = sum + holidays[i].day;
        }
        return ((double) sum) / holidays.length;
    }
    public static void main(String[] args){
        Holiday h1=new Holiday("Independence Day",4,"July");
        Holiday h2=new Holiday("Republic Day",26,"January");
        System.out.println(inSameMonth(h1,h2));
        Holiday arr[]=new Holiday[]{h1,h2};
        System.out.println(avgDate(arr));
    }
}
