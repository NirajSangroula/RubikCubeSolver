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
public class CenterRubikCubeCell extends MidRubikCubeCell{
    
    public CenterRubikCubeCell(CenterRubikCubeUnitCell c1, CenterRubikCubeUnitCell c2) {
        super(c1, new VirtualRubikCubeUnitCell(), c2);
    }
    
}
