import br.com.desafio.*;

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
        /*System.out.println(mentoria);
        System.out.println(curso1);
        System.out.println(curso2);*/

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devFabricio = new Dev();
        devFabricio.setNome("Fabricio");
        devFabricio.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos Fabricio:" + devFabricio.getConteudoInscritos());
        devFabricio.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Fabricio:" + devFabricio.getConteudoConcluidos());
        System.out.println("XP:" + devFabricio.calcularTotalXp());
        System.out.println("-----------------------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos Maria:" + devFabricio.getConteudoInscritos());
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Maria:" + devFabricio.getConteudoConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());
    }
}