/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package senai.monitoria.javafx.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import senai.monitoria.javafx.App;
/**
 * FXML Controller class
 *
 * @author Kaique
 */
public class ReembolsarRifasController implements Initializable {

    @FXML
    private TextField numeroInput;
    @FXML
    private Label statusLabel;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Reembolsar(ActionEvent event) {
        int numero = Integer.parseInt(numeroInput.getText());
        for (int i = 0; i < App.rifas.length; i++) {
            if (App.rifas[i].getNumero() == numero) {
                App.rifas[i].setDisponivel(true);
                App.rifas[i].setNomeDoDono("");
                statusLabel.setText("Reembolso realizado");
                return;
            }
        }
    }

    @FXML
    private void voltar(ActionEvent event) {
        try {
            App.setRoot("views/principal");
        } catch (IOException ex) {
            Logger.getLogger(ReembolsarRifasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
