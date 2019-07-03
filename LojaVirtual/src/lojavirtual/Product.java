package lojavirtual;
import java.io.Serializable;

public class Product implements Serializable
{
    int codigo;
    String marca;
    String modelo;
    String categoria;
    double preco;
    int quantidade;
    
    public Product() 
    {
        codigo = 0;
        marca = null;
        modelo = null;
        categoria = null;
        preco = 0.00;
        quantidade = 0;
    }
    
    public void printProduct()
    {
        System.out.print(codigo + "\t");
        System.out.print(marca + "\t");
        System.out.print(modelo + "\t");
        System.out.print(categoria + "\t");
        System.out.print(preco + "\t\t");
        System.out.println(quantidade);
    }
}
