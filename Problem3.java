 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        findWall();
        followWall();

    }
   public void findWall() {
        faceWest();
        while(frontIsClear()) {
            super.move();
        }
        turnLeft();
    }
    public void followWall() {
        while (frontIsClear()) {
            turnRight();
            if (frontIsClear() && !nextToABeeper()) {
                sealWindow();
            }
            else {
                turnLeft();
            }
            move();
            checkCorner();
            checkBeeper();
        }
    }
    public void sealWindow() {
        putBeeper();
        turnLeft();
        
    }
    public void faceWest() {
        if(!facingWest()) {
            turnLeft();
        }
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void checkCorner() {
        if (!frontIsClear()) {
            turnLeft();
            if(!frontIsClear()) {
                turnLeft();
                turnLeft();
            }
        }
    }
    public void checkBeeper() {
        if (nextToABeeper()) {
            turnOff();
        }
    }
}


