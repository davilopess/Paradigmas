/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojavirtual;

import java.net.URL;
import java.util.ArrayList;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author T-Gamer
 */
public class FXMLCarrinhoController implements Initializable {
    ArrayList<Product> carrinho;
    Product item1;
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtCep;
    @FXML
    private TextField txtEstado;
    @FXML
    private TextField txtCidade;
    @FXML
    private TextField txtEndereco;
    @FXML
    private ListView<Product> listaProd;
    @FXML
    private Button btnBack;
    @FXML
    private Button btnBack1;

    /**
     * Initializes the controller class.
     */
    public void preencher(){
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    

    @FXML
    private void BackInicio(ActionEvent event) {
        System.out.println("You clicked me!");
        LojaVirtual.trocaTela("inicio");
    }

    @FXML
    private void ResetLoja(ActionEvent event) {
        txtCep.setText("");
        txtNome.setText("");
        txtEstado.setText("");
        txtCidade.setText("");
        txtEndereco.setText("");
        LojaVirtual.trocaTela("inicio");
    }
    
}
