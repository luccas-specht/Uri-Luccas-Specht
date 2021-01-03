package Lista;



//MAIN DO EXERCICIO2 DE LISTA
public class Maine2c {

	public static void main(String[] args) {
		
		//aan<----->ana<--->bruna<--->carla<--->carlos<--->daniela<-->daniella<-->ester<--->henrique<-->talita
		
		PessoaE2 ann = new PessoaE2("ann");
		PessoaE2 ana = new PessoaE2("ana");
		PessoaE2 bruna= new PessoaE2("bruna");
		PessoaE2 carla = new PessoaE2("carla");
		PessoaE2 carlos = new PessoaE2("carlos");
		PessoaE2 daniela = new PessoaE2("daniela");
		PessoaE2 daniella = new PessoaE2("daniella");
		PessoaE2 ester = new PessoaE2("ester");
		PessoaE2 henrique = new PessoaE2("henrique");
		PessoaE2 talita = new PessoaE2("talita");
		
		ann.setAntecessor(null);
		ann.setSucessor(ana);
		ana.setAntecessor(ann);
		ana.setSucessor(bruna);
		carla.setAntecessor(bruna);
		carla.setSucessor(carlos);
		carlos.setAntecessor(carla);
		carlos.setSucessor(daniela);
		daniela.setAntecessor(carlos);
		daniela.setSucessor(daniella);
		daniella.setAntecessor(daniela);
		daniella.setSucessor(ester);
		ester.setAntecessor(henrique);
		ester.setSucessor(daniella);
		henrique.setAntecessor(ester);
		henrique.setSucessor(talita);
		talita.setAntecessor(henrique);
		talita.setSucessor(null);
		
		
		
		
		
		
		

	}

}
