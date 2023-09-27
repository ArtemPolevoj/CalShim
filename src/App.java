import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends javafx.application.Application{
    public static void run() {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 380);
        stage.setTitle("Калькулятор шимов");
        stage.getIcons().add(new Image("tr.png"));
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}