package aplicacao;
import entidades.*;
import java.util.Scanner;

public class Programa {
//Grupo: Diogo Rossi, Emanuele Santos, Gabriel Aragão, Rodrigo Peixoto
	
	public static void main(String[] args) { //função principal
		int loop = 0;		//criação de variáveis
		int opcao, id = 0;
		int tipocarro;
		String marca = null, modelo = null, cor = null;
		Double valor = null;
		Scanner sc = new Scanner(System.in);
		
		Estoque estoque = new Estoque(); //criação e adição manual do estoque
		estoque.addcarros(new CarrosNovos(Cores.RACING_YELLOW, Marcas.PORSCHE,1800000.00, Nome.TURBO_911, 2.0, ++id));
		estoque.addcarros(new CarrosUsados(Cores.VIOLA_PARSIFAE, Marcas.LAMBORGHINI, 8000000.00, Nome.AVENTADOR_SVJ, 10000.00, 2, ++id));
		estoque.addcarros(new CarrosNovos(Cores.SHARK_BLUE, Marcas.PORSCHE,5000000.0, Nome.GT3_RS, 3.0, ++id));
		estoque.addcarros(new CarrosUsados(Cores.ROSSO_CORSA, Marcas.FERRARI, 4600000.00, Nome.F8_TRIBUTO, 20000.00, 1, ++id));
		estoque.addcarros(new CarrosNovos(Cores.BLU_TDF, Marcas.FERRARI,6300000.0, Nome.PISTA_488, 3.0, ++id));
		estoque.addcarros(new CarrosUsados(Cores.ARANCIO_BOREALIS, Marcas.LAMBORGHINI, 3200000.00, Nome.HURACAN_LP610_4, 15000.00, 1, ++id));
		estoque.addcarros(new CarrosNovos(Cores.BIANCO_AVUS, Marcas.FERRARI,6500000.00, Nome.SF90_STRADALE, 2.0, ++id));
		
		while(loop == 0) { //repetição do programa enquanto o usuário não digitar para sair
				
			System.out.println("****BEM VINDO A CONCESSIONARIA @dr.cars_ssa****");
			System.out.println("Digite 1 para anunciar um carro");   //anunciar consiste em criar um carro no estoque
			System.out.println("Digite 2 para listar o estoque completo"); //listar os objetos cadastrados
			System.out.println("Digite 3 para alterar o valor de um anuncio"); //alterar objetos
			System.out.println("Digite 4 para comprar um carro"); //comprar um carro consiste em removê-lo do estoque
			System.out.println("Digite 5 para ordenar por preco"); //listar os registros de forma ordenada de acordo com o preço
			System.out.println("Digite 6 para sair"); //sair do loop
			
			opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:	//caso a opção 1 seja escolhida, o cliente escolherá entre carro novo ou usado
				
				Double garantia;
				
				System.out.println("Digite 1 se o carro for novo");
				System.out.println("Digite 2 se o carro for usado");
				tipocarro = sc.nextInt();
				
					
					System.out.println("Insira:");
					System.out.println("Marca: (FERRARI, LAMBORGHINI , PORSCHE)");
					marca = sc.next();
					//após o cliente digitar a marca desejada, o programa automaticamente fornecerá as opções de modelo e cor da marca escolhida
					
					switch(marca) {
						case("PORSCHE"):
							System.out.println("Modelo: (GT3_RS, TURBO_911, BOXTER_718)");
							modelo = sc.next();
							System.out.println("Cor: (SHARK_BLUE, GUARDS_RED, RACING_YELLOW)");
							cor = sc.next();
							System.out.println("Valor:");
							valor = sc.nextDouble();
							break;
							
						case("FERRARI"):
							System.out.println("Modelo: (PISTA_488, F8_TRIBUTO, SF90_STRADALE)");
							modelo = sc.next();
							System.out.println("Cor: (ROSSO_CORSA, BLU_TDF, BIANCO_AVUS)");
							cor = sc.next();
							System.out.println("Valor:");
							valor = sc.nextDouble();
							break;
							
						case("LAMBORGHINI"):
							System.out.println("Modelo: (AVENTADOR_SV, AVENTADOR_SVJ, HURACAN_LP610_4)");
							modelo = sc.next();
							System.out.println("Cor: (VIOLA_PARSIFAE, ARANCIO_BOREALIS,GRIGIO_TELESTO)");
							cor = sc.next();
							System.out.println("Valor:");
							valor = sc.nextDouble();
							break;
							
					}
					
					if(tipocarro == 1) { //caso o carro seja novo, o programa irá perguntar os anos de garantia ao usuário, e depois adicionar o carro com os dados ao estoque
					
					System.out.println("Garantia:");
					garantia = sc.nextDouble();
					
					estoque.addcarros(new CarrosNovos(Cores.valueOf(cor), Marcas.valueOf(marca), valor, Nome.valueOf(modelo), garantia, ++id));
					System.out.println("Anúncio criado!");
					
					}
					
					else if(tipocarro == 2) { //caso o carro seja usado, o programa irá perguntar a quilometragem e quantidade de donos, e depois adicionar o carro com os dados ao estoque
						Double quilometragem;
						int donos;
						System.out.println("Quilometragem:");
						quilometragem = sc.nextDouble();
						System.out.println("Quantidade de donos:");
						donos = sc.nextInt();
						estoque.addcarros(new CarrosUsados(Cores.valueOf(cor), Marcas.valueOf(marca), valor, Nome.valueOf(modelo), quilometragem, donos, ++id));
						System.out.println("Anuncio criado!");
	
				}
					break;
			
			case 2: //caso o usuário tenha escolhido a opção 2 no MENU, o programa irá listar os carros
				System.out.println(estoque);
				break;
			
			case 3: //caso o usuário tenha escolhido 3 no MENU, o programa irá perguntar o id do carro e o novo preço para alterar os dados do carro
				double novopreco;
				int idpesquisado;
				System.out.println("Digite o id do carro que voce deseja alterar o preco");
				idpesquisado = sc.nextInt();
				System.out.println(estoque.BuscaCarroPorID(idpesquisado));
				System.out.println("Digite o novo preco");
				novopreco = sc.nextDouble();
				if(estoque.AlterarPreco(idpesquisado, novopreco)) {
					System.out.println("Valor alterado\n");
				}
				else {
					System.out.println("Erro");
				}
				break;
			
			case 4: //caso o usuário tenha escolhido 4 no MENU, o programa perguntará o id do carro que o usuário deseja compar, ou seja, remover da ArrayList
				int idcompra;
				System.out.println(estoque);
				System.out.println("Digite o id do carro que voce quer comprar:");
				idcompra = sc.nextInt();
				System.out.println(estoque.BuscaCarroPorID(idcompra));
				if(estoque.RemoveCarroPorID(idcompra)) {
					System.out.println("Parabens pela compra!");
					System.out.println("Carro removido do estoque\n");
					
				}
				else {
					System.out.println("Erro");
				}
				break;
				
				
			case 5:	
				//caso o usuário tenha escolhido 5, o programa listará o estoque de forma ordenada de acordo com o preço
				estoque.ordenaEstoque();
		        System.out.println(estoque);
				break;
				
			case 6: 
				loop = 1;
				break;
				//caso o usuário tenha escolhido 6, o programa se encerrará
				
				
			}
			
		}

	
		sc.close(); //fechamento do scanner
	}

}