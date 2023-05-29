/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akinator;

/**
 *
 * @author Fabian
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class MiAplicacion extends Application {
    @Override
    public void start(Stage stage) {
        WebView webView = new WebView();
        webView.getEngine().loadContent("<html><head><link rel='stylesheet' type='text/css' href='styles.css'></head><body><h1>Mi página web</h1><p>¡Hola, mundo!</p></body></html>");
        Scene scene = new Scene(webView);
        stage.setScene(scene);
        stage.show();
    }
}