package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	public static void main(String[] args) {
		
		System.out.println("Hello World ahhhhhhhhhhhhhhhhhh");
		
		// Criando um objeto paciente
		Paciente p1 = new Paciente();
		p1.nome = "Ana Maria Braga";
		p1.dataNascimento = LocalDate.of(2003, 7, 15); 
		p1.peso = 51;
		p1.altura = 1.65;
		p1.telefone = "(11) 4002-8922";
		
		Paciente p2 = new Paciente();
		p2.nome = "João";
		p2.dataNascimento = LocalDate.of(2005, 2, 28);
		p2.peso = 68;
		p2.altura = 1.72;
		p2.telefone = "(11) 9464-8451";
		
		//exibindo  a referência dos objetos
		System.out.println(p1);
		System.out.println(p2);
		
		Paciente p3 = p1;
		
		System.out.println(p3);
		
		//exibindo os dados dos objetos
		p1.mostrarFichaDoPaciente();
		p2.mostrarFichaDoPaciente();
	}
	
	

	
	
	
	
	
	
	
	
}


