package Somvir;

class Som {

    public Som() {
        int a = 10, b;
        b = a * a;
        System.out.println(b);
    }

    public Som(int a, int b) {
        int rectangle;
        int length = a;
        int breath = b;
        rectangle = length * breath;
        System.out.println(rectangle);
    }

}

public class ConstructorBoth {
    public static void main(String[] args) {
        Som s1 = new Som();
        Som s2 = new Som(3, 4);
    }
}
