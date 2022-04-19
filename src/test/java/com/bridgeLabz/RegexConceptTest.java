package com.bridgeLabz;

import com.bridgelabz.regex.RegexPatternCopcept;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@RunWith(Parameterized.class)
public class RegexConceptTest {
    private static RegexPatternCopcept copcept;
    private String pinCode;
    private boolean expected;

    public RegexConceptTest(String pinCode, boolean expected) {
        this.pinCode = pinCode;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{{"897878", true},{"081293",false},{"12211111", false}});
    }

   /* @BeforeClass
    public static void setUp(){
        System.out.println("Before class Annotation method called");
        copcept = new RegexPatternCopcept();
    }*/

    @Before
    public void setUp2(){
        System.out.println("Before Annotation method called");
        copcept = new RegexPatternCopcept();
    }

    @Test
    public void isValidPinCode() throws Exception {
        boolean vaild = copcept.isValid("1234"); // true
        Assert.assertEquals(expected, vaild);
        System.out.println("test1");
    }

    /*@Test
    public void isInValidPinCode(){
        boolean vaild = copcept.isValid("097878"); //false
        Assert.assertEquals(false, vaild);
        System.out.println("test2");
    }

    @Test
    public void givePinCode_lengthGreaterThanSix_shouldReturnFalse(){
        boolean vaild = copcept.isValid("3497878"); //false
        Assert.assertEquals(false, vaild);
        System.out.println("test3");
    }

    @Test
    public void giveInvalidMobileNumber_shouldReturnFalse() {
        boolean vaild = copcept.isValidMobileNumber("9198989898988"); //false
        Assert.assertEquals(false, vaild);
        System.out.println("test3");
    }
*/
   /* @Test
    public void giveValidMobileNumber_shouldReturnFalse() {
        boolean vaild = copcept.isValidMobileNumber("919898989898"); //false
        Assert.assertEquals(true, vaild);
        System.out.println("test3");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After class Annotation method called");
    }

    @After
    public void after(){
        System.out.println("After Annotation method called");
    }*/
}
