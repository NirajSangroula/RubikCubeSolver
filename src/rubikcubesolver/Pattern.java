/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikcubesolver;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Niraj Sangroula
 */
public class Pattern {

    ArrayList<ArrayList<String>> colors;
    ArrayList<String> arrangement = new ArrayList<>();

    public Pattern() {
        colors = new ArrayList<>();
        colors.add(new ArrayList<>());
        colors.add(new ArrayList<>());
        colors.add(new ArrayList<>());
        colors.add(new ArrayList<>());
        colors.add(new ArrayList<>());
        colors.add(new ArrayList<>());
    }

    public boolean matches(Pattern pattern) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                if (!(colors.get(i).get(j).equals(pattern.getColors().get(i).get(j)))) {
                    return false;
                }
            }
        }
        return true;
    }

    public ArrayList<ArrayList<String>> getColors() {
        return colors;
    }

    public ArrayList<String> getFaceColors() {
        return colors.get(0);
    }

    public ArrayList<String> getBackColors() {
        return colors.get(1);
    }

    public ArrayList<String> getRightColors() {
        return colors.get(2);
    }

    public ArrayList<String> getLeftColors() {
        return colors.get(3);
    }

    public ArrayList<String> getTopColors() {
        return colors.get(4);
    }

    public ArrayList<String> getBottomColors() {
        return colors.get(5);
    }

    public void getPatternArrangement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter face color: ");
        arrangement.add(scanner.nextLine());
        System.out.println("Enter back color: ");
        arrangement.add(scanner.nextLine());
        System.out.println("Enter right color: ");
        arrangement.add(scanner.nextLine());
        System.out.println("Enter left color: ");
        arrangement.add(scanner.nextLine());
        System.out.println("Enter top color: ");
        arrangement.add(scanner.nextLine());
        System.out.println("Enter bottom color: ");
        arrangement.add(scanner.nextLine());
    }

    public void setFromArrangement() {
        initializeAllColors();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                colors.get(i).set(j, arrangement.get(i));
            }
        }
    }

    public void initializeAllColors() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                colors.get(i).add("");
            }
        }
    }

    void getPatternArrangement(Pattern pattern) {
        for (int i = 0; i < 6; i++) {
            arrangement.add(pattern.colors.get(i).get(4));
        }
    }
}
