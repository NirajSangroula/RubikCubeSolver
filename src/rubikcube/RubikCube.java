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
public class RubikCube {

    public RubikCubeRowBuilder rowBuilder = new RubikCubeRowBuilder();
    public SideRubikCubeRow face1, face3, side1, side3, top1, top3;
    public MidRubikCubeRow face2, side2, top2;

    public void build() {
        face1 = rowBuilder.face1;
        face2 = rowBuilder.face2;
        face3 = rowBuilder.face3;
        top1 = rowBuilder.top1;
        top2 = rowBuilder.top2;
        top3 = rowBuilder.top3;
        side1 = rowBuilder.side1;
        side2 = rowBuilder.side2;
        side3 = rowBuilder.side3;
    }

    public void rotateFaceClockwise() {
        RubikCubeCell r1 = rowBuilder.face1.getColumnCell1();
        RubikCubeCell r2 = rowBuilder.face1.getColumnCell2();
        RubikCubeCell r3 = rowBuilder.face1.getColumnCell3();
        rowBuilder.face1.setTopCell(r1);
        rowBuilder.face1.setMidCell(r2);
        rowBuilder.face1.setBottomCell(r3);
        rowBuilder.setTopFromFace();
        rowBuilder.setSideFromFace();
        build();
    }

    public void rotateFaceAntiClockwise() {
        RubikCubeCell r1 = rowBuilder.face1.getColumnCell1();
        r1.swapEdges();
        RubikCubeCell r2 = rowBuilder.face1.getColumnCell2();
        r2.swapEdges();
        RubikCubeCell r3 = rowBuilder.face1.getColumnCell3();
        r3.swapEdges();
        rowBuilder.face1.setTopCell(r3);
        rowBuilder.face1.setMidCell(r2);
        rowBuilder.face1.setBottomCell(r1);
        rowBuilder.setTopFromFace();
        rowBuilder.setSideFromFace();
        build();
    }

    public void rotateBackClockwise() {
        RubikCubeCell r1 = rowBuilder.face3.getColumnCell1();
        r1.swapEdges();
        RubikCubeCell r2 = rowBuilder.face3.getColumnCell2();
        r2.swapEdges();
        RubikCubeCell r3 = rowBuilder.face3.getColumnCell3();
        r3.swapEdges();
        rowBuilder.face3.setTopCell(r3);
        rowBuilder.face3.setMidCell(r2);
        rowBuilder.face3.setBottomCell(r1);
        rowBuilder.setTopFromFace();
        rowBuilder.setSideFromFace();
        build();
    }

    public void rotateBackAntiClockwise() {
        RubikCubeCell r1 = rowBuilder.face3.getColumnCell1();
        RubikCubeCell r2 = rowBuilder.face3.getColumnCell2();
        RubikCubeCell r3 = rowBuilder.face3.getColumnCell3();
        rowBuilder.face3.setTopCell(r1);
        rowBuilder.face3.setMidCell(r2);
        rowBuilder.face3.setBottomCell(r3);
        rowBuilder.setTopFromFace();
        rowBuilder.setSideFromFace();
        build();
    }

    public void rotateRightClockwise() {
        RubikCubeCell r1 = rowBuilder.side3.getColumnCell1();
        r1.swapEdges();
        RubikCubeCell r2 = rowBuilder.side3.getColumnCell2();
        r2.swapEdges();
        RubikCubeCell r3 = rowBuilder.side3.getColumnCell3();
        r3.swapEdges();

        rowBuilder.side3.setTopCell(r3);
        rowBuilder.side3.setMidCell(r2);
        rowBuilder.side3.setBottomCell(r1);
        rowBuilder.setFaceFromSide();
        rowBuilder.setTopFromFace();
        build();
    }

    public void rotateRightAntiClockwise() {
        RubikCubeCell r1 = rowBuilder.side3.getColumnCell1();
        RubikCubeCell r2 = rowBuilder.side3.getColumnCell2();
        RubikCubeCell r3 = rowBuilder.side3.getColumnCell3();

        rowBuilder.side3.setTopCell(r1);
        rowBuilder.side3.setMidCell(r2);
        rowBuilder.side3.setBottomCell(r3);
        rowBuilder.setFaceFromSide();
        rowBuilder.setTopFromFace();
        build();
    }

    public void rotateLeftAntiClockwise() {
        RubikCubeCell r1 = rowBuilder.side1.getColumnCell1();
        r1.swapEdges();
        RubikCubeCell r2 = rowBuilder.side1.getColumnCell2();
        r2.swapEdges();
        RubikCubeCell r3 = rowBuilder.side1.getColumnCell3();
        r3.swapEdges();

        rowBuilder.side1.setTopCell(r3);
        rowBuilder.side1.setMidCell(r2);
        rowBuilder.side1.setBottomCell(r1);
        rowBuilder.setFaceFromSide();
        rowBuilder.setTopFromFace();
        build();
    }

    public void rotateLeftClockwise() {
        RubikCubeCell r1 = rowBuilder.side1.getColumnCell1();
        RubikCubeCell r2 = rowBuilder.side1.getColumnCell2();
        RubikCubeCell r3 = rowBuilder.side1.getColumnCell3();

        rowBuilder.side1.setTopCell(r1);
        rowBuilder.side1.setMidCell(r2);
        rowBuilder.side1.setBottomCell(r3);
        rowBuilder.setFaceFromSide();
        rowBuilder.setTopFromFace();
        build();
    }

