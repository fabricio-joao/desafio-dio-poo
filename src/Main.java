import br.com.desafio.Conteudo;
import br.com.desafio.Curso;
import br.com.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Metoria Java");
        mentoria.setDescricao("mentoria java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
        System.out.println(curso1);
        System.out.println(curso2);
    }
}