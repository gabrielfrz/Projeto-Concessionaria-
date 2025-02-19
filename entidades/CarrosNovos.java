
package entidades;

public class CarrosNovos extends Carros {
	private double anosgarantia;
	//CarrosNovos terá anosdegarantia, além das outras variáveis que serão herdadas de carro

	public CarrosNovos() {		//construtor vazio
		super();
	}
	
	public double getAnosgarantia() {		//getters e setters
		return anosgarantia;	
	}
	
	public void setAnosgarantia(double anosgarantia) {
		this.anosgarantia = anosgarantia;
	}
	
	public CarrosNovos(Cores cor, Marcas marca, Double preco, Nome nome, Double anosgarantia, int id) {
		super(cor, marca, preco, nome, id);
		this.anosgarantia = anosgarantia;	//construtor
	}
	
	@Override		//toString
	public String toString() {
		return "CarrosNovos [anosgarantia=" + anosgarantia + "]";
	}
	
	@Override		//interface descricao. Aqui é o que vai aparecer para o usuário quando houver interações com carros novos
	public String descricao() {
		return "Marca: " + marca + "\nModelo: " + nome + "\nCor: " + cor + "\nPreço: " + preco
		+ ".\nCarro 0 KM direto da fabrica com " + anosgarantia + " anos de garantia\nid do carro: " + id + "\n";	
	}
	
	
	
	
}
