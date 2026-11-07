package aula.maratonajava.javacore.ZZAclassesInternas;

public class OuterClassesTest02 {
    private String name = "cat";

    void print() {

        class Animal {
            public void printLocal() {
                System.out.println(name);
            }
        }

        Animal animal = new Animal();
        animal.printLocal();
    }


    public static void main(String[] args) {
        OuterClassesTest02 outerClassesTest02 = new OuterClassesTest02();

        outerClassesTest02.print();
     }
}
