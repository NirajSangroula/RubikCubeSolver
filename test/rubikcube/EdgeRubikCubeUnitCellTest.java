/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikcube;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class EdgeRubikCubeUnitCellTest {
    EdgeRubikCubeUnitCell e;
    public EdgeRubikCubeUnitCellTest() {
        e = new EdgeRubikCubeUnitCell("Red", "Blue", "Green");
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
    public void testNeeds3ColorInput() {
        assertEquals(e.getSide1().getColor(), "Red");
        assertEquals(e.getSide2().getColor(), "Blue");
        assertEquals(e.getSide4().getColor(), "Green");
    }
    
    public void testCannotSetSide4(){
        Assert.assertNull(e.getSide3());
    }    
}
