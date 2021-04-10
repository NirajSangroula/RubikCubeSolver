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
public class MidRubikCubeUnitCell extends EdgeRubikCubeUnitCell{
    
    public MidRubikCubeUnitCell(String color2, String color4) {
        super(Side.DISABLED, color2, color4);
    }
    
    @Override
    public Side getSide1(){
        return null;
    }
    
    public static MidRubikCubeUnitCell getInstance(RubikCubeUnitCell c1){
        return new MidRubikCubeUnitCell(c1.side2.getColor(), c1.side4.getColor());
    }
}
