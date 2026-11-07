package aula.maratonajava.pratica.StreamsPratica;

public class People {
    private String name;
    private int age;
    private String favoriteColor;

    public People(String name, int age, String favoriteColor){
        this.name = name;
        this.age = age;
        this.favoriteColor = favoriteColor;
    }

    @Override
    public String toString() {
        return
                "name: " + name + "\n" +
                "age: " + age + "\n" +
                "favorite color: " + favoriteColor;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setFavoriteColor(String favoriteColor){
        this.favoriteColor = favoriteColor;
    }

    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getFavoriteColor() {
        return favoriteColor;
    }
}
