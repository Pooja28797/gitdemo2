public class Primeno {
    public static void main(String[] args) {
        int num=10;
        Boolean flag=false;
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                flag=true;
                break;
            }
        }
        if(!flag)
        {
           System.out.println("no is prime no " + num);
        }
        else {
            System.out.println("no is not prime no" +num);
        }
    }
}
