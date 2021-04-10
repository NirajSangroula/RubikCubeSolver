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
public class RubikCubeCellTest {
    
    public RubikCubeCellTest() {
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
    public void testSetterMethods(){
        RubikCubeCell rr = new RubikCubeCell();
        RubikCubeUnitCell r1 = new RubikCubeUnitCell();
        RubikCubeUnitCell r2 = new RubikCubeUnitCell();
        RubikCubeUnitCell r3 = new RubikCubeUnitCell();
        rr.setCell1(r1);
        rr.setCell2(r2);
        rr.setCell3(r3);
        assertSame(r1, rr.getCell1());
        assertSame(r2, rr.getCell2());
        assertSame(r3, rr.getCell3());
    }

    @Test
    public void testSwapperMethod(){    
        RubikCubeCell rr = new RubikCubeCell();
        RubikCubeUnitCell r1 = new RubikCubeUnitCell();
        RubikCubeUnitCell r2 = new RubikCubeUnitCell();
        RubikCubeUnitCell r3 = new RubikCubeUnitCell();
        rr.setCell1(r1);
        rr.setCell2(r2);
        rr.setCell3(r3);
        rr.swapEdges();
        assertSame(r3, rr.getCell1());
        assertSame(r2, rr.getCell2());
        assertSame(r1, rr.getCell3());
        
    }
}
