package control;

import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.fxml.FXML;

public class AnimationController extends AnchorPane {
	@FXML private Button fastForwardButton;
	@FXML private Button backwardButton;
	@FXML private Button playButton;
	@FXML private Button skipButton;
	@FXML private Button stopButton;
	@FXML private Button pauseButton;
	@FXML private AnchorPane canvasPane;
	
	public void setAnimation () {
		Circle circle = new Circle ();
		circle.setRadius(10);
		circle.setCenterX(30);
		circle.setCenterY(30);
		
		canvasPane.getChildren().add(circle);
	}
}
