package aula.maratonajava.javacore.Oexcecoes.runtime.teste;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //CHECKED e UNCHECKED

        int[] nums = {0, 1, 2};

        System.out.println(nums[2]);

        int n1 = 10;
        int n2 = 5;

        int divisao0 = n1 / n2;

        System.out.println(divisao0);
    }
}
