import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.event.*;
public class MouseDemo extends Application
{
	public static void main(String args[])
	{
		launch(args);
	}
	public void start(Stage stage)
	{
		stage.setTitle("Mouse Events");
		Group g=new Group();
		Scene s=new Scene(g, 500, 500);
		Label l1=new Label("Mouse is Still. Background: Yellow");
		s.setFill(Color.YELLOW);
		s.setOnMouseClicked(new EventHandler <MouseEvent> ()
		{
			public void handle(MouseEvent me)
			{
				s.setFill(Color.YELLOW);
				l1.setText("Mouse is Clicked. Background: Yellow");
			}
		});
		s.setOnMouseMoved(new EventHandler <MouseEvent> ()
		{
			public void handle(MouseEvent me)
			{
				s.setFill(Color.BLUE);
				l1.setText("Mouse is Moved. Background: Blue");
			}
		});
		g.getChildren().add(l1);
		stage.setScene(s);
		stage.show();
	}
}