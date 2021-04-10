/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikcubesolver;

import java.util.ArrayList;
import java.util.Scanner;
import rubikcube.RubikCube;

/**
 *
 * @author Administrator
 */
public class RubikCubeSolver {

    ArrayList<ArrayList> solutions = new ArrayList<>();
    RubikCube rubikCube;
    Pattern pattern;
    Pattern targetPattern;
    Scanner scanner = new Scanner(System.in);
    int maxNoOfStepTries = 6;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RubikCubeSolver rs = new RubikCubeSolver();
        rs.getPattern();
        rs.solve();
        for (ArrayList<String> solution : rs.solutions) {
            System.out.println("Solution: \n");
            for (String s : solution) {
                System.out.println(s + "\n");
            }
        }
    }

    public void getPattern() {
        pattern = new Pattern();
        targetPattern = new Pattern();
        pattern.initializeAllColors();
        System.out.println("Enter 9 colors for face: ");
        for (int i = 0; i < 9; i++) {
            pattern.colors.get(0).set(i, scanner.nextLine());
        }
        System.out.println("Enter 9 colors for back: ");
        for (int i = 0; i < 9; i++) {
            pattern.colors.get(1).set(i, scanner.nextLine());
        }
        System.out.println("Enter 9 colors for right: ");
        for (int i = 0; i < 9; i++) {
            pattern.colors.get(2).set(i, scanner.nextLine());
        }
        System.out.println("Enter 9 colors for left: ");
        for (int i = 0; i < 9; i++) {
            pattern.colors.get(3).set(i, scanner.nextLine());
        }
        System.out.println("Enter 9 colors for top: ");
        for (int i = 0; i < 9; i++) {
            pattern.colors.get(4).set(i, scanner.nextLine());
        }
        System.out.println("Enter 9 colors for bottom: ");
        for (int i = 0; i < 9; i++) {
            pattern.colors.get(5).set(i, scanner.nextLine());
        }

        targetPattern.getPatternArrangement(pattern);
        targetPattern.setFromArrangement();
    }

    public void solve() {
        ArrayList<Integer> steps = new ArrayList<>();
        for (int i = 1; i <= maxNoOfStepTries; i++) {
            steps.add(1);
        }

        while(maximumStepsNotTried(steps)){
            rubikCube = PatternManipulator.getRubikCubeFromPattern(pattern);
            ArrayList<String> stepList = new ArrayList<>();

            for (int step = 0; step < maxNoOfStepTries; step++) {
                for(int i = 0; i < maxNoOfStepTries; i++)
                    System.out.print(steps.get(i) + " ");
                System.out.println("");
                invokeAsIndicated(steps.get(step));
                addAsIndicated(steps.get(step), stepList);
                if (targetPattern.matches(PatternManipulator.getPatternFromRubikCube(rubikCube))) {
                    solutions.add(stepList);
                    break;
                }
            }
            nextSteps(steps);
        }
    }

    public void nextSteps(ArrayList<Integer> steps) {
        for (int step = maxNoOfStepTries - 1; step >= 0; step--) {
            if (step == 0 && steps.get(0) != 12) {
                steps.set(0, steps.get(0) + 1);
                break;
            } else if (steps.get(step) == 12) {
                if (isNotLastStep(step)) {
                    if (steps.get(step + 1) < 12) {
                        steps.set(step + 1, steps.get(step + 1) + 1);
                        resetSteps(steps, step);
                        break;
                    }
                }
            }
        }
    }

    public boolean isNotLastStep(int step) {
        return step != (maxNoOfStepTries - 1);
    }

    public boolean maximumStepsNotTried(ArrayList<Integer> steps) {
        for (int i = 0; i < maxNoOfStepTries; i++) {
            if (steps.get(i) != 12) {
                return true;
            }
        }
        return false;
    }

    public void invokeAsIndicated(int i) {
        switch (i) {
            case 1:
                rubikCube.rotateFaceClockwise();
                break;
            case 2:
                rubikCube.rotateFaceAntiClockwise();
                break;
            case 3:
                rubikCube.rotateBackClockwise();
                break;
            case 4:
                rubikCube.rotateBackAntiClockwise();
                break;
            case 5:
                rubikCube.rotateRightClockwise();
                break;
            case 6:
                rubikCube.rotateRightAntiClockwise();
                break;
            case 7:
                rubikCube.rotateLeftClockwise();
                break;
            case 8:
                rubikCube.rotateLeftAntiClockwise();
                break;
            case 9:
                rubikCube.rotateTopClockwise();
                break;
            case 10:
                rubikCube.rotateTopAntiClockwise();
                break;
            case 11:
                rubikCube.rotateBottomClockwise();
                break;
            case 12:
                rubikCube.rotateBottomAntiClockwise();
                break;

        }
    }

    private void addAsIndicated(Integer i, ArrayList<String> stepList) {
        switch (i) {
            case 1:
                stepList.add("F");
                break;
            case 2:
                stepList.add("F'");
                break;
            case 3:
                stepList.add("B");
                break;
            case 4:
                stepList.add("B'");
                break;
            case 5:
                stepList.add("R");
                break;
            case 6:
                stepList.add("R'");
                break;
            case 7:
                stepList.add("L");
                break;
            case 8:
                stepList.add("L'");
                break;
            case 9:
                stepList.add("T");
                break;
            case 10:
                stepList.add("T'");
                break;
            case 11:
                stepList.add("D");
                break;
            case 12:
                stepList.add("D'");
                break;

        }
    }

    private void resetSteps(ArrayList<Integer> steps, int step) {
        for (int i = step; i >= 0; i--) {
            steps.set(i, 1);
        }
    }
}
