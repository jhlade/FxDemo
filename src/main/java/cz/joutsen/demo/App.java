package cz.joutsen.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX+IDEA+Maven MWE
 *
 * @author jhlade
 */
public class App extends Application {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        // blank group
        Group group = new Group();
        Scene scene = new Scene(group, 800, 600);

        stage.setScene(scene);

        stage.setTitle("FxDemo");
        stage.show();
    }
}
