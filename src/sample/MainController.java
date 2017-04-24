package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * Created by Lukasz Kolacz on 24.04.2017.
 */
public class MainController implements Initializable{

//    Prostrze ale mniej wydajne rozwiązanie

//    public void somebodyClickAnchor(){
//
//    }
//
//    public void clickSubmit(MouseEvent event){
//        if(event.isAltDown()){
//            System.out.println("Kliknięto mnie");
//        }
//    }

    @FXML
    Button buttonSubmit;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buttonSubmit.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                buttonSubmit.setText("AkademiaKodu");
            }
        });
    }
}
