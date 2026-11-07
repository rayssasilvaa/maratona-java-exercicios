package aula.maratonajava.javacore.Minterfaces.test;

import aula.maratonajava.javacore.Minterfaces.domain.DataBaseLoader;
import aula.maratonajava.javacore.Minterfaces.domain.DataLoader;
import aula.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();
        System.out.println("================ ");
        dataBaseLoader.remove();
        fileLoader.remove();

        System.out.println("============================================");
        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        System.out.println("============================================");
        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
