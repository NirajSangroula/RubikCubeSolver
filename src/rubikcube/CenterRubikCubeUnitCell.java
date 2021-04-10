/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikcube;

/**
 *
 * @author Administrator
 */
public class CenterRubikCubeUnitCell extends MidRubikCubeUnitCell{
    
    public CenterRubikCubeUnitCell(String color2) {
        super(color2, Side.DISABLED);
    }
    
    @Override
    public Side getSide4(){
        return null;
    }
    
    public static CenterRubikCubeUnitCell getInstance(RubikCubeUnitCell c1){
        return new CenterRubikCubeUnitCell(c1.side2.getColor());
    }
}
