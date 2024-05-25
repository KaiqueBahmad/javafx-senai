/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package senai.monitoria.javafx.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import senai.monitoria.javafx.App;
import senai.monitoria.javafx.models.Rifa;
/**
 * FXML Controller class
 *
 * @author Kaique
 */
public class VerRifasController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        rifasGrid.getChildren().clear();
        rifasGrid.getColumnConstraints().clear();
        rifasGrid.getRowConstraints().clear();
        int index = 0;
        Rifa[] rifas = App.rifas;
        for(int y = 0; index < rifas.length; y++){
                for(int x = 0; x < 6; x++){
                    TextField tf = new TextField();
                    tf.setPrefHeight(75);
                    tf.setPrefWidth(75);
                    tf.setAlignment(Pos.CENTER);
                    tf.setEditable(false);
                    if (index >= rifas.length) {
                        break;
                    }
                    if (!rifas[index].isDisponivel()) {
                        tf.setText(rifas[index].getNomeDoDono());
                    } else {
                        tf.setText("SEM DONO");
                    }
                    rifasGrid.setRowIndex(tf, y);
                    rifasGrid.setColumnIndex(tf, x);
                    rifasGrid.getChildren().add(tf);
                    index++;
                    
                }
                if (index >= rifas.length ) {
                    break;
                }
            }
        
    }
    
    public void sortear(ActionEvent event) {
        int numCompradores = 0;
        for (int i = 0; i < App.rifas.length;i++) {
            if (!App.rifas[i].isDisponivel()) {
                numCompradores++;
            }
        }
        Rifa[] rifasCompradas = new Rifa[numCompradores];
        int count = 0;
        for (int i = 0; i < App.rifas.length;i++) {
            if (!App.rifas[i].isDisponivel()) {
                rifasCompradas[count++] = App.rifas[i];
            }
        }
        Random random = new Random();
        int numVencedor = random.nextInt(numCompradores);
        ganhadorLabel.setText(rifasCompradas[numVencedor].getNomeDoDono());
    }
    public void voltar(ActionEvent event) {
        try {
            App.setRoot("views/principal");
        } catch (IOException ex) {
            Logger.getLogger(VerRifasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @FXML
    Label ganhadorLabel;
    @FXML
    GridPane rifasGrid;
    
}
