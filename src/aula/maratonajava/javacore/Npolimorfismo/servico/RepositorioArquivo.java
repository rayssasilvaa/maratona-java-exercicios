package aula.maratonajava.javacore.Npolimorfismo.servico;

import aula.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em arquivo.");
    }

    ;
}
