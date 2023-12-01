import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.event.*;
public class Calculator extends Application
{
	public static void main(String args[]) throws Exception
	{
		launch(args);
	}
	public void start(Stage stage)
	{
		stage.setTitle("Calculator");
		FlowPane f=new FlowPane();
		Scene s=new Scene(f, 400, 400);
		Label l1=new Label("X: ");
		TextField t1=new TextField();
		Label l2=new Label("Answer: ");
		Label l3=new Label("			");
		ToggleGroup tg=new ToggleGroup();
		RadioButton rb1=new RadioButton("X+X");
		RadioButton rb2=new RadioButton("Cube of X");
		RadioButton rb3=new RadioButton("Square of X");
		RadioButton rb4=new RadioButton("1/X");
			rb1.setToggleGroup(tg);
			rb2.setToggleGroup(tg);
			rb3.setToggleGroup(tg);
			rb4.setToggleGroup(tg);
		rb1.setOnAction(new EventHandler <ActionEvent> ()
		{
			public void handle(ActionEvent ae)
			{
				if(rb1.isSelected())
				{
					int a=Integer.parseInt(t1.getText());
					l3.setText(" "+(a+a));
				}
			}
		});
		rb2.setOnAction(new EventHandler <ActionEvent> ()
		{
			public void handle(ActionEvent ae)
			{
				if(rb2.isSelected())
				{
					int a=Integer.parseInt(t1.getText());
					l3.setText(" "+(a*a*a));
				}
			}
		});
		rb3.setOnAction(new EventHandler <ActionEvent> ()
		{
			public void handle(ActionEvent ae)
			{
				if(rb3.isSelected())
				{
					int a=Integer.parseInt(t1.getText());
					l3.setText(" "+(a*a));
				}
			}
		});
		rb4.setOnAction(new EventHandler <ActionEvent> ()
		{
			public void handle(ActionEvent ae)
			{
				if(rb4.isSelected())
				{
					int a=Integer.parseInt(t1.getText());
					l3.setText(" "+(1/a));
				}
			}
		});
		f.getChildren().add(l1);
		f.getChildren().add(t1);
		f.getChildren().add(l2);
		f.getChildren().add(l3);
		f.getChildren().add(rb1);
		f.getChildren().add(rb2);
		f.getChildren().add(rb3);
		f.getChildren().add(rb4);
		stage.setScene(s);
		stage.show();
	}
}