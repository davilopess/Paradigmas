/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojavirtual;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

/**
 * FXML Controller class
 *
 */

public class FXMLProcurarItemController implements Initializable {
    
    
    Catalogue teste = new Catalogue();
    
    
    
    
       
   @FXML
    private Label tipoProduct;

    @FXML
    private TextFlow FlowPrincipal;

    @FXML
    private Text lblTitulo;

    @FXML
    private Label precoProduct;

    @FXML
    private Label idProduct;
    
    @FXML
    private Button btVoltar;
    
    @FXML
    private TextField fieldProcura;

    @FXML
    private Text lblInform;

    @FXML
    private Label nameProduct;

    @FXML
    private Label marcaProduct;

    @FXML
    private Text txtProdutoEncontrado;
    
    @FXML
    void Search(ActionEvent event) {
        teste.inserirDadosArquivo();
        teste.lerDadosArquivo();
        lblInform.setOpacity(0);
        fieldProcura.setOpacity(0);
        lblTitulo.setOpacity(0);
        FlowPrincipal.setOpacity(1);
        txtProdutoEncontrado.setOpacity(1);
        int codigo;
        codigo = Integer.parseInt(fieldProcura.getText());
        Product item = new Product();
        item = teste.getItemCatalogo(codigo);
                    if( item!= null )
                    {
                            tipoProduct.setText(item.categoria);
                            precoProduct.setText(Double.toString(item.preco) + "R$");
                            idProduct.setText(Integer.toString(item.codigo));
                            nameProduct.setText(item.modelo);
                            marcaProduct.setText(item.marca);

                            txtProdutoEncontrado.setText("PRODUTO ENCONTRADO");
                        
                    }
                    else
                    {
                        txtProdutoEncontrado.setText("PRODUTO NÃO ENCONTRADO");
                        FlowPrincipal.setOpacity(0);
                    }
    }
    @FXML
    private void BotaoVoltar(ActionEvent event) {
       System.out.println("You clicked me!");
       LojaVirtual.trocaTela("menu");
        lblInform.setOpacity(1);
        fieldProcura.setOpacity(1);
        lblTitulo.setOpacity(1);
        FlowPrincipal.setOpacity(0);
        txtProdutoEncontrado.setOpacity(0);
        fieldProcura.clear();
       // fieldProcura.setFocusTraversable(true);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //fieldProcura.setFocusTraversable(true);
    }    
    
}
