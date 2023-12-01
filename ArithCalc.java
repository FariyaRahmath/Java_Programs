import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.event.*;
public class ArithCalc extends Application
{
	public static void main(String args[])
	{
		launch(args);
	}
	public void start(Stage stage)
	{
		stage.setTitle("Arithmetic Calculator");
		FlowPane f=new FlowPane();
		Scene s=new Scene(f, 400, 400);
		Label l1=new Label("Number 1: ");
		TextField t1=new TextField();
		Label l2=new Label("Number 2: ");
		TextField t2=new TextField();
		Label l3=new Label("Answer: ");
		TextField t3=new TextField();
		Button b1=new Button("+");
		b1.setOnAction(new EventHandler <ActionEvent> ()
		{
			public void handle(ActionEvent ae)
			{
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				t3.setText(" "+(a+b));
			}
		});
		Button b2=new Button("-");
		b2.setOnAction(new EventHandler <ActionEvent> ()
		{
			public void handle(ActionEvent ae)
			{
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				t3.setText(" "+(a-b));
			}
		});
		Button b3=new Button("*");
		b3.setOnAction(new EventHandler <ActionEvent> ()
		{
			public void handle(ActionEvent ae)
			{
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				t3.setText(" "+(a*b));
			}
		});
		Button b4=new Button("/");
		b4.setOnAction(new EventHandler <ActionEvent> ()
		{
			public void handle(ActionEvent ae) throws ArithmeticException
			{
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				t3.setText(" "+(a/b));
			}
		});
		f.getChildren().add(l1);
		f.getChildren().add(t1);
		f.getChildren().add(l2);
		f.getChildren().add(t2);
		f.getChildren().add(l3);
		f.getChildren().add(t3);
		f.getChildren().add(b1);
		f.getChildren().add(b2);
		f.getChildren().add(b3);
		f.getChildren().add(b4);
		stage.setScene(s);
		stage.show();
	}
}