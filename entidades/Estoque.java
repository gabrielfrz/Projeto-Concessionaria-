package entidades;
import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;

public class Estoque { //operações do estoque
	ArrayList<Carros> estoque = new ArrayList<>(); //ArrayList de carros
	
	public void addcarros(Carros carro){ //adicionar carros
		estoque.add(carro);
	}
	
	public boolean removecarros(Carros carro) { //remover carros
		return estoque.remove(carro);
	}

	@Override
	public String toString() {  //toString para a formatação da interface descricao
		StringBuilder sb = new StringBuilder();
		for(Carros carro: estoque) {
			sb.append(carro.descricao() + "\n");
		}
		return sb.toString();
	}

	public Estoque(ArrayList<Carros> estoque) {  //construtores
		this.estoque = estoque;
	}

	public ArrayList<Carros> getEstoque() { //getters e setters
		return estoque;
	}

	public void setEstoque(ArrayList<Carros> estoque) {
		this.estoque = estoque;
	}
	
	public Estoque() { //construtor vazio
		
	}
	
	public boolean AlterarPreco(int idp, double NovoPreco){  //função para realizar a busca pelo id e a troca dos preços
		for(Carros carro: estoque) {
			if(carro.getId() == idp) {   //caso o id seja encontrado, o preço será o preço digitado pelo usuário
				carro.setPreco(NovoPreco);
				return true;
			}
		}
		return false;
		
		
	}
	
	public boolean RemoveCarroPorID(int idp){ //função para realizar a busca pelo id e a remoção dos carros
		for(Carros carro: estoque) {
			if(carro.getId() == idp) { //caso o carro seja encontrado, o carro será removido da ArrayList
				
				return estoque.remove(carro);
			}
		}
		return false;
	}
	
	public String BuscaCarroPorID(int idp) { //Função para realizar a busca pelo id e retornar a descrição do carro
		for(Carros carro: estoque) {
			if(carro.getId() == idp) {    //caso o carro seja encontrado, retornar sua descrição
				return carro.descricao();
			}
		}
		return "ID nao encontrado\n";
	}
	
	public void ordenaEstoque() {
	    Collections.sort(estoque, new OrdenaPorPreco());
	  }
	
	
	
	
}