package aula.maratonajava.javacore.Xserializacao.test;

import aula.maratonajava.javacore.Xserializacao.dominio.Aluno;
import aula.maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(0L, "rayssa", "1234");
        Turma turma = new Turma("Turma B");
        aluno.setTurma(turma);

        serializar(aluno);
        deserializar();
    }

    public static void serializar(Aluno aluno) {
        Path path = Paths.get("arquivo", "teste.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deserializar() {
        Path path = Paths.get("arquivo", "teste.txt");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
