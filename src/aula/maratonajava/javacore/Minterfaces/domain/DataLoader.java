package aula.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    static final int MAX_DATA_SIZE = 10;

    void load();

    default void checkPermission() {
        System.out.println("Checking...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("retrieve max data size in DataLoader");
    }
}
