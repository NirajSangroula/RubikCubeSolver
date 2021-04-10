/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikcubesolver;
import rubikcube.*;

/**
 *
 * @author Niraj Sangroula
 */
public class PatternManipulator {
    public static Pattern getPatternFromRubikCube(RubikCube r1){
        Pattern pattern = new Pattern();
        pattern.getFaceColors().add(r1.face1.getTopCell().getCell1().getSide2().getColor());
        pattern.getFaceColors().add(r1.face1.getTopCell().getCell2().getSide2().getColor());
        pattern.getFaceColors().add(r1.face1.getTopCell().getCell3().getSide2().getColor());
        pattern.getFaceColors().add(r1.face1.getMidCell().getCell1().getSide2().getColor());
        pattern.getFaceColors().add(r1.face1.getMidCell().getCell2().getSide2().getColor());
        pattern.getFaceColors().add(r1.face1.getMidCell().getCell3().getSide2().getColor());
        pattern.getFaceColors().add(r1.face1.getBottomCell().getCell1().getSide2().getColor());
        pattern.getFaceColors().add(r1.face1.getBottomCell().getCell2().getSide2().getColor());
        pattern.getFaceColors().add(r1.face1.getBottomCell().getCell3().getSide2().getColor());
        
        pattern.getBackColors().add(r1.face3.getTopCell().getCell1().getSide2().getColor());
        pattern.getBackColors().add(r1.face3.getTopCell().getCell2().getSide2().getColor());
        pattern.getBackColors().add(r1.face3.getTopCell().getCell3().getSide2().getColor());
        pattern.getBackColors().add(r1.face3.getMidCell().getCell1().getSide2().getColor());
        pattern.getBackColors().add(r1.face3.getMidCell().getCell2().getSide2().getColor());
        pattern.getBackColors().add(r1.face3.getMidCell().getCell3().getSide2().getColor());
        pattern.getBackColors().add(r1.face3.getBottomCell().getCell1().getSide2().getColor());
        pattern.getBackColors().add(r1.face3.getBottomCell().getCell2().getSide2().getColor());
        pattern.getBackColors().add(r1.face3.getBottomCell().getCell3().getSide2().getColor());
        
        pattern.getRightColors().add(r1.side3.getTopCell().getCell1().getSide2().getColor());
        pattern.getRightColors().add(r1.side3.getMidCell().getCell1().getSide2().getColor());
        pattern.getRightColors().add(r1.side3.getBottomCell().getCell1().getSide2().getColor());
        pattern.getRightColors().add(r1.side3.getTopCell().getCell2().getSide2().getColor());
        pattern.getRightColors().add(r1.side3.getMidCell().getCell2().getSide2().getColor());
        pattern.getRightColors().add(r1.side3.getBottomCell().getCell2().getSide2().getColor());
        pattern.getRightColors().add(r1.side3.getTopCell().getCell3().getSide2().getColor());
        pattern.getRightColors().add(r1.side3.getMidCell().getCell3().getSide2().getColor());
        pattern.getRightColors().add(r1.side3.getBottomCell().getCell3().getSide2().getColor());
        
        pattern.getLeftColors().add(r1.side1.getBottomCell().getCell1().getSide2().getColor());
        pattern.getLeftColors().add(r1.side1.getMidCell().getCell1().getSide2().getColor());
        pattern.getLeftColors().add(r1.side1.getTopCell().getCell1().getSide2().getColor());
        pattern.getLeftColors().add(r1.side1.getBottomCell().getCell2().getSide2().getColor());
        pattern.getLeftColors().add(r1.side1.getMidCell().getCell2().getSide2().getColor());
        pattern.getLeftColors().add(r1.side1.getTopCell().getCell2().getSide2().getColor());
        pattern.getLeftColors().add(r1.side1.getBottomCell().getCell3().getSide2().getColor());
        pattern.getLeftColors().add(r1.side1.getMidCell().getCell3().getSide2().getColor());
        pattern.getLeftColors().add(r1.side1.getTopCell().getCell3().getSide2().getColor());
        
        
        pattern.getTopColors().add(r1.top1.getBottomCell().getCell3().getSide2().getColor());
        pattern.getTopColors().add(r1.top1.getBottomCell().getCell2().getSide2().getColor());
        pattern.getTopColors().add(r1.top1.getBottomCell().getCell1().getSide2().getColor());
        pattern.getTopColors().add(r1.top1.getMidCell().getCell3().getSide2().getColor());
        pattern.getTopColors().add(r1.top1.getMidCell().getCell2().getSide2().getColor());
        pattern.getTopColors().add(r1.top1.getMidCell().getCell1().getSide2().getColor());
        pattern.getTopColors().add(r1.top1.getTopCell().getCell3().getSide2().getColor());
        pattern.getTopColors().add(r1.top1.getTopCell().getCell2().getSide2().getColor());
        pattern.getTopColors().add(r1.top1.getTopCell().getCell1().getSide2().getColor());
        
        pattern.getBottomColors().add(r1.top3.getTopCell().getCell3().getSide2().getColor());
        pattern.getBottomColors().add(r1.top3.getTopCell().getCell2().getSide2().getColor());
        pattern.getBottomColors().add(r1.top3.getTopCell().getCell1().getSide2().getColor());
        pattern.getBottomColors().add(r1.top3.getMidCell().getCell3().getSide2().getColor());
        pattern.getBottomColors().add(r1.top3.getMidCell().getCell2().getSide2().getColor());
        pattern.getBottomColors().add(r1.top3.getMidCell().getCell1().getSide2().getColor());
        pattern.getBottomColors().add(r1.top3.getBottomCell().getCell3().getSide2().getColor());
        pattern.getBottomColors().add(r1.top3.getBottomCell().getCell2().getSide2().getColor());
        pattern.getBottomColors().add(r1.top3.getBottomCell().getCell1().getSide2().getColor());
        return pattern;
    }
    
