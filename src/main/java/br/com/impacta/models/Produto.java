package br.com.impacta.models;

public class Produto{

  public int codigo;
  public String descricao;
  public double valor;

  public String montarResumo(Produto produto){
   
    String resumo = "Código: " + produto.codigo + 
    " descricao: "+ produto.descricao +
    " valor: "+ produto.valor;
  return resumo;

  }

}