/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikcubesolver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import rubikcube.RubikCube;
import rubikcube.RubikCubeTest;

/**
 *
 * @author Niraj Sangroula
 */
public class PatternManipulatorTest {
    
    public PatternManipulatorTest() {
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
     * Test of getPatternFromRubikCube method, of class PatternManipulator.
     */
    @Test
    public void testGetPatternFormRubikCube() {
        System.out.println("getPatternFormRubikCube");
        RubikCube r1 = new RubikCube();
        r1.rowBuilder =  RubikCubeTest.getStandardRubikCube();
        r1.rowBuilder.setSideFromFace();
        r1.rowBuilder.setTopFromFace();
        r1.build();
        Pattern expResult = PatternManipulator.getPatternFromRubikCube(r1);
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

    /**
     * Test of getRubikCubeFromPattern method, of class PatternManipulator.
     */
    @Test
    public void testGetRubikCubeFromPattern() {
        System.out.println("getRubikCubeFromPattern");
        RubikCube r1 = new RubikCube();
        r1.rowBuilder =  RubikCubeTest.getStandardRubikCube();
        r1.rowBuilder.setSideFromFace();
        r1.rowBuilder.setTopFromFace();
        r1.build();
        Pattern expResult = PatternManipulator.getPatternFromRubikCube(r1);
        RubikCube r2 = PatternManipulator.getRubikCubeFromPattern(expResult);
        Pattern newPattern = PatternManipulator.getPatternFromRubikCube(r2);
        for(int i = 0; i < 6; i++){
            assertEquals("white", newPattern.getFaceColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            assertEquals("yellow", newPattern.getBackColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            assertEquals("orange", newPattern.getRightColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            assertEquals("red", newPattern.getLeftColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            assertEquals("blue", newPattern.getTopColors().get(i));
        }
        for(int i = 0; i < 6; i++){
            assertEquals("green", newPattern.getBottomColors().get(i));
        }
        
    }
    
    @Test
    public void testMatches(){
        Pattern pattern1 = new Pattern();
        Pattern pattern2 = new Pattern();
        pattern1.arrangement.add("white");
        pattern1.arrangement.add("yellow");
        pattern1.arrangement.add("orange");
        pattern1.arrangement.add("red");
        pattern1.arrangement.add("blue");
        pattern1.arrangement.add("green");
        pattern1.setFromArrangement();
        pattern2.arrangement.add("white");
        pattern2.arrangement.add("yellow");
        pattern2.arrangement.add("orange");
        pattern2.arrangement.add("red");
        pattern2.arrangement.add("blue");
        pattern2.arrangement.add("green");
        pattern2.setFromArrangement();
        assertTrue(pattern1.matches(pattern2));
        
        
        RubikCube r = new RubikCube();
        r.rowBuilder = rubikcube.RubikCubeTest.getStandardRubikCube();
        r.rowBuilder.setSideFromFace();
        r.rowBuilder.setTopFromFace();
        r.build();
        r.rotateLeftAntiClockwise();
        r.rotateBottomClockwise();
        
        Pattern pattern = PatternManipulator.getPatternFromRubikCube(r);
        Pattern targetPattern = new Pattern();
        targetPattern.getPatternArrangement(pattern);
        targetPattern.setFromArrangement();
        
        RubikCube r1 = PatternManipulator.getRubikCubeFromPattern(pattern);
        System.out.println(PatternManipulator.getPatternFromRubikCube(r1).getFaceColors().get(6));
        r1.rotateBottomAntiClockwise();
        r1.rotateLeftClockwise();
        System.out.println(PatternManipulator.getPatternFromRubikCube(r1).getFaceColors().get(6));
        
        assertTrue(PatternManipulator.getPatternFromRubikCube(r1).matches(targetPattern));
    }
}
