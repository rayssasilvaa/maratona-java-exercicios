package aula.maratonajava.javacore.Minterfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Loading data...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission in data base");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("retrieve max data size in DataBaseLoader");
    }
}
