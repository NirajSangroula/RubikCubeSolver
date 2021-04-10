/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikcube;

import com.sun.jmx.snmp.IPAcl.SnmpAcl;
import com.sun.org.apache.bcel.internal.generic.LUSHR;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import rubikcubesolver.Pattern;
import rubikcubesolver.PatternManipulator;

/**
 *
 * @author Niraj Sangroula
 */
public class RubikCubeTest {
    
    public RubikCubeTest() {
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
     * Test of setFace method, of class RubikCubeRowBuilder.
     */
    @Test
    public void testSetFace() {
        System.out.println("setFace");
        SideRubikCubeRow face1 = null;
        MidRubikCubeRow face2 = null;
        SideRubikCubeRow face3 = null;
        RubikCubeRowBuilder instance = new RubikCubeRowBuilder();
        instance.setFace(face1, face2, face3);
    }
    @Test
    public void testSetSideFromFace(){
        RubikCubeRowBuilder r1 = getStandardRubikCube();
        
        r1.setSideFromFace();
        assertArrayEquals(new String[]{"red", "red", "red", "red", "red", "red", "red", "red", "red"}, 
                new String[]{r1.side1.topCell.cell1.side2.getColor(), r1.side1.topCell.cell2.side2.getColor(), r1.side1.topCell.cell3.side2.getColor(),
                    r1.side1.midCell.cell1.side2.getColor(), r1.side1.midCell.cell2.side2.getColor(), r1.side1.midCell.cell3.side2.getColor(),
                    r1.side1.bottomCell.cell1.side2.getColor(), r1.side1.bottomCell.cell2.side2.getColor(), r1.side1.bottomCell.cell3.side2.getColor()
                });
        assertArrayEquals(new String[]{"blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue"}, 
                new String[]{r1.side1.topCell.cell1.side1.getColor(), r1.side1.midCell.cell1.side4.getColor(), r1.side1.bottomCell.cell1.side1.getColor(),
                    r1.side2.topCell.cell1.side2.getColor(), r1.side2.midCell.cell1.side2.getColor(), r1.side2.bottomCell.cell1.side2.getColor(),
                    r1.side3.topCell.cell1.side1.getColor(), r1.side3.midCell.cell1.side4.getColor(), r1.side3.bottomCell.cell1.side1.getColor()
                });
        assertArrayEquals(new String[]{"white", "white", "white", "white", "white", "white", "white", "white", "white"}, 
                new String[]{r1.side1.topCell.cell1.side4.getColor(), r1.side1.topCell.cell2.side4.getColor(), r1.side1.topCell.cell3.side4.getColor(),
                    r1.side2.topCell.cell1.side4.getColor(), r1.side2.topCell.cell2.side2.getColor(), r1.side2.topCell.cell3.side4.getColor(),
                    r1.side3.topCell.cell1.side4.getColor(), r1.side3.topCell.cell2.side4.getColor(), r1.side3.topCell.cell3.side4.getColor()
                });
        assertArrayEquals(new String[]{"orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange"}, 
                new String[]{r1.side3.topCell.cell1.side2.getColor(), r1.side3.topCell.cell2.side2.getColor(), r1.side3.topCell.cell3.side2.getColor(),
                    r1.side3.midCell.cell1.side2.getColor(), r1.side3.midCell.cell2.side2.getColor(), r1.side3.midCell.cell3.side2.getColor(),
                    r1.side3.bottomCell.cell1.side2.getColor(), r1.side3.bottomCell.cell2.side2.getColor(), r1.side3.bottomCell.cell3.side2.getColor()
                });
        assertArrayEquals(new String[]{"green", "green", "green", "green", "green", "green", "green", "green", "green"}, 
                new String[]{r1.side1.topCell.cell3.side1.getColor(), r1.side1.midCell.cell3.side4.getColor(), r1.side1.bottomCell.cell3.side1.getColor(),
                    r1.side2.topCell.cell3.side2.getColor(), r1.side2.midCell.cell3.side2.getColor(), r1.side2.bottomCell.cell3.side2.getColor(),
                    r1.side3.topCell.cell3.side1.getColor(), r1.side3.midCell.cell3.side4.getColor(), r1.side3.bottomCell.cell3.side1.getColor()
                });
        assertArrayEquals(new String[]{"yellow", "yellow", "yellow", "yellow", "yellow", "yellow", "yellow", "yellow", "yellow"}, 
                new String[]{r1.side1.bottomCell.cell1.side4.getColor(), r1.side1.bottomCell.cell2.side4.getColor(), r1.side1.bottomCell.cell3.side4.getColor(),
                    r1.side2.bottomCell.cell1.side4.getColor(), r1.side2.bottomCell.cell2.side2.getColor(), r1.side2.bottomCell.cell3.side4.getColor(),
                    r1.side3.bottomCell.cell1.side4.getColor(), r1.side3.bottomCell.cell2.side4.getColor(), r1.side3.bottomCell.cell3.side4.getColor()
                });
    }
    
    @Test
    public void testSetTopFromFace(){
        RubikCubeRowBuilder r1 = getStandardRubikCube();
        r1.setTopFromFace();
        assertArrayEquals(new String[]{"red", "red", "red", "red", "red", "red", "red", "red", "red"}, 
                new String[]{r1.top1.topCell.cell3.side1.getColor(), r1.top1.midCell.cell3.side4.getColor(), r1.top1.bottomCell.cell3.side1.getColor(),
                    r1.top2.topCell.cell3.side2.getColor(), r1.top2.midCell.cell3.side2.getColor(), r1.top2.bottomCell.cell3.side2.getColor(),
                    r1.top3.topCell.cell3.side1.getColor(), r1.top3.midCell.cell3.side4.getColor(), r1.top3.bottomCell.cell3.side1.getColor()
                });
        assertArrayEquals(new String[]{"blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue", "blue"}, 
                new String[]{r1.top1.topCell.cell1.side2.getColor(), r1.top1.midCell.cell1.side2.getColor(), r1.top1.bottomCell.cell1.side2.getColor(),
                    r1.top1.topCell.cell2.side2.getColor(), r1.top1.midCell.cell2.side2.getColor(), r1.top1.bottomCell.cell2.side2.getColor(),
                    r1.top1.topCell.cell3.side2.getColor(), r1.top1.midCell.cell3.side2.getColor(), r1.top1.bottomCell.cell3.side2.getColor()
                });
        assertArrayEquals(new String[]{"white", "white", "white", "white", "white", "white", "white", "white", "white"}, 
                new String[]{r1.top1.topCell.cell1.side4.getColor(), r1.top1.topCell.cell2.side4.getColor(), r1.top1.topCell.cell3.side4.getColor(),
                    r1.top2.topCell.cell1.side4.getColor(), r1.top2.topCell.cell2.side2.getColor(), r1.top2.topCell.cell3.side4.getColor(),
                    r1.top3.topCell.cell1.side4.getColor(), r1.top3.topCell.cell2.side4.getColor(), r1.top3.topCell.cell3.side4.getColor()
                });
        assertArrayEquals(new String[]{"orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange", "orange"}, 
                new String[]{r1.top1.topCell.cell1.side1.getColor(), r1.top1.midCell.cell1.side4.getColor(), r1.top1.bottomCell.cell1.side1.getColor(),
                    r1.top2.topCell.cell1.side2.getColor(), r1.top2.midCell.cell1.side2.getColor(), r1.top2.bottomCell.cell1.side2.getColor(),
                    r1.top3.topCell.cell1.side1.getColor(), r1.top3.midCell.cell1.side4.getColor(), r1.top3.bottomCell.cell1.side1.getColor()
                });
        assertArrayEquals(new String[]{"green", "green", "green", "green", "green", "green", "green", "green", "green"}, 
                new String[]{r1.top3.topCell.cell1.side2.getColor(), r1.top3.midCell.cell1.side2.getColor(), r1.top3.bottomCell.cell1.side2.getColor(),
                    r1.top3.topCell.cell2.side2.getColor(), r1.top3.midCell.cell2.side2.getColor(), r1.top3.bottomCell.cell2.side2.getColor(),
                    r1.top3.topCell.cell3.side2.getColor(), r1.top3.midCell.cell3.side2.getColor(), r1.top3.bottomCell.cell3.side2.getColor()
                });
        assertArrayEquals(new String[]{"yellow", "yellow", "yellow", "yellow", "yellow", "yellow", "yellow", "yellow", "yellow"}, 
                new String[]{r1.top1.bottomCell.cell1.side4.getColor(), r1.top1.bottomCell.cell2.side4.getColor(), r1.top1.bottomCell.cell3.side4.getColor(),
                    r1.top2.bottomCell.cell1.side4.getColor(), r1.top2.bottomCell.cell2.side2.getColor(), r1.top2.bottomCell.cell3.side4.getColor(),
                    r1.top3.bottomCell.cell1.side4.getColor(), r1.top3.bottomCell.cell2.side4.getColor(), r1.top3.bottomCell.cell3.side4.getColor()
                });
    }

    @Test
    public void testSetFaceFromTop(){
        RubikCubeRowBuilder r1 = getStandardRubikCube();
        RubikCubeRowBuilder r2 = getStandardRubikCube();
        r1.setTopFromFace();
        r1.setFaceFromTop();
        assertArrayEquals(new String[]{r1.face1.topCell.cell1.side2.getColor()}, new String[]{r2.face1.topCell.cell1.side2.getColor()});
        assertArrayEquals(new String[]{r1.face1.topCell.cell1.side4.getColor()}, new String[]{r2.face1.topCell.cell1.side4.getColor()});
        assertArrayEquals(new String[]{r1.face1.topCell.cell2.side2.getColor()}, new String[]{r2.face1.topCell.cell2.side2.getColor()});
        assertArrayEquals(new String[]{r1.face1.topCell.cell2.side4.getColor()}, new String[]{r2.face1.topCell.cell2.side4.getColor()});
        assertArrayEquals(new String[]{r1.face1.midCell.cell1.side2.getColor()}, new String[]{r2.face1.midCell.cell1.side2.getColor()});
        assertArrayEquals(new String[]{r1.face1.midCell.cell2.side2.getColor()}, new String[]{r2.face1.midCell.cell2.side2.getColor()});
        assertArrayEquals(new String[]{r1.face2.topCell.cell1.side2.getColor()}, new String[]{r2.face2.topCell.cell1.side2.getColor()});
        assertArrayEquals(new String[]{r1.face3.topCell.cell1.side2.getColor()}, new String[]{r2.face3.topCell.cell1.side2.getColor()});
        assertArrayEquals(new String[]{r1.face3.bottomCell.cell1.side2.getColor()}, new String[]{r2.face3.bottomCell.cell1.side2.getColor()});
    }
    
    @Test
    public void testSetFaceFromSide(){
        
        RubikCubeRowBuilder r1 = getStandardRubikCube();
        r1.setSideFromFace();
        RubikCubeRowBuilder r2 = new RubikCubeRowBuilder();
        r2.side1 = r1.side1;
        r2.side2 = r1.side2;
        r2.side3 = r1.side3;
        r2.setFaceFromSide();
        assertArrayEquals(new String[]{r1.face1.topCell.cell1.side2.getColor()}, new String[]{r2.face1.topCell.cell1.side2.getColor()});
        assertArrayEquals(new String[]{r1.face1.topCell.cell1.side4.getColor()}, new String[]{r2.face1.topCell.cell1.side4.getColor()});
        assertArrayEquals(new String[]{r1.face1.topCell.cell2.side2.getColor()}, new String[]{r2.face1.topCell.cell2.side2.getColor()});
        assertArrayEquals(new String[]{r1.face1.topCell.cell2.side4.getColor()}, new String[]{r2.face1.topCell.cell2.side4.getColor()});
        assertArrayEquals(new String[]{r1.face1.midCell.cell1.side2.getColor()}, new String[]{r2.face1.midCell.cell1.side2.getColor()});
        assertArrayEquals(new String[]{r1.face1.midCell.cell2.side2.getColor()}, new String[]{r2.face1.midCell.cell2.side2.getColor()});
        assertArrayEquals(new String[]{r1.face2.topCell.cell1.side2.getColor()}, new String[]{r2.face2.topCell.cell1.side2.getColor()});
        assertArrayEquals(new String[]{r1.face2.topCell.cell3.side2.getColor()}, new String[]{r2.face2.topCell.cell3.side2.getColor()});
        assertArrayEquals(new String[]{r1.face3.topCell.cell3.side2.getColor()}, new String[]{r2.face3.topCell.cell3.side2.getColor()});
        assertArrayEquals(new String[]{r1.face2.topCell.cell3.side2.getColor()}, new String[]{r2.face2.topCell.cell3.side2.getColor()});
    }
    @Test
    public void testRotateFaceClkwise(){
        RubikCube r1 = new RubikCube();
        r1.rowBuilder =  RubikCubeTest.getStandardRubikCube();
        r1.rowBuilder.setSideFromFace();
        r1.rowBuilder.setTopFromFace();
        r1.build();
        r1.rotateFaceClockwise();
        Pattern expResult = PatternManipulator.getPatternFromRubikCube(r1);
        assertArrayEquals(new String[]{"red", "red", "red"}, new String[]{expResult.getTopColors().get(6), expResult.getTopColors().get(7), expResult.getTopColors().get(8)});
        assertArrayEquals(new String[]{"green", "green", "green"}, new String[]{expResult.getLeftColors().get(2), expResult.getLeftColors().get(5), expResult.getLeftColors().get(8)});
        assertArrayEquals(new String[]{"blue", "blue", "blue"}, new String[]{expResult.getRightColors().get(0), expResult.getRightColors().get(3), expResult.getRightColors().get(6)});
        assertArrayEquals(new String[]{"orange", "orange", "orange"}, new String[]{expResult.getBottomColors().get(0), expResult.getBottomColors().get(1), expResult.getRightColors().get(2)});
        
         for(int i = 0; i < 6; i++){
            assertEquals("white", expResult.getFaceColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            assertEquals("yellow", expResult.getBackColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 0 || i == 3 || i == 6)
                continue;
            assertEquals("orange", expResult.getRightColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 2 || i == 5 || i == 8)
                continue;
            assertEquals("red", expResult.getLeftColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 6 || i == 7 || i == 8)
                continue;
            assertEquals("blue", expResult.getTopColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 0 || i == 1 || i == 2)
                continue;
            assertEquals("green", expResult.getBottomColors().get(i));
        }
    }
    
    @Test
    public void testRotateAntiClockwise(){
        RubikCube r1 = new RubikCube();
        r1.rowBuilder =  RubikCubeTest.getStandardRubikCube();
        r1.rowBuilder.setSideFromFace();
        r1.rowBuilder.setTopFromFace();
        r1.build();
        r1.rotateFaceClockwise();
        r1.rotateFaceAntiClockwise();
        Pattern expResult = PatternManipulator.getPatternFromRubikCube(r1);
        testAllNormal(expResult);
    }
    @Test
    public void testRotateBackClockwise(){
        RubikCube r1 = new RubikCube();
        r1.rowBuilder =  RubikCubeTest.getStandardRubikCube();
        r1.rowBuilder.setSideFromFace();
        r1.rowBuilder.setTopFromFace();
        r1.build();
        r1.rotateBackClockwise();
        Pattern expResult = PatternManipulator.getPatternFromRubikCube(r1);
        assertArrayEquals(new String[]{"red", "red", "red"}, new String[]{expResult.getBottomColors().get(6), expResult.getBottomColors().get(7), expResult.getBottomColors().get(8)});
        assertArrayEquals(new String[]{"green", "green", "green"}, new String[]{expResult.getRightColors().get(2), expResult.getRightColors().get(5), expResult.getRightColors().get(8)});
        assertArrayEquals(new String[]{"blue", "blue", "blue"}, new String[]{expResult.getLeftColors().get(0), expResult.getLeftColors().get(3), expResult.getLeftColors().get(6)});
        assertArrayEquals(new String[]{"orange", "orange", "orange"}, new String[]{expResult.getTopColors().get(0), expResult.getTopColors().get(1), expResult.getTopColors().get(2)});
        
         for(int i = 0; i < 6; i++){
            assertEquals("white", expResult.getFaceColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            assertEquals("yellow", expResult.getBackColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 2 || i == 5 || i == 8)
                continue;
            assertEquals("orange", expResult.getRightColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 0 || i == 3 || i == 6)
                continue;
            assertEquals("red", expResult.getLeftColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 0 || i == 1 || i == 2)
                continue;
            assertEquals("blue", expResult.getTopColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 6 || i == 7 || i == 8)
                continue;
            assertEquals("green", expResult.getBottomColors().get(i));
        }
    }
    
    @Test
    public void testRotateAntiClkWise(){
        RubikCube r1 = new RubikCube();
        r1.rowBuilder =  RubikCubeTest.getStandardRubikCube();
        r1.rowBuilder.setSideFromFace();
        r1.rowBuilder.setTopFromFace();
        r1.build();
        r1.rotateBackClockwise();
        r1.rotateBackAntiClockwise();
        Pattern expResult = PatternManipulator.getPatternFromRubikCube(r1);
        testAllNormal(expResult);
    }
    
    @Test
    public void testRotateRightClkWise(){
        RubikCube r1 = new RubikCube();
        r1.rowBuilder =  RubikCubeTest.getStandardRubikCube();
        r1.rowBuilder.setSideFromFace();
        r1.rowBuilder.setTopFromFace();
        assertEquals("white", r1.rowBuilder.side3.topCell.cell1.side4.getColor());
        r1.build();
        r1.rotateRightClockwise();
        Pattern expResult = PatternManipulator.getPatternFromRubikCube(r1);
        assertArrayEquals(new String[]{"white", "white", "white"}, new String[]{expResult.getTopColors().get(2), expResult.getTopColors().get(5), expResult.getTopColors().get(8)});
        
        assertArrayEquals(new String[]{"green", "green", "green"}, new String[]{expResult.getFaceColors().get(2), expResult.getFaceColors().get(5), expResult.getFaceColors().get(8)});
        assertArrayEquals(new String[]{"blue", "blue", "blue"}, new String[]{expResult.getBackColors().get(2), expResult.getBackColors().get(5), expResult.getBackColors().get(8)});
        assertArrayEquals(new String[]{"yellow", "yellow", "yellow"}, new String[]{expResult.getBottomColors().get(2), expResult.getBottomColors().get(5), expResult.getBottomColors().get(8)});
        
         for(int i = 0; i < 6; i++){
            assertEquals("red", expResult.getLeftColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            assertEquals("orange", expResult.getRightColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 2 || i == 5 || i == 8)
                continue;
            assertEquals("yellow", expResult.getBackColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 2 || i == 5 || i == 8)
                continue;
            assertEquals("white", expResult.getFaceColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 2 || i == 5 || i == 8)
                continue;
            assertEquals("blue", expResult.getTopColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 2 || i == 5 || i == 8)
                continue;
            assertEquals("green", expResult.getBottomColors().get(i));
        }
    }
    
    @Test
    public void testRotateRightAntiClkWise(){
        RubikCube r1 = new RubikCube();
        r1.rowBuilder =  RubikCubeTest.getStandardRubikCube();
        r1.rowBuilder.setSideFromFace();
        r1.rowBuilder.setTopFromFace();
        assertEquals("white", r1.rowBuilder.side3.topCell.cell1.side4.getColor());
        r1.build();
        r1.rotateRightClockwise();
        r1.rotateRightAntiClockwise();
        Pattern expResult = PatternManipulator.getPatternFromRubikCube(r1);
        testAllNormal(expResult);
    }
    
    @Test
    public void testRotateLeftAntiClkWise(){
        RubikCube r1 = new RubikCube();
        r1.rowBuilder =  RubikCubeTest.getStandardRubikCube();
        r1.rowBuilder.setSideFromFace();
        r1.rowBuilder.setTopFromFace();
        r1.build();
        r1.rotateLeftAntiClockwise();
        Pattern expResult = PatternManipulator.getPatternFromRubikCube(r1);
        assertArrayEquals(new String[]{"white", "white", "white"}, new String[]{expResult.getTopColors().get(0), expResult.getTopColors().get(3), expResult.getTopColors().get(6)});
        
        assertArrayEquals(new String[]{"green", "green", "green"}, new String[]{expResult.getFaceColors().get(0), expResult.getFaceColors().get(3), expResult.getFaceColors().get(6)});
        assertArrayEquals(new String[]{"blue", "blue", "blue"}, new String[]{expResult.getBackColors().get(0), expResult.getBackColors().get(3), expResult.getBackColors().get(6)});
        assertArrayEquals(new String[]{"yellow", "yellow", "yellow"}, new String[]{expResult.getBottomColors().get(0), expResult.getBottomColors().get(3), expResult.getBottomColors().get(6)});
        
         for(int i = 0; i < 6; i++){
            assertEquals("red", expResult.getLeftColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            assertEquals("orange", expResult.getRightColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 0 || i == 3 || i == 6)
                continue;
            assertEquals("yellow", expResult.getBackColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 0 || i == 3 || i == 6)
                continue;
            assertEquals("white", expResult.getFaceColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 0 || i == 3 || i == 6)
                continue;
            assertEquals("blue", expResult.getTopColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 0 || i == 3 || i == 6)
                continue;
            assertEquals("green", expResult.getBottomColors().get(i));
        }
    }
    
    @Test
    public void testRotateLeftClkWise(){
        RubikCube r1 = new RubikCube();
        r1.rowBuilder =  RubikCubeTest.getStandardRubikCube();
        r1.rowBuilder.setSideFromFace();
        r1.rowBuilder.setTopFromFace();
        r1.build();
        r1.rotateLeftAntiClockwise();
        r1.rotateLeftClockwise();
        Pattern expResult = PatternManipulator.getPatternFromRubikCube(r1);
        testAllNormal(expResult);
    }
    
    @Test
    public void testRotateTopAntiClkWise(){
        RubikCube r1 = new RubikCube();
        r1.rowBuilder =  RubikCubeTest.getStandardRubikCube();
        r1.rowBuilder.setSideFromFace();
        r1.rowBuilder.setTopFromFace();
        r1.build();
        r1.rotateTopAntiClockwise();
        Pattern expResult = PatternManipulator.getPatternFromRubikCube(r1);
        assertArrayEquals(new String[]{"white", "white", "white"}, new String[]{expResult.getRightColors().get(0), expResult.getRightColors().get(1), expResult.getRightColors().get(2)});
        assertArrayEquals(new String[]{"red", "red", "red"}, new String[]{expResult.getFaceColors().get(0), expResult.getFaceColors().get(1), expResult.getFaceColors().get(2)});
        assertArrayEquals(new String[]{"orange", "orange", "orange"}, new String[]{expResult.getBackColors().get(0), expResult.getBackColors().get(1), expResult.getBackColors().get(2)});
        assertArrayEquals(new String[]{"yellow", "yellow", "yellow"}, new String[]{expResult.getLeftColors().get(0), expResult.getLeftColors().get(1), expResult.getLeftColors().get(2)});
        
         for(int i = 0; i < 6; i++){
            assertEquals("blue", expResult.getTopColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            assertEquals("green", expResult.getBottomColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 0 || i == 1 || i == 2)
                continue;
            assertEquals("yellow", expResult.getBackColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 0 || i == 1 || i == 2)
                continue;
            assertEquals("white", expResult.getFaceColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 0 || i == 1 || i == 2)
                continue;
            assertEquals("red", expResult.getLeftColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 0 || i == 1 || i == 2)
                continue;
            assertEquals("orange", expResult.getRightColors().get(i));
        }
    }
    
    @Test
    public void testRotateTopClkWise(){
        RubikCube r1 = new RubikCube();
        r1.rowBuilder =  RubikCubeTest.getStandardRubikCube();
        r1.rowBuilder.setSideFromFace();
        r1.rowBuilder.setTopFromFace();
        r1.build();
        r1.rotateLeftAntiClockwise();
        r1.rotateLeftClockwise();
        Pattern expResult = PatternManipulator.getPatternFromRubikCube(r1);
        testAllNormal(expResult);
    }
    
    @Test
    public void testRotateBottomAntiClkWise(){
        RubikCube r1 = new RubikCube();
        r1.rowBuilder =  RubikCubeTest.getStandardRubikCube();
        r1.rowBuilder.setSideFromFace();
        r1.rowBuilder.setTopFromFace();
        r1.build();
        r1.rotateBottomAntiClockwise();
        Pattern expResult = PatternManipulator.getPatternFromRubikCube(r1);
        assertArrayEquals(new String[]{"white", "white", "white"}, new String[]{expResult.getLeftColors().get(6), expResult.getLeftColors().get(7), expResult.getLeftColors().get(8)});
        assertArrayEquals(new String[]{"red", "red", "red"}, new String[]{expResult.getBackColors().get(6), expResult.getBackColors().get(7), expResult.getBackColors().get(8)});
        assertArrayEquals(new String[]{"orange", "orange", "orange"}, new String[]{expResult.getFaceColors().get(6), expResult.getFaceColors().get(7), expResult.getFaceColors().get(8)});
        assertArrayEquals(new String[]{"yellow", "yellow", "yellow"}, new String[]{expResult.getRightColors().get(6), expResult.getRightColors().get(7), expResult.getRightColors().get(8)});
        
         for(int i = 0; i < 6; i++){
            assertEquals("blue", expResult.getTopColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            assertEquals("green", expResult.getBottomColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 6 || i == 7 || i == 8)
                continue;
            assertEquals("yellow", expResult.getBackColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 6 || i == 7 || i == 8)
                continue;
            assertEquals("white", expResult.getFaceColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 6 || i == 7 || i == 8)
                continue;
            assertEquals("red", expResult.getLeftColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            if(i == 6 || i == 7 || i == 8)
                continue;
            assertEquals("orange", expResult.getRightColors().get(i));
        }
    }
    
    @Test
    public void testRotateBottomClkWise(){
        RubikCube r1 = new RubikCube();
        r1.rowBuilder =  RubikCubeTest.getStandardRubikCube();
        r1.rowBuilder.setSideFromFace();
        r1.rowBuilder.setTopFromFace();
        r1.build();
        r1.rotateBottomClockwise();
        r1.rotateBottomAntiClockwise();
        Pattern expResult = PatternManipulator.getPatternFromRubikCube(r1);
        testAllNormal(expResult);
    }
    
    public void testAllNormal(Pattern expResult){
        for(int i = 0; i < 6; i++){
            assertEquals("white", expResult.getFaceColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            assertEquals("yellow", expResult.getBackColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            assertEquals("orange", expResult.getRightColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            assertEquals("red", expResult.getLeftColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            assertEquals("blue", expResult.getTopColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            assertEquals("green", expResult.getBottomColors().get(i));
        }
    }
    public static RubikCubeRowBuilder getStandardRubikCube() {
        RubikCubeRowBuilder r1 = new RubikCubeRowBuilder();
        SideRubikCubeCell s11 = new SideRubikCubeCell(new EdgeRubikCubeUnitCell("red", "white", "blue"),
                new MidRubikCubeUnitCell("white", "blue"), 
                new EdgeRubikCubeUnitCell("orange", "white", "blue"));
        MidRubikCubeCell m11 = new MidRubikCubeCell(new MidRubikCubeUnitCell("white", "red"),
                new CenterRubikCubeUnitCell("white"),
                new MidRubikCubeUnitCell("white", "orange"));
        SideRubikCubeCell s13 = new SideRubikCubeCell(new EdgeRubikCubeUnitCell("red", "white", "green"),
                new MidRubikCubeUnitCell("white", "green"), 
                new EdgeRubikCubeUnitCell("orange", "white", "green"));
        
        SideRubikCubeRow rr1 = new SideRubikCubeRow(s11, m11, s13);
        
        
        MidRubikCubeCell m21 = new MidRubikCubeCell(new MidRubikCubeUnitCell("red", "blue"),
                new CenterRubikCubeUnitCell("blue"),
                new MidRubikCubeUnitCell("orange", "blue"));
        CenterRubikCubeCell c21 = new CenterRubikCubeCell(new CenterRubikCubeUnitCell("red"), new CenterRubikCubeUnitCell("orange"));
        MidRubikCubeCell m22 = new MidRubikCubeCell(new MidRubikCubeUnitCell("red", "green"),
                new CenterRubikCubeUnitCell("green"),
                new MidRubikCubeUnitCell("orange", "green"));
        
        MidRubikCubeRow rr2 = new MidRubikCubeRow(m21, c21, m22);
        
        SideRubikCubeCell s31 = new SideRubikCubeCell(new EdgeRubikCubeUnitCell("red", "yellow", "blue"),
                new MidRubikCubeUnitCell("yellow", "blue"), 
                new EdgeRubikCubeUnitCell("orange", "yellow", "blue"));
        MidRubikCubeCell m31 = new MidRubikCubeCell(new MidRubikCubeUnitCell("yellow", "red"),
                new CenterRubikCubeUnitCell("yellow"),
                new MidRubikCubeUnitCell("yellow", "orange"));
        SideRubikCubeCell s33 = new SideRubikCubeCell(new EdgeRubikCubeUnitCell("red", "yellow", "green"),
                new MidRubikCubeUnitCell("yellow", "green"), 
                new EdgeRubikCubeUnitCell("orange", "yellow", "green"));
        
        SideRubikCubeRow rr3 = new SideRubikCubeRow(s31, m31, s33);
        
        r1.face1 = rr1;
        r1.face2 = rr2;
        r1.face3 = rr3;
        return r1;
    }
}