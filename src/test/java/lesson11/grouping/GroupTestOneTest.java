package lesson11.grouping;

import org.testng.annotations.Test;

public class GroupTestOneTest {

    @Test(groups = {"smoke"})
    public void b(){}

    @Test
    public void c(){}

    @Test(groups = "regression")
    public void f(){

    }

    @Test(groups = {"smoke","regression"})
    public void e(){

    }

    @Test()
    public void d(){}

    @Test()
    public void a(){}
}
