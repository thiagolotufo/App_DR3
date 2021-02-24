package br.edu.infnet.aula01;

import java.util.HashMap;
import java.util.Map;

public class AlunoMapa {
	public static void main(String[] args) {
		
		Map<Integer, String> mapaAluno = new HashMap<Integer, String>();
		
		mapaAluno.put(1, "Thiago");
		mapaAluno.put(2, "Lucas");
		mapaAluno.put(3, "Marcos");
		
		mapaAluno.remove(1);
	}
}
