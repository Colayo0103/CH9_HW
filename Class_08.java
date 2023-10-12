class CWin{
    private static int cnt;
    static String color;
    static int width;
    static int height;
    public static void count(){
        cnt=cnt+1; 
        System.out.println(cnt);
    }
    public static void Cwin(String str,int w, int h){
        color = str;
        width = w;
        height = h;
    }
    public static void Cwin(){
        color = "red";
        width = 2;
        height = 2;
    }
    public static void setZero(){
        cnt = 0;
        System.out.println(cnt);
    }
    public static void setvalue(int n){
        cnt = n;
    }
}
public class Class_08{
    public static void main(String args[]){
        CWin a=new CWin();
        CWin.count();
        CWin b=new CWin();
        CWin.count();
        CWin.setZero();
    }
}

//(f) ans 類別函數 如果不是無法累加
//(g) ans 實例函數 只要執行count() cnt變累加 如果是類別函數變成物件共用便無法執行