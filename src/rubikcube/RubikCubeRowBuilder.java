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
public class RubikCubeRowBuilder {
    SideRubikCubeRow face1, face3, side1, side3, top1, top3;
    MidRubikCubeRow face2, side2, top2;
    public void setFace(SideRubikCubeRow face1, MidRubikCubeRow face2, SideRubikCubeRow face3){
        this.face1 = face1;
        this.face2 = face2;
        this.face3 = face3;
    }
    
    public void setSideFromFace(){
        //For Side 1
       SideRubikCubeCell e1 = 
               new SideRubikCubeCell(
                       EdgeRubikCubeUnitCell.getInstance(getChangedToSideTopCellCell1(face1)),
                       MidRubikCubeUnitCell.getInstance(getExchangedMidCellCell1(face1)),
                       EdgeRubikCubeUnitCell.getInstance(getChangedToSideBottomCellCell1(face1))
               );
       
       MidRubikCubeCell e2 = new MidRubikCubeCell(
               MidRubikCubeUnitCell.getInstance(face2.topCell.cell1),
               CenterRubikCubeUnitCell.getInstance(face2.midCell.cell1),
               MidRubikCubeUnitCell.getInstance(face2.bottomCell.cell1)
       );
       
       SideRubikCubeCell e3 = 
               new SideRubikCubeCell(
                       EdgeRubikCubeUnitCell.getInstance(getChangedToSideTopCellCell1(face3)),
                       MidRubikCubeUnitCell.getInstance(getExchangedMidCellCell1(face3)),
                       EdgeRubikCubeUnitCell.getInstance(getChangedToSideBottomCellCell1(face3))
               );
        
       side1 = new SideRubikCubeRow(e1, e2, e3);
       //For Side 2
       MidRubikCubeCell em1 = new MidRubikCubeCell(
               MidRubikCubeUnitCell.getInstance(getExchangedTopCellCell2(face1)),
               CenterRubikCubeUnitCell.getInstance(face1.midCell.cell2),
               MidRubikCubeUnitCell.getInstance(getExchangedBottomCellCell2(face1))
       );
       
       CenterRubikCubeCell em2 = 
               new CenterRubikCubeCell(CenterRubikCubeUnitCell.getInstance(face2.topCell.cell2),
                CenterRubikCubeUnitCell.getInstance(face2.bottomCell.cell2));
       
       
       MidRubikCubeCell em3 = new MidRubikCubeCell(
               MidRubikCubeUnitCell.getInstance(getExchangedTopCellCell2(face3)),
               CenterRubikCubeUnitCell.getInstance(face3.midCell.cell2),
               MidRubikCubeUnitCell.getInstance(getExchangedBottomCellCell2(face3))
       );
       
       side2 = new MidRubikCubeRow(em1, em2, em3);
       // For Side 3
       SideRubikCubeCell eb1 = 
               new SideRubikCubeCell(
                       EdgeRubikCubeUnitCell.getInstance(getChangedToSideTopCellCell3(face1)),
                       MidRubikCubeUnitCell.getInstance(getExchangedMidCellCell3(face1)),
                       EdgeRubikCubeUnitCell.getInstance(getChangedToSideBottomCellCell3(face1))
               );
       
       MidRubikCubeCell eb2 = new MidRubikCubeCell(
               MidRubikCubeUnitCell.getInstance(face2.topCell.cell3),
               CenterRubikCubeUnitCell.getInstance(face2.midCell.cell3),
               MidRubikCubeUnitCell.getInstance(face2.bottomCell.cell3)
       );
       
       SideRubikCubeCell eb3 = 
               new SideRubikCubeCell(
                       EdgeRubikCubeUnitCell.getInstance(getChangedToSideTopCellCell3(face3)),
                       MidRubikCubeUnitCell.getInstance(getExchangedMidCellCell3(face3)),
                       EdgeRubikCubeUnitCell.getInstance(getChangedToSideBottomCellCell3(face3))
               );
        
       side3 = new SideRubikCubeRow(eb1, eb2, eb3);
    }
    
