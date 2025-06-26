package modelo;
// executa regra de cálculos e realiza verificação de estoque 
public class ProdutoService {
    public double calcularTotal(Produto produto) {
        return produto.getPreco() * produto.getQuantidade();
}
    public boolean estoqueDisponivel (Produto produto){
        return produto.getQuantidade() > 0;
    }
}