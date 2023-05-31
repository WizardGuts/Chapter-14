import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class DisplayClock extends Application {
@Override // Override the start method in the Application class
public void start(Stage primaryStage) {
ClockPane clock = new ClockPane();
String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
clock.setHourHandVisible(true);
clock.setMinuteHandVisible(true);
clock.setSecondHandVisible(false);
Label lblCurrentTime = new Label(timeString);

BorderPane pane = new BorderPane();
pane.setCenter(clock);
pane.setBottom(lblCurrentTime);
BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
Scene scene = new Scene(pane, 250, 250);
primaryStage.setTitle("DisplayClock"); // Set the stage title
primaryStage.setScene(scene); // Place the scene in the stage
primaryStage.show(); // Display the stage
}
}