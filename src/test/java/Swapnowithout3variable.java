import java.util.Random;

public class Swapnowithout3variable {
    public static void main(String[] args) {
        int a=10, b=20;
        b=b+a;
        a=b-a;
        b=b-a;
        System.out.println("a= " +a);
        System.out.println("b= " +b);

        Random r=new Random();
        int n=r.nextInt();
        System.out.println(n);
    }
}
