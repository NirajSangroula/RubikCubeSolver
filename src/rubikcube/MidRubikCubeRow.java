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
public class MidRubikCubeRow extends RubikCubeRow{
    public MidRubikCubeRow(MidRubikCubeCell m1, CenterRubikCubeCell c1, MidRubikCubeCell m2){
        this.topCell = m1;
        this.midCell = c1;
        this.bottomCell = m2;
    }
}
