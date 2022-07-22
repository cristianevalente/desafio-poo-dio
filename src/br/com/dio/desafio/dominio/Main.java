package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();


        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java: muito bom!!! ");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS: excelente!!! ");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Enriquecedora!!!");
        mentoria.setData(LocalDate.now());

  /*      System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

       Bootcamp bootcamp =new Bootcamp();
       bootcamp.setNome("Bootcamp Java Developer");
       bootcamp.setDescricao("Descrição Bootcamp Developer");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);

       Dev devCristiane = new Dev();
       devCristiane.setNome("Cristiane");
       devCristiane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Cristiane" + devCristiane.getConteudosInscritos());

        devCristiane.progredir();
        System.out.println("Conteúdos Incritos Cristiane" + devCristiane.getConteudosInscritos());
       System.out.println("Conteúdos Concluídos Cristiane" + devCristiane.getConteudosConluidos());
        System.out.println("XP: " + devCristiane.calcularXp());

       Dev devBaethyr = new Dev();
        devBaethyr.setNome("Baethyr");
        devBaethyr.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos" + devBaethyr.getConteudosInscritos());

        devBaethyr.progredir();
        devBaethyr.progredir();

        System.out.println("Conteúdos Incritos" + devBaethyr.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devBaethyr.getConteudosConluidos());
        System.out.println("XP: " + devBaethyr.calcularXp());

    }
}
