package desafio.poo.dio;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Curso curso1 = new Curso();
        curso1.setTitulo(" Programação Java");
        curso1.setDescricao("Descrição do curso de programação em java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo(" Curso C#");
        curso2.setDescricao("Descrição do curso de C#");
        curso2.setCargaHoraria(9);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo(" Mentoria de lógica de programação");
        mentoria1.setDescricao("Descrição da mentoria em lógica de programação");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo(" Mentoria de POO");
        mentoria2.setDescricao("Descrição da mentoria em POO");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();

        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Bootcamp bootcamp2 = new Bootcamp();

        bootcamp2.setNome("Bootcamp C# Developer");
        bootcamp2.setDescricao("Descrição Bootcamp C# Developer");
        bootcamp2.getConteudos().add(curso1);
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(mentoria2);

        Dev devIsabella = new Dev();
        devIsabella.setNome("Isabella");
        devIsabella.inscreverBootcamp(bootcamp1);
        System.out.println("\nConteúdos Inscritos Isabella: " + devIsabella.getConteudosInscritos());
        devIsabella.progredir();
        System.out.println("\nConteúdos Inscritos Isabella: " + devIsabella.getConteudosInscritos());
        System.out.println("\nConteúdos Concluidos Isabella: " + devIsabella.getConteudosConcluidos());

        System.out.println("\n------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp2);
        System.out.println("\nConteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("\nConteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("\nConteúdos Concluidos João: " + devJoao.getConteudosConcluidos());
        devJoao.progredir();

        scanner.close();
    }
}