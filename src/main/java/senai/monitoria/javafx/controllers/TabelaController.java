/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package senai.monitoria.javafx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import senai.monitoria.javafx.App;
/**
 * FXML Controller class
 *
 * @author Kaique
 */
public class TabelaController implements Initializable {

    @FXML
    private GridPane tabelaGridPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        tabelaGridPane.getChildren().clear();
//        tabelaGridPane.getColumnConstraints().clear();
//        tabelaGridPane.getRowConstraints().clear();
//        String[][] nomes = App.nomes;
//        for (int linha = 0; linha < nomes.length; linha++) {
//            for (int coluna = 0; coluna < nomes[linha].length; coluna++) {
//                String nome = nomes[linha][coluna];
//                TextField celula = new TextField();
//                celula.setPrefSize(75, 75);
//                celula.setEditable(false);
//                celula.setText(nome);
//                tabelaGridPane.setRowIndex(celula, linha);
//                tabelaGridPane.setColumnIndex(celula, coluna);
//                tabelaGridPane.getChildren().add(celula);
//            }
//        }      
        
    }    
    
}
