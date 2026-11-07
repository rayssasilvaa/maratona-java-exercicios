package aula.maratonajava.javacore.Kenumeracao.test;

import aula.maratonajava.javacore.Kenumeracao.domain.Cliente;
import aula.maratonajava.javacore.Kenumeracao.domain.TipoCliente;
import aula.maratonajava.javacore.Kenumeracao.domain.TipoPagamento;


public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("nini", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("bento", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());

        TipoCliente tipoCliente1 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente1);
    }
}
