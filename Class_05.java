class CCount{
    static int cnt = 0;
    public CCount(){
        cnt++;
    }
    public void count(){
        System.out.println(cnt+"object(s) created");
    }
    void setValue(int n){
        cnt = n;
    }
}
public class Class_05 {
    public static void main(String[] args) {
        CCount a = new CCount();
        a.count();
        CCount b = new CCount();   
        CCount c = new CCount();
        b.count();
        a.setValue(0);
        c.count();
    }
}

//(d) ans 類別變數，static修飾子加上成為類別變數，類別變數是每一個物件共享，因此會隨物件建立而累加
//(e) ans 實例函數，只要執行count() cnt變累加，如果是類別函數變成物件共用便無法執行。