    public void setTopFromFace(){
        //For Top 1
       SideRubikCubeCell e1 = 
               new SideRubikCubeCell(
                       EdgeRubikCubeUnitCell.getInstance(face1.topCell.cell3.getExchanged()),
                       MidRubikCubeUnitCell.getInstance(face1.topCell.cell2.getExchanged()),
                       EdgeRubikCubeUnitCell.getInstance(face1.topCell.cell1.getExchanged())
               );
       
       MidRubikCubeCell e2 = new MidRubikCubeCell(
               MidRubikCubeUnitCell.getInstance(face2.topCell.cell3.getExchanged()),
               CenterRubikCubeUnitCell.getInstance(face2.topCell.cell2),
               MidRubikCubeUnitCell.getInstance(face2.topCell.cell1.getExchanged())
       );
       
       SideRubikCubeCell e3 = 
               new SideRubikCubeCell(
                       EdgeRubikCubeUnitCell.getInstance(face3.topCell.cell3.getExchanged()),
                       MidRubikCubeUnitCell.getInstance(face3.topCell.cell2.getExchanged()),
                       EdgeRubikCubeUnitCell.getInstance(face3.topCell.cell1.getExchanged())
               );
        
       top1 = new SideRubikCubeRow(e1, e2, e3);
       
       //For Top 2
       MidRubikCubeCell em1 = new MidRubikCubeCell(
               MidRubikCubeUnitCell.getInstance(face1.midCell.cell3.getExchanged()),
               CenterRubikCubeUnitCell.getInstance(face1.midCell.cell2),
               MidRubikCubeUnitCell.getInstance(face1.midCell.cell1.getExchanged())
       );
       
       CenterRubikCubeCell em2 = 
               new CenterRubikCubeCell(CenterRubikCubeUnitCell.getInstance(face2.midCell.cell3),
                CenterRubikCubeUnitCell.getInstance(face2.midCell.cell1));
       
       
       MidRubikCubeCell em3 = new MidRubikCubeCell(
               MidRubikCubeUnitCell.getInstance(face3.midCell.cell3.getExchanged()),
               CenterRubikCubeUnitCell.getInstance(face3.midCell.cell2),
               MidRubikCubeUnitCell.getInstance(face3.midCell.cell1.getExchanged())
       );
       
       top2 = new MidRubikCubeRow(em1, em2, em3);
       
        //For Top 3
       SideRubikCubeCell eb1 = 
               new SideRubikCubeCell(
                       EdgeRubikCubeUnitCell.getInstance(face1.bottomCell.cell3.getExchanged()),
                       MidRubikCubeUnitCell.getInstance(face1.bottomCell.cell2.getExchanged()),
                       EdgeRubikCubeUnitCell.getInstance(face1.bottomCell.cell1.getExchanged())
               );
       
       MidRubikCubeCell eb2 = new MidRubikCubeCell(
               MidRubikCubeUnitCell.getInstance(face2.bottomCell.cell3.getExchanged()),
               CenterRubikCubeUnitCell.getInstance(face2.bottomCell.cell2),
               MidRubikCubeUnitCell.getInstance(face2.bottomCell.cell1.getExchanged())
       );
       
       SideRubikCubeCell eb3 = 
               new SideRubikCubeCell(
                       EdgeRubikCubeUnitCell.getInstance(face3.bottomCell.cell3.getExchanged()),
                       MidRubikCubeUnitCell.getInstance(face3.bottomCell.cell2.getExchanged()),
                       EdgeRubikCubeUnitCell.getInstance(face3.bottomCell.cell1.getExchanged())
               );
        
       top3 = new SideRubikCubeRow(eb1, eb2, eb3);
    }
    
    public void setFaceFromTop(){
        RubikCubeRowBuilder r1 = new RubikCubeRowBuilder();
        r1.face1 = top1;
        r1.face2 = top2;
        r1.face3 = top3;
        r1.setTopFromFace();
        face1 = r1.top1;
        face2 = r1.top2;
        face3 = r1.top3;
    }
    
