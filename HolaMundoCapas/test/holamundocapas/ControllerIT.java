/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundocapas;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ControllerIT {
    private final PrintStream systemOut = System.out;
    private ByteArrayOutputStream testOut;
    
    @Before
    public void setUp() {
        private final PrintStream 
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of run method, of class Controller.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Model model = ModelFactory.getModel();
        String greeting = model.getGreeting();
        new Controller().run(ViewFactory.getView(), model);
        assertEquals("Shown greeting is not correct!", greeting+"/n", testOut.toString());    
    }
    
}
