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
public class RubikCubeUnitCellJUnitTest {

    public RubikCubeUnitCellJUnitTest() {
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
    public void testInstantiatesAllSides() {
        RubikCubeUnitCell r1 = new RubikCubeUnitCell();
        assertNotNull(r1.getSide1());
        assertNotNull(r1.getSide2());
        assertNotNull(r1.getSide3());
        assertNotNull(r1.getSide4());
        assertTrue(r1.getSide1() instanceof Side);
        assertTrue(r1.getSide1() instanceof Side);
        assertTrue(r1.getSide1() instanceof Side);
        assertTrue(r1.getSide1() instanceof Side);
    }

    @Test
    public void testExchange() {
        MidRubikCubeUnitCell instance = new MidRubikCubeUnitCell("Green", "Red");
        RubikCubeUnitCell m = instance.getExchanged();
        assertEquals("Green", m.side4.getColor());
        assertEquals("Red", m.side2.getColor());
    }

    @Test
    public void testChangeToSide() {
        
        EdgeRubikCubeUnitCell e = new EdgeRubikCubeUnitCell("Red", "Blue", "Green");
        RubikCubeUnitCell e1 = e.getChangedToSide();
        assertEquals("Green", e1.getSide1().getColor());
        assertEquals("Red", e1.getSide2().getColor());
        assertEquals("Blue", e1.getSide4().getColor());
    }

}
