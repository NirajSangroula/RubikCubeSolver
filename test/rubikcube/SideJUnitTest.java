/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikcube;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class SideJUnitTest {
    Side side;
    public SideJUnitTest() {
        side = new Side();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testDisabledColorInTheBeginning(){
        Assert.assertEquals(side.DISABLED, side.getColor());
    }
    
    @Test
    public void testCanSetColor(){
        side.setColor("Red");
        assertSame("Red", side.getColor());
    }
    
    @Test
    public void testDisabledSide(){
        side.disable();
        assertSame(side.DISABLED, side.getColor());
    }
}
