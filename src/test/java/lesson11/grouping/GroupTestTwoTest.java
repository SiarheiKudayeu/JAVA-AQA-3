package lesson11.grouping;

import org.testng.annotations.Test;

public class GroupTestTwoTest {

    @Test
    public void g(){}

    @Test(groups = {"smoke"})
    public void h(){}

    @Test
    public void i(){

    }

    @Test(groups = "regression")
    public void j(){

    }

    @Test(groups = {"smoke","regression"})
    public void k(){}

    @Test(groups = "regression")
    public void l(){}
}
