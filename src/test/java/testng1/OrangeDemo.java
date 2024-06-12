package testng1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeDemo {
    @Test
    public void testLogin(){

    }

    @DataProvider(name = "loginInfo")
    public Object[][] = createLoginInfo(){
        Object[][] logInfos = new Object[4][2]; // Object in this scenario is a data type that can hold any value (a string , int, etc.)
        logInfos[0][0] = "Admin";
        logInfos[0][1] = "admin123";

        logInfos[0][0] = "Admin";
        logInfos[0][0] = "Admin";
    }
}

