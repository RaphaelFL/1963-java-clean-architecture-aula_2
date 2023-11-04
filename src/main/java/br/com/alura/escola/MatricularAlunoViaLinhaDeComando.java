package br.com.alura.escola;

import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.alura.escola.matricular.MatricularAluno;
import br.com.alura.escola.matricular.MatricularAlunoDto;

public class MatricularAlunoViaLinhaDeComando {

	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";
		
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
		matricular.executa(
				new MatricularAlunoDto(nome, 
						cpf, 
						email));
	}
}
