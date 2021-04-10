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
public class RubikCubeUnitCell {
    protected Side side1;
    protected Side side2;
    protected Side side3;
    protected Side side4;

    public RubikCubeUnitCell(){
        side1 = new Side();
        side2 = new Side();
        side3 = new Side();
        side4 = new Side();
    }
    
    /**
     * 
     * @return
     * Left Side
     */
    public Side getSide1() {
        return side1;
    }
    
    
    /**
     * 
     * @return
     * Face Side
     */
    public Side getSide2() {
        return side2;
    }
    
    
    /**
     * 
     * @return
     * Right Side
     */
    public Side getSide3() {
        return side3;
    }

    
    /**
     * 
     * @return
     * Upper/Lower Side
     */
    public Side getSide4() {
        return side4;
    }
    
    
    public RubikCubeUnitCell getChangedToSide() {
        RubikCubeUnitCell e = new EdgeRubikCubeUnitCell(side1.getColor(), side2.getColor(), side4.getColor());
        Side sideTwo = e.side1;
        Side sideFour = e.side2;
        e.side1 = e.side4;
        e.side4 = sideFour;
        e.side2 = sideTwo;
        return e;
    }
    
        public RubikCubeUnitCell getChangedToFace3() {
        RubikCubeUnitCell e = new EdgeRubikCubeUnitCell(side1.getColor(), side2.getColor(), side4.getColor());
        Side sideTwo = e.side4;
        Side sideFour = e.side1;
        e.side1 = e.side2;
        e.side4 = sideFour;
        e.side2 = sideTwo;
        return e;
    }
    
    public RubikCubeUnitCell getChangedToFace(){
        RubikCubeUnitCell e = new EdgeRubikCubeUnitCell(side1.getColor(), side2.getColor(), side4.getColor());
        Side sideTwo = e.side4;
        Side sideFour = e.side1;
        e.side1 = e.side2;
        e.side4 = sideFour;
        e.side2 = sideTwo;
        return e;
    }
    
    public RubikCubeUnitCell getExchanged(){
        RubikCubeUnitCell e = new EdgeRubikCubeUnitCell(side1.getColor(), side2.getColor(), side4.getColor());
        Side sideFour = e.side2;
        e.side2 = e.side4;
        e.side4 = sideFour;
        return e;
    }
    
    public RubikCubeUnitCell getSwappedSides(){
        RubikCubeUnitCell e = new EdgeRubikCubeUnitCell(side1.getColor(), side2.getColor(), side4.getColor());
        Side sideOne = e.side4;
        e.side4 = e.side1;
        e.side1 = sideOne;
        return e;
    }
}
