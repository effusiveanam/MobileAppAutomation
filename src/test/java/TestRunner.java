import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner extends Setup {
    CalcScreen cal;
    @Test (priority = 1,description = "Summation of two numbers")
    public void doSum() throws InterruptedException {
        cal = new CalcScreen(driver);
        String sum = cal.doSum();
        System.out.println(sum);
        Assert.assertEquals(sum, "14");
        cal.btnClr.clear();

    }

    @Test (priority = 2,description = "Subtraction of 2 numbers")
    public void doSub() throws InterruptedException {
        cal = new CalcScreen(driver);
        String sub = cal.doSub();
        System.out.println(sub);
        Assert.assertEquals(sub, "5");
    }

    @Test (priority = 3,description = "Multiplication of 2 numbers")
    public void doMulti() throws InterruptedException {
        cal = new CalcScreen(driver);
        String multi=cal.doMulti();
        System.out.println(multi);
        Assert.assertEquals(multi,"70");
    }

    @Test (priority = 4,description = "Division of a number by 10")
    public void doDiv() throws InterruptedException {
        cal = new CalcScreen(driver);
        String div=cal.doDiv();
        System.out.println(div);
        cal.btnClr.clear();
        Assert.assertEquals(div,"7");
    }

    public void clearScreen(){
        cal=new CalcScreen(driver);
        cal.btnClr.clear();
    }
}
