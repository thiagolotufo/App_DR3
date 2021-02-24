package br.edu.infnet.aula01;

import java.util.ArrayList;
import java.util.List;

public class AlunoTeste {
	public static void main(String[] args) {
		
		Integer[] id = {1,2,3};
		String[] nome = {"thiago", "joão", "lucas"};
		String[] email = {"thiago@al.infnet.edu.br", "joao@al.infnet.edu.br", "lucas@al.infnet.edu.br"};
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for(int i = 0; i < nome.length; i++) {
			Aluno aluno = new Aluno();
			aluno.setId(i+1);
			aluno.setNome(nome[i]);
			aluno.setEmail(email[i]);
			alunos.add(aluno);	
		}
		
		for(Aluno item : alunos) {
			System.out.println(item);
		}
	}
}