    public void setFaceFromSide(){
        //For Face 1
       SideRubikCubeCell e1 = 
               new SideRubikCubeCell(
                       EdgeRubikCubeUnitCell.getInstance(side1.topCell.cell1.getChangedToFace()),
                       MidRubikCubeUnitCell.getInstance(side2.topCell.cell1.getExchanged()),
                       EdgeRubikCubeUnitCell.getInstance(side3.topCell.cell1.getChangedToFace())
               );
       
       MidRubikCubeCell e2 = new MidRubikCubeCell(
               MidRubikCubeUnitCell.getInstance(side1.topCell.cell2.getExchanged()),
               CenterRubikCubeUnitCell.getInstance(side2.topCell.cell2),
               MidRubikCubeUnitCell.getInstance(side3.topCell.cell2.getExchanged())
       );
       
       SideRubikCubeCell e3 = 
               new SideRubikCubeCell(
                       EdgeRubikCubeUnitCell.getInstance(side1.topCell.cell3.getChangedToFace()),
                       MidRubikCubeUnitCell.getInstance(side2.topCell.cell3.getExchanged()),
                       EdgeRubikCubeUnitCell.getInstance(side3.topCell.cell3.getChangedToFace())
               );
        
       face1 = new SideRubikCubeRow(e1, e2, e3);
       
        //For Face 2
       MidRubikCubeCell em1 = new MidRubikCubeCell(
               MidRubikCubeUnitCell.getInstance(side1.midCell.cell1),
               CenterRubikCubeUnitCell.getInstance(side2.midCell.cell1),
               MidRubikCubeUnitCell.getInstance(side3.midCell.cell1)
       );
       
       CenterRubikCubeCell em2 = 
               new CenterRubikCubeCell(CenterRubikCubeUnitCell.getInstance(side1.midCell.cell2),
                CenterRubikCubeUnitCell.getInstance(side3.midCell.cell2));
       
       
       MidRubikCubeCell em3 = new MidRubikCubeCell(
               MidRubikCubeUnitCell.getInstance(side1.midCell.cell3),
               CenterRubikCubeUnitCell.getInstance(side2.midCell.cell3),
               MidRubikCubeUnitCell.getInstance(side3.midCell.cell3)
       );
       
       face2 = new MidRubikCubeRow(em1, em2, em3);
       
       
        //For Face 3
       SideRubikCubeCell eb1 = 
               new SideRubikCubeCell(
                       EdgeRubikCubeUnitCell.getInstance(side1.bottomCell.cell1.getChangedToFace3()),
                       MidRubikCubeUnitCell.getInstance(side2.bottomCell.cell1.getExchanged()),
                       EdgeRubikCubeUnitCell.getInstance(side3.bottomCell.cell1.getChangedToFace3())
               );
       
       MidRubikCubeCell eb2 = new MidRubikCubeCell(
               MidRubikCubeUnitCell.getInstance(side1.bottomCell.cell2.getExchanged()),
               CenterRubikCubeUnitCell.getInstance(side2.bottomCell.cell2),
               MidRubikCubeUnitCell.getInstance(side3.bottomCell.cell2.getExchanged())
       );
       
       SideRubikCubeCell eb3 = 
               new SideRubikCubeCell(
                       EdgeRubikCubeUnitCell.getInstance(side1.bottomCell.cell3.getChangedToFace3()),
                       MidRubikCubeUnitCell.getInstance(side2.bottomCell.cell3.getExchanged()),
                       EdgeRubikCubeUnitCell.getInstance(side3.bottomCell.cell3.getChangedToFace3())
               );
        
       face3 = new SideRubikCubeRow(eb1, eb2, eb3);
    }
    
            
    private RubikCubeUnitCell getChangedToSideTopCellCell1(RubikCubeRow r1){
        return r1.topCell.cell1.getChangedToSide();
    }
    private RubikCubeUnitCell getChangedToSideBottomCellCell1(RubikCubeRow r1){
        return r1.bottomCell.cell1.getChangedToSide();
    }
    private RubikCubeUnitCell getExchangedMidCellCell1(RubikCubeRow r1){
        return r1.midCell.cell1.getExchanged();
    }
    private RubikCubeUnitCell getExchangedTopCellCell2(RubikCubeRow r1){
        return r1.topCell.cell2.getExchanged();
    }
    private RubikCubeUnitCell getExchangedBottomCellCell2(RubikCubeRow r1){
        return r1.bottomCell.cell2.getExchanged();
    }
    private RubikCubeUnitCell getExchangedMidCellCell3(RubikCubeRow r1){
        return r1.midCell.cell3.getExchanged();
    }
    private RubikCubeUnitCell getChangedToSideTopCellCell3(RubikCubeRow r1) {
        return r1.topCell.cell3.getChangedToSide();
    }
    private RubikCubeUnitCell getChangedToSideBottomCellCell3(RubikCubeRow r1) {
        return r1.bottomCell.cell3.getChangedToSide();
    }

    
}
