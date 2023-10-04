package Test;

import static org.junit.Assert.*;
import Main.Main;
import org.junit.Test;

public class MainTest2 {


    Main mt = new Main();

    @org.junit.Test
    public void testsuma() {

        assertEquals(2.0,mt.suma(1,1),0);
    }


   @Test
   public void testsresta(){
        assertEquals(2.0,mt.resta(3,1),0);
    }
}