/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojavirtual;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 */
public class FXMLMenuController implements Initializable {
    @FXML
    private Button btVoltar;

    @FXML
    private Button btInserir;

    @FXML
    private Button btCatalogo;

    @FXML
    private Button btSearch;
    
    
     @FXML
    private void BotaoInicio(ActionEvent event) {
        System.out.println("You clicked me!");
        LojaVirtual.trocaTela("inicio");
    }
     @FXML
    private void BotaoCatalogo(ActionEvent event) {
        System.out.println("You clicked me!");
        LojaVirtual.trocaTela("catalogo");
    }
    @FXML
    private void Procurar(ActionEvent event) {
        System.out.println("You clicked me!");
        LojaVirtual.trocaTela("procurar");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
