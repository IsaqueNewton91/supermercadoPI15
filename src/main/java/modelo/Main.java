package modelo;

import modelo.Produto;
import modelo.ProdutoService;
// Criado essa classe main  para testar o funcionamento dos códigos
public class Main {
    public static void main (String[] args){
        Produto produto = new Produto("Arroz", 450, 3);
        ProdutoService service = new ProdutoService();
        
        double total = service.calcularTotal(produto);
        System.out.println("Total: R$ " + total);
        
        if (service.estoqueDisponivel(produto)){
            System.out.println("Produto em estoque");
        } else {
            System.out.println("Produto fora de estoque.");       
    }
}
    
    public double calcularTotal(double preco, int quantidade){
        return preco * quantidade;
    }
}