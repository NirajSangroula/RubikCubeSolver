/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikcube;

/**
 *
 * @author Niraj Sangroula
 */
public class SideRubikCubeRow extends RubikCubeRow implements Cloneable{
    public SideRubikCubeRow(SideRubikCubeCell s1, MidRubikCubeCell m1, SideRubikCubeCell s2){
        topCell = s1;
        midCell = m1;
        bottomCell = s2;
    }
}