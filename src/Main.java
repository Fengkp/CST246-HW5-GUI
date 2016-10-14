import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    final Button stackBtn = new Button("Stack");
    final Button queueBtn = new Button("Queue");
    final Button showBtn = new Button("Show");
    final ListView<String> stackView = new ListView<>();
    final ListView<String> queueView = new ListView<>();

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        stage.setTitle("Student List");

        Student student1 = new Student("Fred", 123456, 3.2, "Math");
        Student student2 = new Student("Kelly", 123457, 3.5, "Psychology");
        Student student3 = new Student("Bob", 123454, 2.2, "Medicine");
        Student student4 = new Student("Joe", 123453, 1.6, "Music");
        Student student5 = new Student("Jane", 123458, 2.8, "History");
        Stack studentStack = new Stack(5);
        Queue studentQueue = new Queue(5);

        ComboBox studentComboBox = new ComboBox();
        studentComboBox.getItems().addAll(
                student1, student2, student3, student4, student5);
        studentComboBox.setPromptText("Student List");
        studentComboBox.setEditable(false);

        stackBtn.setOnAction(e ->
                studentStack.push((Student)studentComboBox.getValue()));
        queueBtn.setOnAction(e ->
                studentQueue.insert((Student)studentComboBox.getValue()));
        showBtn.setOnAction(e -> {
            while (!studentStack.isEmpty())
                stackView.getItems().add(studentStack.pop().display());
            while (!studentQueue.isEmpty())
                queueView.getItems().add(studentQueue.remove().display());
        });

        HBox showHBox = new HBox();
        showHBox.getChildren().addAll(stackView, queueView);
        VBox buttonVBox = new VBox();
        buttonVBox.getChildren().addAll(stackBtn, queueBtn, showBtn);

        BorderPane layout = new BorderPane();
        layout.setLeft(studentComboBox);
        layout.setCenter(buttonVBox);
        layout.setRight(showHBox);

        Scene scene = new Scene(layout, 700, 300);
        stage.setScene(scene);
        stage.show();
    }

}
