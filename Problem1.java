
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
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
            if (frontIsClear()) {
                exitWall();
            }
            else {
                turnLeft();
            }
            move();
            checkCorner();
        }
    }
    public void exitWall() {
        move();
        move();
    }
    public void faceNorth(){
        if (!facingNorth()) {
            turnLeft();
        }
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
    public void checkOpening() {
        turnRight();
        if (frontIsClear()) {
            exitWall();
        }
        
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
}

