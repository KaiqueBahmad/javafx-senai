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
public class ComprarRifaController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void comprarRifa(ActionEvent event) {
        String nome = nomeInput.getText();
        if ("".equals(nome)) {
            erroLabel.setText("Insira um nome!");
            return;
        }
        if ("".equals(numeroInput.getText())) {
            erroLabel.setText("Insira um número!");
            return;
        }
        int numero;
        try {
            numero = Integer.parseInt(numeroInput.getText());
        } catch (Exception e) {
            erroLabel.setText("Numero inserido não é numérico!");
            return;
        }
        if (numero > 0 && numero <= App.rifas.length) {
            for (int i = 0; i < App.rifas.length; i++) {
                System.out.println(i);
                System.out.println(App.rifas[i].getNumero());
                System.out.println("---------");
                if (App.rifas[i].getNumero() == numero ) {
                    if (App.rifas[i].isDisponivel()) {
                        App.rifas[i].setNomeDoDono(nome);
                        App.rifas[i].setDisponivel(false);
                        break;
                    } else {
                        erroLabel.setText("Essa rifa já possui um dono");
                        return;
                    }
                    
                }
            }
        } else {
            erroLabel.setText("Não existe uma rifa com esse número");
            return;
        }
        
        
    }
    
    public void voltar(ActionEvent event) {
        try {
            App.setRoot("views/principal");
        } catch (IOException ex) {
            Logger.getLogger(VerRifasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private TextField nomeInput;
    @FXML
    private TextField numeroInput;
    @FXML
    private Label erroLabel;

}
