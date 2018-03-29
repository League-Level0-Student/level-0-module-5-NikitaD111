import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setSpeed(100);
		rob.penDown();
		rob.hide();
		
		
		//1. Create a robot

		//2. Set the speed to 100

		int c =JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"red ","blue ", "green "}, 0);
		if(c == 0) {
			rob.setPenColor(247,0 ,0 );
		}
		if(c == 1) {
			rob.setPenColor(0,10 ,255 );
		}
		if(c == 2) {
			rob.setPenColor(0,255 ,14 );
		}
		String a = JOptionPane.showInputDialog("How may polygons do you want to draw");
		int b = Integer.parseInt(a);
		
		for (int i = 0; i < b; i++) {
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(1);
		}
		//3. Set the pen color of the robot according to the value of the colorChoise variable
		
		//4. Ask the use how many polygons they want to be drawn.
		
		//5. Use the robot to draw the number of polygons the user requested.
		
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

