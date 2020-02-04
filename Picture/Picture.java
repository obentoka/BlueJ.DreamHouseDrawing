import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.*;
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 *
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Rec base;
    private Rec top;
    private Rec midBase;
    private Triangle leftMid;
    private Triangle rightMid;
    private Circle out;
    private Circle center;
    private Triangle left;
    private Triangle right;
    private Triangle mid;
    private Triangle botRight;
    private Triangle topRight;
    private Triangle topMidRight;
    private Triangle topMid;
    private Triangle topMidLeft;
    private Triangle topLeft;
    private Rec mountain;
    private Rec grass;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        mountain = new Rec();
        mountain.changeSize(300, 175);
        mountain.setCoor(0,0);
        mountain.changeColor("yellow");
        mountain.makeVisible();

        grass = new Rec();
        grass.changeSize(300,175);
        grass.setCoor(0, 135);
        grass.changeColor("green");
        grass.makeVisible();

        base = new Rec();
        base.changeSize(300,175);
        base.setCoor(0,250);
        base.changeColor("red");
        base.makeVisible();

        top = new Rec();
        top.changeSize(200, 150);
        top.setCoor(50,125);
        top.changeColor("red");
        top.makeVisible();

        midBase = new Rec();
        midBase.changeSize(200,50);
        midBase.setCoor(50,200);
        midBase.changeColor("yellow");
        midBase.makeVisible();

        leftMid = new Triangle();
        leftMid.changeSize(50,100);
        leftMid.setCoor(50,200);
        leftMid.changeColor("yellow");
        leftMid.makeVisible();

        rightMid = new Triangle();
        rightMid.changeSize(50,100);
        rightMid.setCoor(250,200);
        rightMid.changeColor("yellow");
        rightMid.makeVisible();

        out = new Circle();
        out.changeSize(50);
        out.setCoor(125,150);
        out.changeColor("white");
        out.makeVisible();

        center = new Circle();
        center.changeSize(40);
        center.setCoor(130, 155);
        center.changeColor("red");
        center.makeVisible();

        mid = new Triangle();
        mid.changeSize(35,10);
        mid.setCoor(150,155);
        mid.changeColor("black");
        mid.makeVisible();

        right = new Triangle();
        right.changeSize(15,5);
        right.setCoor(160,163);
        right.changeColor("black");
        right.makeVisible();

        left = new Triangle();
        left.changeSize(15,5);
        left.setCoor(140,163);
        left.changeColor("black");
        left.makeVisible();

        botRight = new Triangle();
        botRight.changeSize(15,30);
        botRight.setCoor(150,175);
        botRight.changeColor("black");
        botRight.makeVisible();

        topLeft = new Triangle();
        topLeft.changeSize(50, 20);
        topLeft.setCoor(60, 75);
        topLeft.changeColor("white");
        topLeft.makeVisible();

        topRight = new Triangle();
        topRight.changeSize(50, 20);
        topRight.setCoor(240, 75);
        topRight.changeColor("white");
        topRight.makeVisible();

        topMid  = new Triangle();
        topMid.changeSize(50, 20);
        topMid.setCoor(150, 75);
        topMid.changeColor("white");
        topMid.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(mountain != null)   // only if it's painted already...
        {

        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(mountain != null)   // only if it's painted already...
        {

        }
    }

}
