package entidades;

public abstract class Carros implements Descricao{ //clase abstrata
  protected Cores cor; //todo carro terá cor, marca, preco, nome, id.
  protected Marcas marca;
  protected Double preco;
  protected Nome nome;
  protected int id;

public Carros(Cores cor, Marcas marca, Double preco, Nome nome, int id) {
	this.cor = cor;       //construtores
	this.marca = marca;
	this.preco = preco;
	this.nome = nome;
	this.id = id;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Carros(Cores cor, Marcas marca, Double preco, Nome nome) {
  this.cor = cor;
  this.marca = marca;
  this.preco = preco;
  this.nome = nome;
}
public Cores getCor() { //getters e setters
  return cor;
}
public void setCor(Cores cor) {
  this.cor = cor;
}
public Marcas getMarca() {
  return marca;
}
public void setMarca(Marcas marca) {
  this.marca = marca;
}
public Double getPreco() {
  return preco;
}
public void setPreco(Double preco) {
  this.preco = preco;
}
public Nome getNome() {
  return nome;
}
public void setNome(Nome nome) {
  this.nome = nome;
}

public Carros() {
	
}

@Override							//toString
public String toString() {
  return "Carros [cor=" + cor + ", marca=" + marca + ", preco=" + preco + ", nome=" + nome + "]";
}



}