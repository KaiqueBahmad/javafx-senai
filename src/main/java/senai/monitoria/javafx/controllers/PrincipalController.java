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
import javafx.fxml.Initializable;
import senai.monitoria.javafx.App;
/**
 * FXML Controller class
 *
 * @author Kaique
 */
public class PrincipalController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void irParaComprarRifa(ActionEvent event) {
        try {
            App.setRoot("views/comprarRifa");
        } catch (IOException ex) {

        }
    }
    public void irParaReembolsarRifa(ActionEvent event) {
        try {
            App.setRoot("views/reembolsarRifas");
        } catch (IOException ex) {

        }
    }
    public void irParaVerRifas(ActionEvent event) {
        try {
            App.setRoot("views/verRifas");
        } catch (IOException ex) {

        }
    }
    
}
