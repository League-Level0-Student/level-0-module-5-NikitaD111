/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

public class CircleRing {
    public static void main(String[] args) throws Exception {
Robot rob = new Robot();
rob.moveTo(150, 200);
rob.penDown();
rob.setSpeed(100);
for (int i = 1; i < 361; i++) {
	rob.move(3);
	rob.turn(1);
	if(i % 20 == 0) {
		for (int j = 1; j <361; j++) {
			rob.move(1);
			rob.turn(1);
		}
	}
}
        // 1. Make a new Robot


       //  2. Set your robot’s position to x=150 and y=200

        // 3. Put the robot's pen down

        // 4. Set the robot’s speed to 10

        // 5. Do everything below here 360 times (use i as the counter)

	        // 6. Move the robot 3 pixels

       //  7. Turn the robot 1 degree

        // 8. If the counter i is divisible by 20 (hint: use mod operator  %)..

		// 9. do steps 10 and 11 exactly 360 times (use j as the counter)

				// 10. Move the robot 1 pixel

				// 11. Turn the robot 1 degree
}
}