    public static RubikCube getRubikCubeFromPattern(Pattern pattern){
        RubikCube rubikCube = new RubikCube();
        RubikCubeRowBuilder rb = rubikcube.RubikCube.getStandardRubikCube();
        rubikCube.rowBuilder = rb;
        rb.setSideFromFace();
        rb.setTopFromFace();
        rubikCube.build();
        rubikCube.face1.getTopCell().getCell1().getSide2().setColor(pattern.getFaceColors().get(0));
        rubikCube.face1.getTopCell().getCell1().getSide1().setColor(pattern.getLeftColors().get(2));
        rubikCube.face1.getTopCell().getCell1().getSide4().setColor(pattern.getTopColors().get(6));
        
        rubikCube.face1.getTopCell().getCell2().getSide2().setColor(pattern.getFaceColors().get(1));
        rubikCube.face1.getTopCell().getCell2().getSide4().setColor(pattern.getTopColors().get(7));
        
        rubikCube.face1.getTopCell().getCell3().getSide2().setColor(pattern.getFaceColors().get(2));
        rubikCube.face1.getTopCell().getCell3().getSide1().setColor(pattern.getRightColors().get(0));
        rubikCube.face1.getTopCell().getCell3().getSide4().setColor(pattern.getTopColors().get(8));
        
        rubikCube.face1.getMidCell().getCell1().getSide2().setColor(pattern.getFaceColors().get(3));
        rubikCube.face1.getMidCell().getCell1().getSide4().setColor(pattern.getLeftColors().get(5));
        
        rubikCube.face1.getMidCell().getCell2().getSide2().setColor(pattern.getFaceColors().get(4));
        
        rubikCube.face1.getMidCell().getCell3().getSide2().setColor(pattern.getFaceColors().get(5));
        rubikCube.face1.getMidCell().getCell3().getSide4().setColor(pattern.getRightColors().get(3));
        
        rubikCube.face1.getBottomCell().getCell1().getSide2().setColor(pattern.getFaceColors().get(6));
        rubikCube.face1.getBottomCell().getCell1().getSide1().setColor(pattern.getLeftColors().get(8));
        rubikCube.face1.getBottomCell().getCell1().getSide4().setColor(pattern.getBottomColors().get(0));
        
        rubikCube.face1.getBottomCell().getCell2().getSide2().setColor(pattern.getFaceColors().get(7));
        rubikCube.face1.getBottomCell().getCell2().getSide4().setColor(pattern.getBottomColors().get(1));
        
        rubikCube.face1.getBottomCell().getCell3().getSide2().setColor(pattern.getFaceColors().get(8));
        rubikCube.face1.getBottomCell().getCell3().getSide1().setColor(pattern.getRightColors().get(6));
        rubikCube.face1.getBottomCell().getCell3().getSide4().setColor(pattern.getBottomColors().get(2));
        
        rubikCube.face2.getTopCell().getCell1().getSide4().setColor(pattern.getTopColors().get(3));
        rubikCube.face2.getTopCell().getCell1().getSide2().setColor(pattern.getLeftColors().get(1));
        
        rubikCube.face2.getTopCell().getCell2().getSide2().setColor(pattern.getTopColors().get(4));
        
        rubikCube.face2.getTopCell().getCell3().getSide4().setColor(pattern.getTopColors().get(5));
        rubikCube.face2.getTopCell().getCell3().getSide2().setColor(pattern.getRightColors().get(1));
        
        rubikCube.face2.getBottomCell().getCell1().getSide4().setColor(pattern.getBottomColors().get(3));
        rubikCube.face2.getBottomCell().getCell1().getSide2().setColor(pattern.getLeftColors().get(7));
        
        rubikCube.face2.getBottomCell().getCell2().getSide2().setColor(pattern.getBottomColors().get(4));
        
        rubikCube.face2.getBottomCell().getCell3().getSide4().setColor(pattern.getBottomColors().get(5));
        rubikCube.face2.getBottomCell().getCell3().getSide2().setColor(pattern.getRightColors().get(7));
        
        
        rubikCube.face3.getTopCell().getCell1().getSide2().setColor(pattern.getBackColors().get(0));
        rubikCube.face3.getTopCell().getCell1().getSide1().setColor(pattern.getLeftColors().get(0));
        rubikCube.face3.getTopCell().getCell1().getSide4().setColor(pattern.getTopColors().get(0));
        
        rubikCube.face3.getTopCell().getCell2().getSide2().setColor(pattern.getBackColors().get(1));
        rubikCube.face3.getTopCell().getCell2().getSide4().setColor(pattern.getTopColors().get(1));
        
        rubikCube.face3.getTopCell().getCell3().getSide2().setColor(pattern.getBackColors().get(2));
        rubikCube.face3.getTopCell().getCell3().getSide1().setColor(pattern.getRightColors().get(2));
        rubikCube.face3.getTopCell().getCell3().getSide4().setColor(pattern.getTopColors().get(2));
        
        rubikCube.face3.getMidCell().getCell1().getSide2().setColor(pattern.getBackColors().get(3));
        rubikCube.face3.getMidCell().getCell1().getSide4().setColor(pattern.getLeftColors().get(3));
        
        rubikCube.face3.getMidCell().getCell2().getSide2().setColor(pattern.getBackColors().get(4));
        
        rubikCube.face3.getMidCell().getCell3().getSide2().setColor(pattern.getBackColors().get(5));
        rubikCube.face3.getMidCell().getCell3().getSide4().setColor(pattern.getRightColors().get(5));
        
        rubikCube.face3.getBottomCell().getCell1().getSide2().setColor(pattern.getBackColors().get(6));
        rubikCube.face3.getBottomCell().getCell1().getSide1().setColor(pattern.getLeftColors().get(6));
        rubikCube.face3.getBottomCell().getCell1().getSide4().setColor(pattern.getBottomColors().get(6));
        
        rubikCube.face3.getBottomCell().getCell2().getSide2().setColor(pattern.getBackColors().get(7));
        rubikCube.face3.getBottomCell().getCell2().getSide4().setColor(pattern.getBottomColors().get(7));
        
        rubikCube.face3.getBottomCell().getCell3().getSide2().setColor(pattern.getBackColors().get(8));
        rubikCube.face3.getBottomCell().getCell3().getSide1().setColor(pattern.getRightColors().get(8));
        rubikCube.face3.getBottomCell().getCell3().getSide4().setColor(pattern.getBottomColors().get(8));
        rb.setFace(rubikCube.face1, rubikCube.face2, rubikCube.face3);
        rb.setSideFromFace();
        rb.setTopFromFace();
        rubikCube.build();
        return rubikCube;
    }
}