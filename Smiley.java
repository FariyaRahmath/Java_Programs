import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.animation.*;
import javafx.animation.Animation;
import javafx.util.Duration;
import javafx.animation.TranslateTransition.*;
public class Smiley extends Application
{
	public static void main(String args[])
	{
		launch(args);
	}
	public void start(Stage stage)
	{
		stage.setTitle("Smiley");
		Group g=new Group();
		Scene s=new Scene(g, 400, 400, Color.BLUE);
		Circle c=new Circle(200,200,100);
			c.setFill(Color.YELLOW);
			c.setStroke(Color.RED);
		Circle c1=new Circle(160,160,10);
			c1.setFill(Color.GREEN);
		Circle c2=new Circle(240, 160,10);
			c2.setFill(Color.GREEN);
		Arc a=new Arc(200.0, 220.0, 50.0, 40.0, 180.0, 180.0);
			a.setFill(Color.BLACK);
		TranslateTransition tt1=new TranslateTransition();
			g.getChildren().add(c);
			g.getChildren().add(c1);
			g.getChildren().add(c2);
			g.getChildren().add(a);
		stage.setScene(s);
		stage.show();
	}
}