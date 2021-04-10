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
 * @author Niraj Sangroula
 */
public class VirtualRubikCubeUnitCellTest {
    
    public VirtualRubikCubeUnitCellTest() {
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
     * Test of getSide2 method, of class VirtualRubikCubeUnitCell.
     */
    @Test
    public void testGetSide2() {
        System.out.println("getSide2");
        VirtualRubikCubeUnitCell instance = new VirtualRubikCubeUnitCell();
        Side expResult = null;
        Side result = instance.getSide2();
        assertEquals(expResult, result);
    }
    
}
