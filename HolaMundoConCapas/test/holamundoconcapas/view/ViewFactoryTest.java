/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andoni Fiat
 */
public class ViewFactoryTest {
    
    public ViewFactoryTest() {
    }

    /**
     * Test of getView method, of class ViewFactory.
     */
    @Test
    public void testGetView() {
        assertNotNull("", new ViewFactory().getView());
    }
    
}
