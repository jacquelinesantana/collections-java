package exemplosList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		//vamos receber dados via teclado para adicionar na list
		Scanner leia = new Scanner(System.in);
		String nome = "Gabrielle";
		
		
		String nome2;
		System.out.println("Digite um nome");
		nome2 = leia.nextLine();
		
		// exemplos de uso de List
		ArrayList <String> nomes = new ArrayList<String>();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Double> valor = new ArrayList<Double>();
		ArrayList<Long> codigo = new ArrayList<Long>();
		
		//adicionar nomes da estrutura nomes
		nomes.add("Gabrielle");
		nomes.add("Aline");
		nomes.add("Dani");
		nomes.add("Lucas");
		
		//exibir o list nomes
		System.out.println(nomes);
		
		//retonar o indice onde temos o dado Dani
		System.out.println("o indice onde esta o nome Dani é a posição: "+nomes.indexOf("Dani"));
		
		
		System.out.println(nomes.indexOf("Liza"));
		
		//retornando true ou false para contem a informação Dani em alguma das posições do list nomes?
		System.out.println(nomes.contains("Dani"));
		
		//retorna apenas o dado do indice 3
		System.out.println("a informação da posição 3 do list é: "+nomes.get(3));
		
		//alterar uma informação na posição 2
		nomes.set(2, "David");
		
		System.out.println(nomes);
		
		
		System.out.println(nomes.isEmpty());
		
		System.out.println(codigo.isEmpty());
		
		//remover todos os dados do list nomes
		nomes.clear();
		System.out.println(nomes);
		
		//adicionar nomes da estrutura nomes
		nomes.add("Gabrielle");
		nomes.add("Aline");
		nomes.add("Dani");
		nomes.add("Lucas");
		
		//remover apenas a informação do indice 1 da list
		nomes.remove(1);
		
		System.out.println(nomes);
		
		//removendo utilizando o indexOf para localizar qual indice vamos afetar agora 
		nomes.remove(nomes.indexOf("Dani"));
		System.out.println(nomes);
		
		nomes.remove(nomes.indexOf(nome));
		System.out.println(nomes);
		//adicionar nomes da estrutura nomes
		nomes.add("Andressa");
		nomes.add("Liza");
		nomes.add("Liza");
		nomes.add("Gabriel");
		
		
		//percorrendo o list nomes com for
		for(String n : nomes) {
			System.out.println("Estamos vendo agora o nome: " + n);
		}
		nomes.add("Yan");	
		
		System.out.println("********Nova lista********");
		for(String n : nomes) {
			System.out.println("Estamos vendo agora o nome: " + n);
		}
		nomes.add(nome2);
		
		
		//iniciou 1 // contador ++ contador =2
		for(int contador = 1; contador <3; contador ++) {
			System.out.println("Digite outro nome:");
			nome2 = leia.nextLine();
			nomes.add(nome2);
			System.out.println("o nome informado foi:" + nome2);
		}
		
		
		System.out.println("********Nova lista com nome inserido por teclado********");
		
		
		for(String n : nomes) {
			System.out.println("Estamos vendo agora o nome: " + n);
		}
		
		System.out.println("*****Nomes retornados com iterator*****");
		//interator é uma estrutura interface que permite percorrer todos os objetos de uma coleção de dados
		Iterator <String> iNomes = nomes.iterator();
		
		//hasNext é um método que valida enquanto houverem dados na iNomes(no objeto interator)
		while(iNomes.hasNext()) {
			
			//Next faz o papel de chamar o próximo item da iNomes
			System.out.println(iNomes.next());
			//System.out.println(numero++); //numero1
		}
		
	}

}
