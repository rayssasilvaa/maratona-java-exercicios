package aula.maratonajava.javacore.Bmetodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subDoisNumeros() {
        System.out.println(20 - 10);
    }

    public void multiplicaDoisNumeros(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public double divideDoisNumero(double n1, double n2) {
        if (n2 == 0) {
            return 0;
        }
        return n1 / n2;
    }

    public double divideDoisNumero2(double n1, double n2) {
        if (n2 != 0) {
            return n1 / n2;
        }
        return 0;
    }

    public void printDivisaoDeDoisNumeros(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(n1 / n2);
    }

    public void alteraDoisNumero(int idadeAtual, int anoDeNascimento) {
        idadeAtual = 20;
        anoDeNascimento = 2005;

        System.out.println("A idade atual é " + idadeAtual);
        System.out.println("O ano de nascimento é " + anoDeNascimento);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
