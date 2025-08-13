package br.com.meucatalogo;

import br.com.meucatalogo.model.Classificacao;
import br.com.meucatalogo.model.Filme;
import br.com.meucatalogo.model.Genero;
import br.com.meucatalogo.model.Usuario;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme(1, "Estrelas Alem do Tempo", 2016, 7.8, 129, Genero.DRAMA, "A história de uma equipe de matemáticas afro-americanas e o papel central que desempenharam na NASA durante os primeiros anos do programa espacial nos Estados Unidos.", Classificacao.DEZ_ANOS);
        System.out.println(filme.toString());

        System.out.println();

        Usuario usuario = new Usuario(1, "Lucas Henique", LocalDate.of(2015, 01, 19), "lucash@gmail.com", "19 99777-5853", "LucasH1234");
        System.out.println(usuario.toString());
    }
}
