package Proposta7;

public class Main_No {


public static void main(String args[]){
    No carne = new No("Carne");
    No frango = new No("Frango");
    No marmita = new No("Marmita");
    No picanha = new No("Picanha");
    No cereal = new No("Cereal");
    No aveia = new No("Aveia");
    No milho = new No("Milho");
    No fruta = new No("Fruta");
    No maca = new No("Maça");
    No higienePessoal = new No("Higiene Pessoal");
    No escova = new No("Escova"); 
    No limpeza = new No("Limpeza");
    No detergente = new No("Detergente");
       
    carne.setAnterior(null);
    carne.setProximo(cereal);
    carne.setBaixo(frango);
   
    frango.setCima(carne);
    frango.setBaixo(marmita);
    
    marmita.setCima(frango);
    marmita.setBaixo(picanha);
    
    picanha.setCima(marmita);
    picanha.setBaixo(null);

    
    cereal.setAnterior(carne);
    cereal.setProximo(fruta);
    cereal.setBaixo(aveia);
    
    aveia.setCima(cereal);
    aveia.setBaixo(milho);
    
    milho.setCima(aveia);
    milho.setBaixo(null);
    
    
    fruta.setAnterior(cereal);
    fruta.setProximo(higienePessoal);
    fruta.setBaixo(maca);
    
    maca.setCima(fruta);
    maca.setBaixo(null);
    
    
    higienePessoal.setAnterior(fruta);
    higienePessoal.setProximo(limpeza);
    higienePessoal.setBaixo(escova);
    
    escova.setCima(higienePessoal);
    escova.setBaixo(null);
    
    
    limpeza.setAnterior(higienePessoal);
    limpeza.setProximo(null);
    limpeza.setBaixo(detergente);
    
    detergente.setCima(limpeza);
    detergente.setBaixo(null);
    
  
//    System.out.println(detergente.getCima().getAnterior().getAnterior().getAnterior().getAnterior().getBaixo().getBaixo().getCima().getNome());
}
}