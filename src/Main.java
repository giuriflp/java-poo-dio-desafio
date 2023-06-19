import br.com.dio.desafio.dominio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setDescricao("Descricao curso");
        cursoJava.setTitulo("Curso Java");
        cursoJava.setCargaHoraria(8);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setData(LocalDate.now());
        mentoriaJava.setDescricao("Descricao mentoria.");
        mentoriaJava.setTitulo("Mentoria POO Java.");

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java");
        bootcampJava.setDescricao("Descricao bootcamp");
        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(mentoriaJava);

        Dev devDevis = new Dev();
        devDevis.setNome("Devis");
        devDevis.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos " + devDevis.getConteudosInscritos());
        System.out.println("XP: " + devDevis.calcularTotalXp());
        devDevis.progredir();
        System.out.println("Conteúdos Concluidos " + devDevis.getConteudosConcluidos());

        System.out.println("XP: " + devDevis.calcularTotalXp());
        System.out.println("Conteúdos Inscritos " + devDevis.getConteudosInscritos());


        Dev devFifo = new Dev();
        devFifo.setNome("Fifo");
        System.out.println("Conteúdos Inscritos" + devFifo.getConteudosInscritos());







    }
}