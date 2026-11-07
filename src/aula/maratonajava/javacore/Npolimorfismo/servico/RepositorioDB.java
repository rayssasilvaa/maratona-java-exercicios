package aula.maratonajava.javacore.Npolimorfismo.servico;

import aula.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioDB implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Banco de Dados.");
    }
}


