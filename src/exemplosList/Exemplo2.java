package exemplosList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exemplo2 {

	public static void main(String[] args) {
		
		//entrada de dados via teclado
		Scanner leia = new Scanner(System.in);
		String nome2;
		System.out.println("Digite um nome");
		
		//vamos inserir esse dado recebido por teclado na setNomes com o método add
		nome2 = leia.nextLine();
		
		
		// exercicios com Set
		//objeto Set com nome setnomes do tipo String
		Set <String> setNomes = new HashSet<String>();
		Set <Long> setCodigo = new HashSet<Long>();
		
		//adicionando dados na setNomes
		setNomes.add("Cintia");
		setNomes.add("Amanda");
		setNomes.add("amanda");
		setNomes.add("Nath");
		setNomes.add("Andre");
		setNomes.add("Andre");
		setNomes.add("Andre");
		setNomes.add(nome2);
		
		//exibir a coleção de nomes do setNomes
		System.out.println(setNomes);
		
		//validar se o setnomes esta vazio
		System.out.println("set nomes esta vazio: "+setNomes.isEmpty());
		
		//validar se o setnomes tem a informação Nath em alguma de suas posições
		System.out.println("existe o dado Nath na coleção set nomes: "+setNomes.contains("Nath"));
		
		//validar se o setCodigo esta vazio
		System.out.println("set codigo esta vazio:" +setCodigo.isEmpty());
		
		//removendo a informação amanda da setNomes
		setNomes.remove("amanda");
		
		System.out.println(setNomes);
		
		//percorrer um a um os itens do setNomes com for
		for(String nome : setNomes) {
			System.out.println("temos na set o nome: "+nome);
		}
		
		System.out.println("******* saida de itens da coleção com Iterator*******");
		//criando o Iterator isetNomes para percorrer o setNomes
		Iterator <String> isetNomes = setNomes.iterator();
		
		//varrendo os dados com um while, e retornando linha a alinha
		while(isetNomes.hasNext()) {
			System.out.println(isetNomes.next());
		}
		
		
	}

}
