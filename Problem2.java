
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        findWall();
        findCorner();
    }
   public void findWall(){
       faceEast();
       if (!frontIsClear()){
       move();
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
   public void findCorner() {
       while(frontIsClear()) {
           turnLeft();
           if (!frontIsClear() && !nextToABeeper()) {
               putBeeper();
               turnRight();
            }
            else {
                move();
                turnLeft();
                    
        }
        
        move();
        checkCorner();
    }
   }
   public void turnRight() {
       turnLeft();
       turnLeft();
       turnLeft();
    }
   public void faceNorth() {
       if (!facingNorth()) {
           turnLeft();
        }
    }
    public void  faceEast() {
        if(!facingEast()) {
            turnLeft();
        }
    }
}



