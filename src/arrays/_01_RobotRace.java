package arrays;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		boolean robotReachedTop=false;
		
	//2. create an array of 5 robots.
		Robot[] robots = new Robot[7];
	//3. use a for loop to initialize the robots.
		//4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i=0; i < robots.length;i++) {
			robots[i]=new Robot();
			robots[i].setX((i* 100) + 200);
			robots[i].setY(500);
			robots[i].setSpeed(50);
		}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		while (!robotReachedTop) {
			for (int i=0; i < robots.length;i++) {
				robots[i].move((int) (Math.random() *100));
				robots[i].turn((int) (Math.random()* 360));
				
				if (robots[i].getY()<=0) {
					robotReachedTop=true;
					robots[i].setAngle(180);
					robots[i].move(250);
				}
				

			}
		}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}	
}
