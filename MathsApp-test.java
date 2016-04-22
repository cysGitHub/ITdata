public class CalculatorTest {

    @Test
    public void testadd() {
        Calculator cal=new Calculator(2,6);
        cal=cal.add(cal);
        assertEquals(2, cal.getNumerator());
    
    }
    @Test
    public void testf() {
        Calculator cal1=new Calculator(2, 6);
        int cal2 = cal1.f(3, 6);
        assertEquals(3, cal2);
    }
    @Test
    public void testsub() {
        Calculator cal1=new Calculator(2, 6);
        cal1=cal1.sub(cal1);
        assertEquals(0, cal1.getNumerator());
    }
    @Test
    public void testmuti() {
        Calculator cal1=new Calculator(2, 6);
        cal1=cal1.muti(cal1);
        assertEquals(1, cal1.getNumerator());
    }
    @Test
    public void testdiv() {
        Calculator cal1=new Calculator(2, 6);
        cal1=cal1.div(cal1);
        assertEquals(1, cal1.getNumerator());   
        
    }
}   
