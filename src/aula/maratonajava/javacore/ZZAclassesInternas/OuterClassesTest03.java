package aula.maratonajava.javacore.ZZAclassesInternas;

public class OuterClassesTest03 {
    private String game = "Valorant";
   static class Games{
       void print(){
           System.out.println(new OuterClassesTest03().game);
       }
   }

    public static void main(String[] args) {
        Games games = new Games();

        games.print();
    }
}
