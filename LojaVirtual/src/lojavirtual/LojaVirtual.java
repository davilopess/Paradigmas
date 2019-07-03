package lojavirtual;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LojaVirtual extends Application {
    private static Stage Pstage;
    private static Scene Inicio;
    private static Scene Menu;
    private static Scene Catalogo;
    private static Scene Procurar;
    private static Scene Carrinho;
    


    private static void swtich(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Pstage = stage;
        Parent fxmlInicio = FXMLLoader.load(getClass().getResource("FXMLInicio.fxml"));
        Parent fxmlMenu = FXMLLoader.load(getClass().getResource("FXMLMenu.fxml"));
        Parent fxmlCatalogo = FXMLLoader.load(getClass().getResource("FXMLCatalogo.fxml"));
        Parent fxmlProcurar = FXMLLoader.load(getClass().getResource("FXMLProcurarItem.fxml"));
        Parent fxmlCarrinho = FXMLLoader.load(getClass().getResource("FXMLCarrinho.fxml"));
        
        
        Inicio = new Scene(fxmlInicio);
        Menu = new Scene(fxmlMenu);
        Catalogo = new Scene(fxmlCatalogo);
        Procurar = new Scene(fxmlProcurar);
        Carrinho = new Scene(fxmlCarrinho);
        
        

        
        stage.setScene(Inicio);
        stage.show();
    }
    public static void trocaTela(String s){
        switch(s){
            case "menu":
                Pstage.setScene(Menu);
                break;
            case "inicio":
                Pstage.setScene(Inicio);
                break;
             case "catalogo":
                Pstage.setScene(Catalogo);
                break;
            case "procurar":
                Pstage.setScene(Procurar);
                break;
            case "carrinho":
                Pstage.setScene(Carrinho);
                break;
            
        }
    }

 
    public static void main(String[] args) {
        launch(args);
    }
    
}
