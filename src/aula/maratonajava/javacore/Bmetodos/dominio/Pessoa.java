package aula.maratonajava.javacore.Bmetodos.dominio;

public class Pessoa {
    private String name;
    private int age;

   /* public void imprime(){
        System.out.println(this.name);
        System.out.println(this.age + " anos");
    }*/

    public void setName(String nome) {
        this.name = nome;
    }

    public void setAge(int idade) {
        this.age = idade;
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
