package com.academia.ginastica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.academia.ginastica.conf.Aluno;
import com.academia.ginastica.conf.Pacotes;

public class Main {

	public static void main(String[] args) {
		int contagemAtivos = 0;
		int contagemNaoAtivos = 0;
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("Nome completo do aluno: ");
			String nomeCompleto = s.next();
			
			System.out.print("CPF do aluno: ");
			String cpf = s.next();
			
			System.out.print("Idade do aluno: ");
			int idade = s.nextInt();
			
			System.out.print("Altura do aluno: ");
			Double altura = s.nextDouble();
			
			System.out.print("Sexo do aluno: ");
			String sexo = s.next();
			
			System.out.print("Status do aluno (ativo ou nao_ativo): ");
			String status = s.next();
			
			System.out.print("Peso do aluno: ");
			Double peso = s.nextDouble();
			
			System.out.print("Matriculado no Plano A? (matriculado ou nao_matriculado): ");
			String mPlanoA = s.next();
			
			System.out.print("Matriculado no Plano B? (matriculado ou nao_matriculado): ");
			String mPlanoB = s.next();
			
			Pacotes pacotes = new Pacotes(mPlanoA, mPlanoB);
			Aluno aluno = new Aluno(nomeCompleto, cpf, sexo, status, idade, altura, peso, new Pacotes(mPlanoA, mPlanoB));
			
			if(mPlanoA.equals("matriculado")) {
				System.out.println("\n\nAluno matriculado no plano A >>>"+"\nNome completo do aluno: " + aluno.getNomeCompleto() + "\nCPF do aluno: " + aluno.getCpf() + "\nSexo do aluno: " + aluno.getSexo() + "\nStatus do aluno: " + aluno.getStatus() + "\nIdade do aluno: " + aluno.getIdade() + "\nAltura do aluno: " + aluno.getAltura() + "\nPeso do aluno: " + aluno.getPeso());
			}
			
			if(mPlanoB.equals("matriculado")) {
				System.out.println("\n\nAluno matriculado no plano B >>>" + "\nNome completo do aluno: " + aluno.getNomeCompleto() + "\nCPF do aluno: " + aluno.getCpf() + "\nSexo do aluno: " + aluno.getSexo() + "\nStatus do aluno: " + aluno.getStatus() + "\nIdade do aluno: " + aluno.getIdade() + "\nAltura do aluno: " + aluno.getAltura() + "\nPeso do aluno: " + aluno.getPeso());
			}
			
			List<String> lista = new ArrayList<>();
			lista.add(status);
			
			for(String verLista : lista) {
				if(verLista.equals("ativo")) {
					contagemAtivos = contagemAtivos + 1;
				}
				
				if(verLista.equals("nao_ativo")) {
					contagemNaoAtivos = contagemNaoAtivos + 1;
				}
				
				System.out.printf("\nAtivos: %d", contagemAtivos);
				System.out.printf("\nNão Ativos: %d", contagemNaoAtivos);
				System.out.println("Total de alunos: "+ (contagemAtivos + contagemNaoAtivos));
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter("alunos.txt", true))) {
				if(mPlanoA.equals("matriculado")) {
					bw.write("\n\nAluno matriculado no plano A >>>"+"\nNome completo do aluno: " + aluno.getNomeCompleto() + "\nCPF do aluno: " + aluno.getCpf() + "\nSexo do aluno: " + aluno.getSexo() + "\nStatus do aluno: " + aluno.getStatus() + "\nIdade do aluno: " + aluno.getIdade() + "\nAltura do aluno: " + aluno.getAltura() + "\nPeso do aluno: " + aluno.getPeso());
				}
				
				if(mPlanoB.equals("matriculado")) {
					bw.write("\n\nAluno matriculado no plano B >>>" + "\nNome completo do aluno: " + aluno.getNomeCompleto() + "\nCPF do aluno: " + aluno.getCpf() + "\nSexo do aluno: " + aluno.getSexo() + "\nStatus do aluno: " + aluno.getStatus() + "\nIdade do aluno: " + aluno.getIdade() + "\nAltura do aluno: " + aluno.getAltura() + "\nPeso do aluno: " + aluno.getPeso());
				}
				
				bw.write("\nAtivos: " + contagemAtivos);
				bw.write("\nNão Ativos: " + contagemNaoAtivos);
				bw.write("\nTotal de alunos: "+ (contagemAtivos + contagemNaoAtivos));
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
