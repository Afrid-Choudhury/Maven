package testng1;

import org.testng.Assert;
import org.testng.annotations.*;

public class StartTest {
    //We do not need a main method in TestNg/ Maven
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }
    //Will run before EVERY test method.
    @Test
    public void test1(){
        System.out.println("This is test1");
    }
    //Use to represent test cases in manual testing
    @Test()
    public void test2(){
        System.out.println("This is test2");
    }
    //We can right-click to choose which method or class to run specific tests.
    @AfterMethod
    public void afterMethod() {
        System.out.println("after method");
        addSum(2,6);
        Assert.assertEquals(addSum(2,6),8);
        Assert.assertNotEquals(addSum(2,5),6);
    }

    //What is the difference between @beforeClass , @beforeMethod, @beforeTest?

    public int addSum(int num1, int num2){
        return num1+num2;
    }

}
