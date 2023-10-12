class caaa {
    private int value;

    public caaa() {
        this(10);
        System.out.println("value=" + value);
    }

    public caaa(int i) {
        value = i;
        System.out.println("value=" + value);
    }
}

public class Class_03 {
    public static void main(String[] args) {
        caaa obj1 = new caaa();
        caaa obj2 = new caaa(12);
    }
}
//(b)ans 第21行是呼叫沒有引數的，第22行則是呼叫有引數的。
//(c)ans 不能 因為只能有一個public的類別
//(d)ans 可以 不會有影響