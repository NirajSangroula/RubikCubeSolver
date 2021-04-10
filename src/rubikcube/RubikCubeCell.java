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
public class RubikCubeCell {
    protected RubikCubeUnitCell cell1;
    protected RubikCubeUnitCell cell2;
    protected RubikCubeUnitCell cell3;
    
    public RubikCubeCell(){
        
    }
    public RubikCubeCell(RubikCubeUnitCell cell1, RubikCubeUnitCell cell2, RubikCubeUnitCell cell3){
        this.cell1 = cell1;
        this.cell2 = cell2;
        this.cell3 = cell3;
    }
    public void setCell1(RubikCubeUnitCell cell1){
        this.cell1 = cell1;
    }
    
    public void setCell2(RubikCubeUnitCell cell2){
        this.cell2 = cell2;
    }
    
    public void setCell3(RubikCubeUnitCell cell3){
        this.cell3 = cell3;
    }
    
    public RubikCubeUnitCell getCell1(){
        return cell1;
    }
    
    public RubikCubeUnitCell getCell2(){
        return cell2;
    }
    
    public RubikCubeUnitCell getCell3(){
        return cell3;
    }

    void swapEdges() {
        RubikCubeUnitCell r3 = getCell1();
        setCell1(getCell3());
        setCell3(r3);
    }
        
}
