package test;
import model.calculater;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class testCalculater {
    @Test
    public void testSum()
    {
        Assert.assertEquals(calculater.Sum(2,2),4);
    }
    @Test
    public void testSumFloat()
    {
        Assert.assertEquals(calculater.Sum(2.1F,2.2F),4.3F);
    }
    @Test
    public void testSumMinusAndPlus()
    {
        Assert.assertEquals(calculater.Sum(-2.5F,2.5F),0);
    }
    @Test
    public void testRazn()
    {
        Assert.assertEquals(calculater.Razn(2,2),0);
        Assert.assertEquals(calculater.Razn(5F,2F),3F);
    }
    @Test
    public void testMult()
    {
        Assert.assertEquals(calculater.Mult(2,2),4);
    }
    @Test
    public void testMultZero()
    {
        Assert.assertEquals(calculater.Mult(2.5F,2.5F),6.25F);
    }
    @Test
    public void testMultFloat()
    {
        Assert.assertEquals(calculater.Mult(2.1F,2.2F),4.62F);
    }
    @Test(expectedExceptions = { IOException.class, NullPointerException.class })
    public void testDevideExcept() throws IOException {

            calculater.Devide(2.5F, 0);
    }
    @Test
    public void testDevideInt() throws IOException {
        Assert.assertEquals(calculater.Devide(2,2),1);
    }
    @Test
    public void testDevideFloat() throws IOException {
        Assert.assertEquals(calculater.Devide(2.5F,2F),1.25F);
    }

}
