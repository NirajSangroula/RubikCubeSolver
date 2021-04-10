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
public class VirtualRubikCubeUnitCell extends CenterRubikCubeUnitCell{
    
    public VirtualRubikCubeUnitCell() {
        super(Side.DISABLED);
    }
    
    @Override
    public Side getSide2(){
        return null;
    }
    
}
