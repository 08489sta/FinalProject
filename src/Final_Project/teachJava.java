/**
 * 
 */
package Final_Project;

import javafx.stage.Stage;
public class teachJava {

	
	public static void main(String[] args) {
		@Override
		public void start(Stage stage) throws Exception
		{
			//create and configure the main circle for the face
			Circle face = new Circle (125, 125, 80);
			face.setFill (Color.YELLOW);
			face.setStroke(Color.RED);
			
			//create and configure the right eye for the face
			Circle rightEye = new Circle (86, 100, 10);
			rightEye.setFill (Color.YELLOW);
			rightEye.setStroke(Color.BLUE);
			
			//create and configure the left eye for the face
			Circle leftEye = new Circle (162, 100, 10);
			leftEye.setFill (Color.YELLOW);
			leftEye.setStroke(Color.BLUE);
			
			//create and configure a smiling mouth
			Arc mouth = new Arc (125, 150, 45, 35, 0, -180);
			mouth.setFill (Color.YELLOW);
			mouth.setStroke(Color.BLUE);
			mouth.setType(ArcType.OPEN);
			
			//create and configure the text
			Text caption = new Text(80, 240, "Smiley Face");
			caption.setFill(Color.STEELBLUE);
			caption.setFont(Font.font("Verdana", 15));
			
			//create a group that holds all the features and configure a scene to hold
			Group root = new Group(face, rightEye, leftEye, mouth, caption);
			Scene scene = new Scene(root, 250, 275, Color.YELLOW);
		
			//add the scene to the stage and set the title
			stage.setScene(scene);
			stage.setTitle("Smiley Face");

			//show the stage
			stage.show();
		}
 
		//initialize choice variable
		int choice = 0;
		lvlSelect(choice);
		
		//print welcome and buttons
		
		//if exit button clicked... end program
		
		//if lvlselect clicked... run lvlselect()... run lesson(choice)

		//if scratch clicked... set choice = 1 ... run lesson(choice)
	
	}//end main

	public static int lvlSelect(int choice) 
	{
		
		//display screen
		//initialize buttons
		
		
		//if btn1 clicked set choice = 1
		//if btn2 clicked set choice = 2
		//if btn3 clicked set choice = 3
		//if btn4 clicked set choice = 4
		//if btn5 clicked set choice = 5
		//if btn6 clicked set choice = 6
		//if btn7 clicked set choice = 7
		//if btn8 clicked set choice = 8
		//if btn9 clicked set choice = 9
		
		return choice;
	}//end method lvlselect
	
	public static void lessonPage(choice) {
		
		//print screen and buttons
		
		//open file "Lesson L (choice #)" input to left label
		//open file "Lesson R (choice #)" input to right label
		
		//create progress bar based on choice variable 'x/9'
		
		//Initialize 
		
	}
	
	
}
