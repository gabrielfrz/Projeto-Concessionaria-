package entidades;
import java.util.Comparator;

public class OrdenaPorPreco implements Comparator<Carros>{ //classe para ordenar estoque de acordo com preço
  @Override
  public int compare(Carros o1, Carros o2) {
    return o1.getPreco().compareTo(o2.getPreco());
  }	
}