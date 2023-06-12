import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends javafx.application.Application{
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 380);
        stage.setTitle("Калькулятор шимов");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}