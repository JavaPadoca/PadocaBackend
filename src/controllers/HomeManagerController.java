package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class HomeManagerController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
    @FXML
    private Button btn_payments;

    // FUNCTION DE MUDANÇA DE TELA P/ PAGAMENTOS
    @FXML
    void GoToPayments(ActionEvent event) throws IOException {
    	Main.changeScene("payments");
    }
    

	
}
