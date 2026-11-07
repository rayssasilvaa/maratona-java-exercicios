package aula.maratonajava.pratica.SistemaDeCadastro.Usuario;

import aula.maratonajava.pratica.SistemaDeCadastro.Cadastro.Dados;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio {
    private static final List<Dados> usuarios = new ArrayList<>();

    public static void adicionar(Dados usuario){
        usuarios.add(usuario);
    }

    public static Dados buscarPorEmail(String email){
        for (Dados usuario : usuarios){
            if (usuario.getEmail().equalsIgnoreCase(email)){
                return usuario;
            }
        }

        return null;
    }
}
