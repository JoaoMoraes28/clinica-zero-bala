/*
 * Programandor: João Moraes
 * 26/02/2025
 * Empresa: SENAI
 */

package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {

	private String nome;
	public LocalDate dataNascimento;
	private int peso;
	private double altura;
	public String telefone;
	private double imc;
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void setAltura(double altura) {
		if (altura >= 0) {
		this.altura = altura;
		} else {
			System.out.println("A altura do(a) paciente " + nome + " esta inválida./nA altura deve ser maior ou igual a zero.");
		}
	}
	
	public void setNome(String nome) {

		if(nome.length() >= 3) {
			this.nome = nome;
		} else {
			System.out.println("O nome " + nome + " não é válido!\nO nome deve conter pelo menos 3 caracteres.");
		}
		
	}
	
	public void calcularIdade() {
		
	}
	
	private double calcularImc() {
		
		imc = peso / Math.pow(altura, 2);
		return imc;
	}
		
	public void classificarImc() {
		
		
	}
	
	public void mostrarFichaDoPaciente() {
		
		System.out.println("==================");
		System.out.println("DADOS DO PACIENTE");
		System.out.println("==================");
		System.out.println("Nome: " + nome);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println("IMC: " + String.format("%.2f", calcularImc()));
		System.out.println("Telefone: " + telefone);
		System.out.println("==================");
		
	}
}

