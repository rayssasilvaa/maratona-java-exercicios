package aula.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Loading Files...");
    }

    @Override
    public void remove() {
        System.out.println("Removing files...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission in file");
    }
}
