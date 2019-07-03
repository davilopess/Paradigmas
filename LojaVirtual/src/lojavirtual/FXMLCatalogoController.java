package lojavirtual;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.AccessibleAttribute;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class FXMLCatalogoController implements Initializable {
        //Catalogue catalogo1 = new Catalogue();
        //catalogo1.lerDadosArquivo();
    
     @FXML
    private Label lblId1;

    @FXML
    private Label lblId2;

    @FXML
    private Label lblMarca2;

    @FXML
    private Label lblMarca1;

    @FXML
    private Button btVoltar;

    @FXML
    private Label lblQtd1;

    @FXML
    private Label lblQtd2;

    @FXML
    private Label lblTipo2;

    @FXML
    private Label lblTipo1;

    @FXML
    private Text lblTitulo1;

    @FXML
    private Text lblTitulo2;

    @FXML
    private Label lblpreco2;

    @FXML
    private Label lblpreco1;  
    
     @FXML
    private Button btRight;

    @FXML
    private Button btLeft;
    @FXML
    private ImageView imgPainel;
    @FXML
    private ImageView img1;
    @FXML
    private ImageView img2;
    @FXML
    private ImageView img3;
    @FXML
    private ImageView img4;
    @FXML
    private Button inserirCar;
    @FXML
    private Label lblText;
    
    int total; 
    @FXML
    private Button inserirCar1;
    @FXML
    private ListView<Product> lstView;
    private ObservableList<Product> obs;
    Catalogue carrinho = new Catalogue();
    @FXML
    private Button finalizarCompra;
    @FXML
    private ImageView imgCarro;
    @FXML
    private AnchorPane telaPrincipal;
    @FXML
    private Button inserirCar3;
    @FXML
    private Button inserirCar4;
    @FXML
    private Text textTot;
    @FXML
    private TextField tNome;
    @FXML
    private TextField tCep;
    @FXML
    private TextField tEstado;
    @FXML
    private TextField tCidade;
    @FXML
    private TextField tEndereco;
    @FXML
    private Button finalizarCompra1;
    @FXML
    private Text txtNome;
    @FXML
    private Text txtEstado;
    @FXML
    private Text txtCep;
    @FXML
    private Text txtCidade;
    @FXML
    private Text txtEndereco;
    
    @FXML
    private void BotaoVoltar(ActionEvent event) {
       System.out.println("You clicked me!");
       LojaVirtual.trocaTela("menu");
    }
        @FXML
    private void InserirCarrinho(ActionEvent event) {
        Catalogue teste = new Catalogue();
        
        teste.inserirDadosArquivo();
        teste.lerDadosArquivo();
        Product item = new Product();
        item = teste.getItemCatalogo(1212);
            
        total += item.preco;
        lblText.setText(Integer.toString(total) + "R$");
        carrinho.catalogoArrayList.add(item.modelo);
        
        obs = FXCollections.observableArrayList(carrinho.catalogoArrayList);
        lstView.setItems(obs);
    }
    @FXML
    private void left(ActionEvent event) {
        lblId1.setText("1212");
        lblId2.setText("2323");                                                
        lblMarca2.setText("Invicta");
        lblMarca1.setText("Invicta");
        lblQtd1.setText("9");
        lblQtd2.setText("6");   
        lblTipo2.setText("Analogico");
        lblTipo1.setText("Analogico");
        lblTitulo1.setText("Dragon Yakusa");
        lblTitulo2.setText("Pro Driver");
        lblpreco2.setText("460.00 R$");
        lblpreco1.setText("479.00 R$");
        btLeft.setOpacity(0.0);
        btRight.setOpacity(10);
        img1.setVisible(true);
        img2.setVisible(true);
        img3.setVisible(false);
        img4.setVisible(false);
        inserirCar3.setVisible(false);
        inserirCar4.setVisible(false);
         inserirCar.setVisible(true);
        inserirCar1.setVisible(true);
    
    }
    @FXML
    private void right(ActionEvent event) {
        lblId1.setText("5656");
        lblId2.setText("4545");                                                
        lblMarca2.setText("Invicta");
        lblMarca1.setText("Invicta");
        lblQtd1.setText("5");
        lblQtd2.setText("8");
        lblTipo2.setText("Analogico");
        lblTipo1.setText("Analogico");
        lblTitulo1.setText("Zeus Bolt");
        lblTitulo2.setText("Execursion");
        lblpreco2.setText("579.99 R$");
        lblpreco1.setText("649.00 R$");
        btRight.setOpacity(0.0);
        btLeft.setOpacity(5);
        img1.setVisible(false);
        img2.setVisible(false);
        img3.setVisible(true);
        img4.setVisible(true);
        inserirCar3.setVisible(true);
        inserirCar4.setVisible(true);
         inserirCar.setVisible(false);
        inserirCar1.setVisible(false);
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        img3.setVisible(false);
        img4.setVisible(false);
         inserirCar3.setVisible(false);
        inserirCar4.setVisible(false);
        txtNome.setVisible(false);
         tNome.setVisible(false);
          txtCep.setVisible(false);
           tCep.setVisible(false);
            txtEstado.setVisible(false);
             tEstado.setVisible(false);
              txtCidade.setVisible(false);
               tCidade.setVisible(false);
                txtEndereco.setVisible(false);
                 tEndereco.setVisible(false);
                 finalizarCompra1.setVisible(false);
        
    }    

    @FXML
    private void FinalCompra(ActionEvent event) {
        lblText.setVisible(false);
        lstView.setVisible(false);
        finalizarCompra.setVisible(false);
        textTot.setVisible(false);
        imgCarro.setVisible(false);
        txtNome.setVisible(true);
         tNome.setVisible(true);
          txtCep.setVisible(true);
           tCep.setVisible(true);
            txtEstado.setVisible(true);
             tEstado.setVisible(true);
              txtCidade.setVisible(true);
               tCidade.setVisible(true);
                txtEndereco.setVisible(true);
                 tEndereco.setVisible(true);
                 finalizarCompra1.setVisible(true);
        
        
    }

    @FXML
    private void InserirCarrinho2(ActionEvent event) {
        Catalogue teste = new Catalogue();
        
        teste.inserirDadosArquivo();
        teste.lerDadosArquivo();
        Product item = new Product();
        item = teste.getItemCatalogo(2323);
            
        total += item.preco;
        lblText.setText(Integer.toString(total) + "R$");
        carrinho.catalogoArrayList.add(item.modelo);
        
        obs = FXCollections.observableArrayList(carrinho.catalogoArrayList);
        lstView.setItems(obs);
    }

    @FXML
    private void InserirCarrinho3(ActionEvent event) {
        Catalogue teste = new Catalogue();
        
        teste.inserirDadosArquivo();
        teste.lerDadosArquivo();
        Product item = new Product();
        item = teste.getItemCatalogo(5656);
            
        total += item.preco;
        lblText.setText(Integer.toString(total) + "R$");
        carrinho.catalogoArrayList.add(item.modelo);
        
        obs = FXCollections.observableArrayList(carrinho.catalogoArrayList);
        lstView.setItems(obs);
    }

    @FXML
    private void InserirCarrinho4(ActionEvent event) {
        Catalogue teste = new Catalogue();
        
        teste.inserirDadosArquivo();
        teste.lerDadosArquivo();
        Product item = new Product();
        item = teste.getItemCatalogo(4545);
            
        total += item.preco;
        lblText.setText(Integer.toString(total) + "R$");
        carrinho.catalogoArrayList.add(item.modelo);
        
        obs = FXCollections.observableArrayList(carrinho.catalogoArrayList);
        lstView.setItems(obs);
    }

    @FXML
    private void FinalCompra1(ActionEvent event) {
        
         tNome.setText("");
          
           tCep.setText("");
           
             tEstado.setText("");
              
               tCidade.setText("");
               
                 tEndereco.setText("");
                 lblText.setText("");
                 LojaVirtual.trocaTela("inicio");
                 
                  txtNome.setVisible(false);
         tNome.setVisible(false);
          txtCep.setVisible(false);
           tCep.setVisible(false);
            txtEstado.setVisible(false);
             tEstado.setVisible(false);
              txtCidade.setVisible(false);
               tCidade.setVisible(false);
                txtEndereco.setVisible(false);
                 tEndereco.setVisible(false);
                 finalizarCompra1.setVisible(false);
                 lblText.setVisible(true);
        lstView.setVisible(true);
        finalizarCompra.setVisible(true);
        textTot.setVisible(true);
        imgCarro.setVisible(true);
        
    }


    
}
