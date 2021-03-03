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

  public void criarCodigo(int codigo){
    this.codigo = codigo * 100;
  }
  
  public int retonaCodigo(){
    return this.codigo;
  }



}