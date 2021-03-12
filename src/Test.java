import org.junit.Assert;

public class Test {

    @org.junit.Test
    public void testNumbersPrinted() {
        StringBuffer returned = Main.printNumbers();
        String arr[] = returned.toString().split("\n");

        for(int i=1; i<arr.length; i++) {
            Assert.assertSame(String.valueOf(i) , arr[i]);
        }
    }

    @org.junit.Test
    public void testAreaCalc() {
         Double area = Main.calculateAreaOfATriangle(14, 10);

         Assert.assertEquals(area, new Double(70.0D));
    }

}
