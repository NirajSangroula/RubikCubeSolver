/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikcube;

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
public class MidRubikCubeUnitCellTest {
    
    public MidRubikCubeUnitCellTest() {
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

    /**
     * Test of getSide1 method, of class MidRubikCubeUnitCell.
     */
    @Test
    public void testGetSide1() {
        System.out.println("getSide1");
        MidRubikCubeUnitCell instance = new MidRubikCubeUnitCell("Green", "Red");
        Side expResult = null;
        Side result = instance.getSide1();
        assertEquals(expResult, result);
    }
    
}
