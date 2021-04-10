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
public class EdgeRubikCubeUnitCell extends RubikCubeUnitCell{

    EdgeRubikCubeUnitCell(String color1, String color2, String color4) {
        side1.setColor(color1);
        side2.setColor(color2);
        side4.setColor(color4);
    }

    @Override
    public Side getSide3(){
        return null;
    }
    
    public static EdgeRubikCubeUnitCell getInstance(RubikCubeUnitCell c1){
        return new EdgeRubikCubeUnitCell(c1.side1.getColor(), c1.side2.getColor(), c1.side4.getColor());
    }
}
