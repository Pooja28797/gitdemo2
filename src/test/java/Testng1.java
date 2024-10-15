import org.testng.annotations.Test;

public class Testng1 {
    @Test(priority = -1)
    public void x(){
        System.out.println("x method");
    }
    @Test(invocationCount = 3)
    public void a()
    {
        System.out.println("a method");
    }
    @Test
    public void z()
    {
        System.out.println("z method");
    }
    @Test(dependsOnMethods = {"z"})
    public void t()
    {
        System.out.println("t method");
    }

}
