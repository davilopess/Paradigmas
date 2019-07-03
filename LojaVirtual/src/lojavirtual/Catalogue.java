package lojavirtual;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Catalogue
{
    ArrayList catalogoArrayList;
    Product itemDoCatalogo;
    Scanner scan;
    int indexCatalogo;
    private static ObjectOutputStream output;
    private static ObjectInputStream input;
    
    // inicializa o objeto da classe Catalogue
    public Catalogue() 
    {
        this.indexCatalogo = 0;
        catalogoArrayList = new ArrayList();
        itemDoCatalogo = new Product();
    }

    // imprime os itens do catalogo

    /**
     *
     */
    public void getCatalogue() 
    {
        indexCatalogo = 0;
        
        while(indexCatalogo < catalogoArrayList.size()) 
        {
            itemDoCatalogo = (Product)catalogoArrayList.get(indexCatalogo);
            itemDoCatalogo.printProduct();
            indexCatalogo++;
        }  
    }
    
    // obtem um item do catalogo
    public Product getItemCatalogo(int codigo)
    {
        indexCatalogo = 0;
        while(indexCatalogo < catalogoArrayList.size()) 
        {
            
            itemDoCatalogo = (Product) catalogoArrayList.get(indexCatalogo);
            
            if(itemDoCatalogo.codigo == codigo)
            {
                return itemDoCatalogo;
            }
            indexCatalogo++;
        }
        return null;
    }
    
    // insere dados no arquivo
    public void inserirDadosArquivo()
    {
        // Abre o arquivo
        try
        {
            output = new ObjectOutputStream(
            Files.newOutputStream(Paths.get("catalogo.ser")));
        }
        catch (IOException ioException)
        {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // termina o programa
        }
        
        // Insere dados no arquivo
        try
        {
            itemDoCatalogo = new Product();
            itemDoCatalogo.codigo = 1212;
            itemDoCatalogo.marca = "Invicta";
            itemDoCatalogo.modelo = "Dragon Yakusa";
            itemDoCatalogo.categoria = "Analógico";
            itemDoCatalogo.preco = 479.99;
            itemDoCatalogo.quantidade = 9;
            output.writeObject(itemDoCatalogo);
            
            itemDoCatalogo = new Product();
            itemDoCatalogo.codigo = 2323;
            itemDoCatalogo.marca = "Invicta";
            itemDoCatalogo.modelo =  "Pro Diver";
            itemDoCatalogo.categoria = "Analógico";
            itemDoCatalogo.preco = 460.00;
            itemDoCatalogo.quantidade = 6;
            output.writeObject(itemDoCatalogo);
                
            itemDoCatalogo = new Product();
            itemDoCatalogo.codigo = 3434;
            itemDoCatalogo.marca = "Invicta";
            itemDoCatalogo.modelo = "Excursion";
            itemDoCatalogo.categoria = "Analógico";
            itemDoCatalogo.preco = 478.99;
            itemDoCatalogo.quantidade = 4;
            output.writeObject(itemDoCatalogo);
                
            itemDoCatalogo = new Product();
            itemDoCatalogo.codigo = 4545;
            itemDoCatalogo.marca = "Invicta";
            itemDoCatalogo.modelo = "Speedway";
            itemDoCatalogo.categoria = "Analógico";
            itemDoCatalogo.preco = 649.00;
            itemDoCatalogo.quantidade = 8;
            output.writeObject(itemDoCatalogo);
            
            itemDoCatalogo = new Product();
            itemDoCatalogo.codigo = 5656;
            itemDoCatalogo.marca = "Invicta";
            itemDoCatalogo.modelo = "Zeus Bolt";
            itemDoCatalogo.categoria = "Analógico";
            itemDoCatalogo.preco = 579.99;
            itemDoCatalogo.quantidade = 5;
            output.writeObject(itemDoCatalogo);
        }
        catch (NoSuchElementException elementException)
        {
            System.err.println("Invalid input. Please try again.");
            scan.nextLine(); // descarta entrada para o usuário tentar de novo
        }
        catch (IOException ioException)
        {
            System.err.println("Error writing to file. Terminating.");
        }

        // Fecha arquivo
        try
        {
            if (output != null)
                output.close();
        }
        catch (IOException ioException)
        {
            System.err.println("Error closing file. Terminating.");
        }
    }
    
    // ler dados do arquivo
    public void lerDadosArquivo()
    {
        try // abre o arquivo
        {
            input = new ObjectInputStream(
            Files.newInputStream(Paths.get("catalogo.ser")));
        }
        catch (IOException ioException)
        {
            System.err.println("Error opening file.");
            System.exit(1);
        }

        // Ler dados do arquivo
        try
        {
            while (true) // faz um loop até ocorrer uma EOFException
            {
                itemDoCatalogo = new Product();
                itemDoCatalogo = (Product) input.readObject();
                catalogoArrayList.add(itemDoCatalogo);
            }
        }
        catch (EOFException endOfFileException)
        {
            System.out.printf("No more records");
        }
        catch (ClassNotFoundException classNotFoundException)
        {
            System.err.println("Invalid object type. Terminating.");
        }
        catch (IOException ioException)
        {
            System.err.println("Error reading from file. Terminating.");
        }
        
        // Fecha arquivo
        try
        {
            if (input != null)
                input.close();
        }
        catch (IOException ioException)
        {
            System.err.println("Error closing file. Terminating.");
            System.exit(1);
        }
    }
}
