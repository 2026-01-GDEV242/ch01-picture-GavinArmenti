/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 * 
 * modified by Gavin Armenti for assignment on 2/2/2026
 */
public class Picture
{
    /*private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;*/
    private Square hull;
    private Square hood;
    private Square trunk;
    private Triangle FdoorHandle;
    private Circle Fwheel;
    private Circle Rwheel;
    private Person hoodOrnament;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        /*wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();*/
        hull = new Square();
        hood = new Square();
        trunk = new Square();
        FdoorHandle = new Triangle();
        Fwheel = new Circle();
        Rwheel = new Circle();
        hoodOrnament = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            /* wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            */
           

           
           hoodOrnament.moveVertical(-50);
           hoodOrnament.moveHorizontal(20);
           hoodOrnament.changeSize(30,15);
           hoodOrnament.makeVisible();
           
           hull.changeSize(100);
           hull.moveVertical(-25);
           hull.moveHorizontal(-150);
           hull.makeVisible();
           
           hood.changeSize(50);
           hood.moveHorizontal(-50);
           hood.moveVertical(25);
           hood.makeVisible();
           
           trunk.changeSize(50);
           trunk.moveHorizontal(-200);
           trunk.moveVertical(25);
           trunk.makeVisible();
           
           Fwheel.changeSize(50);
           Fwheel.moveHorizontal(10);
           Fwheel.moveVertical(75);
           Fwheel.makeVisible();
           Fwheel.changeColor("black");
           
           Rwheel.changeSize(50);
           Rwheel.moveHorizontal(-100);
           Rwheel.moveVertical(75);
           Rwheel.makeVisible();
           Rwheel.changeColor("black");
           
           FdoorHandle.changeSize(-20,20);
           FdoorHandle.moveHorizontal(20);
           FdoorHandle.moveVertical(15);
           FdoorHandle.makeVisible();
           
           drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        /*wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");*/
        
        hull.changeColor("black");
        hood.changeColor("black");
        trunk.changeColor("black");
        FdoorHandle.changeColor("white");
        Fwheel.changeColor("black");
        Rwheel.changeColor("black");
        //hoodOrnament.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        /*wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");*/
        
        hull.changeColor("red");
        hood.changeColor("red");
        trunk.changeColor("red");
        FdoorHandle.changeColor("green");
        //Fwheel.changeColor("black");
        //Rwheel.changeColor("black");
        //hoodOrnament.changeColor("black");
    }
}
