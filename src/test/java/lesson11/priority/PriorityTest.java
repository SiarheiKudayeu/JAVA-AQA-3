package lesson11.priority;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest {
    public static  void addPrecondition(){
        System.out.println("Adding some instance");
    }

    @Test(priority = 1)
    public void b(){}

    @Test
    public void c(){}

    @Test
    public void f(){
        addPrecondition();
    }

    @Test
    public void e(){
        Assert.fail();
    }

    @Test(priority = 2)
    public void d(){}

    @Test(dependsOnMethods = {"e"}, alwaysRun = true)
    public void a(){}
}
