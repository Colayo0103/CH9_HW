class Ccount{
    static int count;
    public static void add2n(int n){
        for(int i=0;i <= n;i++){
            count = count+i;
        }
        System.out.println(count);
        count = 0;
    }
}
public class Class_06 {
    public static void main(String[] args) {
        Ccount.add2n(5);
        Ccount.add2n(10);
    }
}
