package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public static String name;

    @FXML
    private AnchorPane loginContext;

    @FXML
    private TextField txtName;

    @FXML
    void joineOnAction(ActionEvent event) throws IOException {
//
        name = txtName.getText();

        Parent root = FXMLLoader.load(getClass().getResource("../view/ClientForm.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();

        txtName.clear();
    }


}
