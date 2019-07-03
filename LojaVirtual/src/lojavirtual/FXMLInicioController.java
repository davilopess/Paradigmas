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
import javafx.scene.control.Label;
import javafx.scene.text.Text;


public class FXMLInicioController implements Initializable {
    
    @FXML
    private Label label;
    
   
    
    @FXML
    private void BotaoMenu(ActionEvent event) {
        System.out.println("You clicked me!");
        LojaVirtual.trocaTela("menu");
    }
     @FXML
    private void BotaoCarrinho(ActionEvent event) {
        System.out.println("You clicked me!");
        LojaVirtual.trocaTela("carrinho");
        //label.setText("Hello World!");
    }
     @FXML
    private void BotaoEntrega(ActionEvent event) {
    
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
