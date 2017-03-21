package model.coin;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class CoinAnimation {
	private Pane root;
	
	private Scene createScene(Node card) {
	    StackPane root = new StackPane();
	    root.getChildren().addAll(card);
	
	    Scene scene = new Scene(root, 600, 700, true, SceneAntialiasing.BALANCED);
	    scene.setCamera(new PerspectiveCamera());
	
	    return scene;
	}
	
	private Node createCoin () {
		return new ImageView (new Image(getClass().getResourceAsStream("")));
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
}
