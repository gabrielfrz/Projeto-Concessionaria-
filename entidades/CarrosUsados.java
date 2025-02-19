package entidades;

public class CarrosUsados extends Carros{		//CarrosUsados terá quilometragem e quantidade de donos, além das outras variáveis que serão herdadas de carro
	private double quilometragem;
	private double qtddonos;
	
	public double getQuilometragem() { //getters e setters
		return quilometragem;
	}
	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}
	public double getQtddonos() {
		return qtddonos;
	}
	public void setQtddonos(double qtddonos) {
		this.qtddonos = qtddonos;
	}
	public CarrosUsados(double quilometragem, double qtddonos) { //construtores
		this.quilometragem = quilometragem;
		this.qtddonos = qtddonos;
	}
	public CarrosUsados() {
		super();
	}
	
	public CarrosUsados(Cores cor, Marcas marca, Double preco, Nome nome, double quilometragem, double qtddonos, int id) {
		super(cor, marca, preco, nome, id);
		this.quilometragem = quilometragem;
		this.qtddonos = qtddonos;
	}
	@Override
	public String toString() { //toString
		return "CarrosUsados [quilometragem=" + quilometragem + ", qtddonos=" + qtddonos + "]";
	}
	
	@Override
	public String descricao() { //interface descricao. Aqui é o que vai aparecer para o usuário quando houver interações com carros usados
		return "Marca: " + marca + "\nModelo: " + nome + "\nCor: " + cor + "\nPreço: " + preco + "\nNúmero de donos anteriores: " + qtddonos
		+" \nCarro em excelente estado com " + quilometragem + "Km rodados\nid do carro: " + id + "\n";
	
	}
}