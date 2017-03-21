package debug;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TestAnimation extends Application {
 
	  @Override
	    public void start(Stage stage) throws Exception {
	        Node card = createCard();

	        stage.setScene(createScene(card));
	        stage.show();

	        RotateTransition rotator = createRotator(card);
	        rotator.play();
	    }

	    private Scene createScene(Node card) {
	        StackPane root = new StackPane();
	        root.getChildren().addAll(card);

	        Scene scene = new Scene(root, 600, 700, true, SceneAntialiasing.BALANCED);
	        scene.setCamera(new PerspectiveCamera());

	        return scene;
	    }

	    private Node createCard () {
	    	Circle circ = new Circle (100);
	    	circ.setFill(Color.YELLOW);
	        return circ;
	    }

	    private RotateTransition createRotator(Node card) {
	        RotateTransition rotator = new RotateTransition(Duration.millis(1000), card);
	        
	        rotator.setAxis(Rotate.Y_AXIS);
	        rotator.setFromAngle(0);
	        rotator.setToAngle(360);
	        rotator.setInterpolator(Interpolator.LINEAR);
	        rotator.setCycleCount(10);

	        return rotator;
	    }

	    public static void main(String[] args) {
	        launch();
	    }
}