    public void rotateTopAntiClockwise() {
        RubikCubeCell r1 = rowBuilder.top1.getColumnCell1();
        r1.swapEdges();
        RubikCubeCell r2 = rowBuilder.top1.getColumnCell2();
        r2.swapEdges();
        RubikCubeCell r3 = rowBuilder.top1.getColumnCell3();
        r3.swapEdges();

        rowBuilder.top1.setTopCell(r3);
        rowBuilder.top1.setMidCell(r2);
        rowBuilder.top1.setBottomCell(r1);
        rowBuilder.setFaceFromTop();
        rowBuilder.setSideFromFace();
        build();
    }

    public void rotateTopClockwise() {
        RubikCubeCell r1 = rowBuilder.top1.getColumnCell1();
        RubikCubeCell r2 = rowBuilder.top1.getColumnCell2();
        RubikCubeCell r3 = rowBuilder.top1.getColumnCell3();

        rowBuilder.top1.setTopCell(r1);
        rowBuilder.top1.setMidCell(r2);
        rowBuilder.top1.setBottomCell(r3);
        rowBuilder.setFaceFromTop();
        rowBuilder.setSideFromFace();
        build();
    }

    public void rotateBottomClockwise() {
        RubikCubeCell r1 = rowBuilder.top3.getColumnCell1();
        r1.swapEdges();
        RubikCubeCell r2 = rowBuilder.top3.getColumnCell2();
        r2.swapEdges();
        RubikCubeCell r3 = rowBuilder.top3.getColumnCell3();
        r3.swapEdges();

        rowBuilder.top3.setTopCell(r3);
        rowBuilder.top3.setMidCell(r2);
        rowBuilder.top3.setBottomCell(r1);
        rowBuilder.setFaceFromTop();
        rowBuilder.setSideFromFace();
        build();
    }

    public void rotateBottomAntiClockwise() {
        RubikCubeCell r1 = rowBuilder.top3.getColumnCell1();
        RubikCubeCell r2 = rowBuilder.top3.getColumnCell2();
        RubikCubeCell r3 = rowBuilder.top3.getColumnCell3();

        rowBuilder.top3.setTopCell(r1);
        rowBuilder.top3.setMidCell(r2);
        rowBuilder.top3.setBottomCell(r3);
        rowBuilder.setFaceFromTop();
        rowBuilder.setSideFromFace();
        build();
    }

    public static RubikCubeRowBuilder getStandardRubikCube() {
        RubikCubeRowBuilder r1 = new RubikCubeRowBuilder();
        SideRubikCubeCell s11 = new SideRubikCubeCell(new EdgeRubikCubeUnitCell("red", "white", "blue"),
                new MidRubikCubeUnitCell("white", "blue"),
                new EdgeRubikCubeUnitCell("orange", "white", "blue"));
        MidRubikCubeCell m11 = new MidRubikCubeCell(new MidRubikCubeUnitCell("white", "red"),
                new CenterRubikCubeUnitCell("white"),
                new MidRubikCubeUnitCell("white", "orange"));
        SideRubikCubeCell s13 = new SideRubikCubeCell(new EdgeRubikCubeUnitCell("red", "white", "green"),
                new MidRubikCubeUnitCell("white", "green"),
                new EdgeRubikCubeUnitCell("orange", "white", "green"));

        SideRubikCubeRow rr1 = new SideRubikCubeRow(s11, m11, s13);

        MidRubikCubeCell m21 = new MidRubikCubeCell(new MidRubikCubeUnitCell("red", "blue"),
                new CenterRubikCubeUnitCell("blue"),
                new MidRubikCubeUnitCell("orange", "blue"));
        CenterRubikCubeCell c21 = new CenterRubikCubeCell(new CenterRubikCubeUnitCell("red"), new CenterRubikCubeUnitCell("orange"));
        MidRubikCubeCell m22 = new MidRubikCubeCell(new MidRubikCubeUnitCell("red", "green"),
                new CenterRubikCubeUnitCell("green"),
                new MidRubikCubeUnitCell("orange", "green"));

        MidRubikCubeRow rr2 = new MidRubikCubeRow(m21, c21, m22);

        SideRubikCubeCell s31 = new SideRubikCubeCell(new EdgeRubikCubeUnitCell("red", "yellow", "blue"),
                new MidRubikCubeUnitCell("yellow", "blue"),
                new EdgeRubikCubeUnitCell("orange", "yellow", "blue"));
        MidRubikCubeCell m31 = new MidRubikCubeCell(new MidRubikCubeUnitCell("yellow", "red"),
                new CenterRubikCubeUnitCell("yellow"),
                new MidRubikCubeUnitCell("yellow", "orange"));
        SideRubikCubeCell s33 = new SideRubikCubeCell(new EdgeRubikCubeUnitCell("red", "yellow", "green"),
                new MidRubikCubeUnitCell("yellow", "green"),
                new EdgeRubikCubeUnitCell("orange", "yellow", "green"));

        SideRubikCubeRow rr3 = new SideRubikCubeRow(s31, m31, s33);

        r1.face1 = rr1;
        r1.face2 = rr2;
        r1.face3 = rr3;
        return r1;
    }
}
