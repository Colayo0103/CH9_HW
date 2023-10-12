class CRectangle {
    int width;
    int height;

    public CRectangle(int w, int h) {
        width = w;
        height = h;
    }

    public CRectangle() {
        // this(8, 10)
        width = 8;
        height = 10;
    }

    public void show() {
        System.out.printf("width=%d, height=%d \n", width, height);
    }
}

public class Class_01 {
    public static void main(String[] args) {
        CRectangle c1 = new CRectangle(50, 100);
        c1.show();
        CRectangle c2 = new CRectangle();
        c2.show();
    }
}