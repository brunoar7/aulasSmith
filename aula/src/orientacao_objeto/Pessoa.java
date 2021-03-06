package orientacao_objeto;

import java.util.Date;

//classe representa algo no mundo real ex: pessoa,produto,vendas...

public class Pessoa {  
	
	//classe Pessoa contem suas caracteristicas com modificador de acesso "private"
	//ideal é que cada classe tenha atributos privados quando os atributos pertencem só a ela
	
	//Tipos de modificadores:
	//default - apenas no mesmo pacote
	//protected - apenas no mesmo pacote ou atraves de heranca
	//public - todos podem acesar
	//private - pertence só'a classe
	
	Boolean ativo;
	protected String categoria;
	
	private Integer id;
	private String nome;				//caracteristicas= atributos
	private Double salario;
	private Date dataInsercao;

	
	
	//classe é basicamente composto de atributos e metodos
	
	//encapsulamento é acesso ao atributo privado atraves de metodos
	//camelCase - primeiraSegundaTerceira
	//set - entrada de dados //get - saida de dados
	//VO - value Object
	
	
	public void setID(Integer id) {                //metodo void nao retorna, só executa // to acessando o atributo atraves do metodo void 
		this.id = id;								// açao set(encapsulamento) 
	}												// atraves dessa ação eu passo um valor ao atributo id					
		
	public Integer getid() {
		return this.id;
	}
		
		
		
		
	
		
	
	
}
