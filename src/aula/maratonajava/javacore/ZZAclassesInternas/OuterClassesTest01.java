package aula.maratonajava.javacore.ZZAclassesInternas;

public class OuterClassesTest01 {
    private String name = "Rayssa";

    class Inner {
        public void printOuterClassAtribute(){
            System.out.println(name);
            System.out.println(this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();

        Inner inner = outerClass.new Inner();

        inner.printOuterClassAtribute();

    }
}
