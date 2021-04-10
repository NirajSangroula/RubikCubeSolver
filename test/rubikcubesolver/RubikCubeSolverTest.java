/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikcubesolver;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import rubikcube.RubikCube;

/**
 *
 * @author Niraj Sangroula
 */
public class RubikCubeSolverTest {
    
    public RubikCubeSolverTest() {
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
     * Test of solve method, of class RubikCubeSolver.
     */
    @Test
    public void testSolve() {
        System.out.println("solve");
        RubikCubeSolver instance = new RubikCubeSolver();
        instance.maxNoOfStepTries = 5;
        RubikCube r = new RubikCube();
        r.rowBuilder = rubikcube.RubikCubeTest.getStandardRubikCube();
        r.rowBuilder.setSideFromFace();
        r.rowBuilder.setTopFromFace();
        r.build();
        r.rotateLeftAntiClockwise();
        r.rotateBottomClockwise();
        r.rotateBottomClockwise();
        r.rotateTopClockwise();
        r.rotateRightClockwise();
        r.rotateRightAntiClockwise();
        r.rotateBottomClockwise();
        r.rotateTopClockwise();
        instance.pattern = PatternManipulator.getPatternFromRubikCube(r);
        instance.targetPattern = new Pattern();
        instance.targetPattern.getPatternArrangement(instance.pattern);
        instance.targetPattern.setFromArrangement();
        instance.solve();
        for (ArrayList<String> solution : instance.solutions) {
            System.out.println("Solution: \n");
            for (String s : solution) {
                System.out.println(s + "\n");
            }
        }
        assertFalse(instance.solutions.isEmpty());
    }

    @Test
    public void testNextSteps() {
        RubikCubeSolver r = new RubikCubeSolver();
        ArrayList<Integer> steps = new ArrayList<>();
        r.maxNoOfStepTries = 2;
        steps.add(1);
        steps.add(1);
        r.nextSteps(steps);
        assertSame(steps.get(0), 2);
        assertSame(steps.get(1), 1);
        r.nextSteps(steps);
        assertSame(steps.get(0), 3);
        assertSame(steps.get(1), 1);
        steps.set(0, 10);
        
        
        r.nextSteps(steps);
        assertSame(steps.get(0), 11);
        assertSame(steps.get(1), 1);
        r.nextSteps(steps);
        assertSame(steps.get(0), 12);
        assertSame(steps.get(1), 1);
        r.nextSteps(steps);
        assertSame(steps.get(0), 1);
        assertSame(steps.get(1), 2);
        r.nextSteps(steps);
        assertSame(steps.get(0), 2);
        assertSame(steps.get(1), 2);
        
        steps.set(0, 12);
        steps.set(1, 3);
        r.nextSteps(steps);
        assertSame(steps.get(0), 1);
        assertSame(steps.get(1), 4);
        
        steps.set(0, 11);
        steps.set(1, 11);
        r.nextSteps(steps);
        assertSame(steps.get(0), 12);
        assertSame(steps.get(1), 11);
        r.nextSteps(steps);
        assertSame(steps.get(0), 1);
        assertSame(steps.get(1), 12);
        r.nextSteps(steps);
        assertSame(steps.get(0), 2);
        assertSame(steps.get(1), 12);
                
        steps.set(0, 12);
        r.nextSteps(steps);
        assertSame(steps.get(0), 12);
        assertSame(steps.get(1), 12);
        assertFalse(r.maximumStepsNotTried(steps));
        
        r.maxNoOfStepTries = 3;
        steps.add(1);
        r.nextSteps(steps);
        assertSame(steps.get(2), 2);
        assertSame(steps.get(0), 1);
        assertSame(steps.get(1), 1);
        r.nextSteps(steps);
        assertSame(steps.get(2), 2);
        assertSame(steps.get(0), 2);
        assertSame(steps.get(1), 1);
        
        steps.set(2, 12);
        r.nextSteps(steps);
        assertSame(steps.get(0), 3);
        assertSame(steps.get(1), 1);
        assertSame(steps.get(2), 12);
        
        steps.set(0, 12);
        steps.set(1, 2);
        steps.set(2, 12);
        r.nextSteps(steps);
        assertSame(steps.get(0), 1);
        assertSame(steps.get(1), 3);
        assertSame(steps.get(2), 12);
    }
 
    @Test
    public void testMaximumStepsNotTried(){
        RubikCubeSolver r = new RubikCubeSolver();
        r.maxNoOfStepTries = 2;
        ArrayList<Integer> steps = new ArrayList<>();
        steps.add(11);
        steps.add(11);
        assertTrue(r.maximumStepsNotTried(steps));
        
        
        steps.set(0, 12);
        steps.set(1, 12);
        assertFalse(r.maximumStepsNotTried(steps));
    }
}
