package aula.maratonajava.javacore.Npolimorfismo.test;

import aula.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import aula.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import aula.maratonajava.javacore.Npolimorfismo.servico.RepositorioDB;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioDB();
        Repositorio repositorio1 = new RepositorioArquivo();

        repositorio.salvar();
        repositorio1.salvar();
    }
}
