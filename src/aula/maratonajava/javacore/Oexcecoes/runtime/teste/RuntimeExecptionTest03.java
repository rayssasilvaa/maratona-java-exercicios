package aula.maratonajava.javacore.Oexcecoes.runtime.teste;

public class RuntimeExecptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    public static String abreConexao() {
        try {
            System.out.println("Dentro do TRY");
            return "conexao aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Dentro do finally");
        }
        return null;
    }
}
