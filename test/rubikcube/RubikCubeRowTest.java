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
public class RubikCubeRowTest {

    RubikCubeRow r1 = new RubikCubeRow();
    RubikCubeCell c1 = getCell();
    RubikCubeCell c2 = getCell();
    RubikCubeCell c3 = getCell();

    public RubikCubeRowTest() {
        r1.setTopCell(c1);
        r1.setMidCell(c2);
        r1.setBottomCell(c3);
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

    public RubikCubeCell getCell() {
        RubikCubeCell rr = new RubikCubeCell();
        RubikCubeUnitCell r1 = new RubikCubeUnitCell();
        RubikCubeUnitCell r2 = new RubikCubeUnitCell();
        RubikCubeUnitCell r3 = new RubikCubeUnitCell();
        rr.setCell1(r1);
        rr.setCell2(r2);
        rr.setCell3(r3);
        return rr;
    }

    @Test
    public void testSetsCorrectUnitCells() {
        assertEquals(c1, this.r1.getTopCell());
        assertEquals(c2, this.r1.getMidCell());
        assertEquals(c3, this.r1.getBottomCell());
    }
    @Test
    public void testColumnCells(){
        RubikCubeCell columnCell1 = r1.getColumnCell1();
        RubikCubeCell columnCell2 = r1.getColumnCell2();
        RubikCubeCell columnCell3 = r1.getColumnCell3();
        assertEquals(c3.cell1, columnCell1.cell1);
        assertEquals(c2.cell1, columnCell1.cell2);
        assertEquals(c1.cell1, columnCell1.cell3);
        
        assertEquals(c3.cell2, columnCell2.cell1);
        assertEquals(c2.cell2, columnCell2.cell2);
        assertEquals(c1.cell2, columnCell2.cell3);
        
        assertEquals(c3.cell3, columnCell3.cell1);
        assertEquals(c2.cell3, columnCell3.cell2);
        assertEquals(c1.cell3, columnCell3.cell3);
    }
}
