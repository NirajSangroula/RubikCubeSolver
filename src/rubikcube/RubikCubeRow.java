/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikcube;

import java.util.ArrayList;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

/**
 *
 * @author Niraj Sangroula
 */
public class RubikCubeRow {
    protected RubikCubeCell topCell, bottomCell;
    protected RubikCubeCell midCell;
    
    public void setTopCell(RubikCubeCell c1) {
        topCell = c1;
    }

    public void setMidCell(RubikCubeCell c2) {
        midCell = c2;
    }

    public void setBottomCell(RubikCubeCell c3) {
        bottomCell = c3;
    }

    public RubikCubeCell getTopCell() {
        return topCell;
    }

    public RubikCubeCell getMidCell() {
        return midCell;
    }

    public RubikCubeCell getBottomCell() {
        return bottomCell;
    }
    
    public RubikCubeCell getColumnCell1() {
        return new RubikCubeCell(bottomCell.cell1.getSwappedSides(), midCell.cell1, topCell.cell1.getSwappedSides());
    }

    public RubikCubeCell getColumnCell2() {
        return new RubikCubeCell(bottomCell.cell2, midCell.cell2, topCell.cell2);
    }

    public RubikCubeCell getColumnCell3() {
        return new RubikCubeCell(bottomCell.cell3.getSwappedSides(), midCell.cell3, topCell.cell3.getSwappedSides());
    }
    
    
    
    public ArrayList<String> getNineColors(){
        ArrayList<String> r = new ArrayList<>();
        r.add(this.topCell.cell1.side2.getColor());
        r.add(this.topCell.cell2.side2.getColor());
        r.add(this.topCell.cell3.side2.getColor());
        r.add(this.midCell.cell1.side2.getColor());
        r.add(this.midCell.cell2.side2.getColor());
        r.add(this.midCell.cell3.side2.getColor());
        r.add(this.bottomCell.cell1.side2.getColor());
        r.add(this.bottomCell.cell2.side2.getColor());
        r.add(this.bottomCell.cell3.side2.getColor());
        return r;
    }
}
