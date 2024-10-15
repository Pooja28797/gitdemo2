public class Reversedno {
    public static void main(String[] args) {
        int n=23456,rev=0;
        while (n!=0)
        {
            int r=n%10;
            n=n/10;
            rev=rev*10+r;
        }
        System.out.println("reversed no = " + rev);
    }
    }
