class Shape {
    public void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape {
    public void area(int b, double h) {
        System.out.println(0.5 * b * h);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int b, double h) {
        System.out.println(0.5 * b * h);
    }
}

public class inheritance3 {
    public static void main(String[] args) throws Exception {
        Shape s1 = new Shape(); 
        int b=5;
        double h=10;
     s1.area(b, h);
    }
}
