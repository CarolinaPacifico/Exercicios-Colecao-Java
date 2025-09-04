package Exercicio2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //turma de alunos matriculados em banco de dados
        Set<Aluno> turmaBD = new HashSet<>();
        turmaBD.add(new Aluno(10, "A", "A"));
        turmaBD.add(new Aluno(20, "B", "B"));
        turmaBD.add(new Aluno(10, "C", "C"));
        turmaBD.add(new Aluno(30, "D", "D"));


        //turma de alunos matriculados em estrutura de dados
        Set<Aluno> turmaED = new HashSet<>();
        turmaED.add(new Aluno(40, "E", "E"));
        turmaED.add(new Aluno(20, "F", "F"));
        turmaED.add(new Aluno(50, "G", "G"));
        turmaED.add(new Aluno(30, "H", "H"));

        //Listagem de todos os alunos matriculados
        Set<Aluno> uniao = new HashSet<>(turmaBD);
        uniao.addAll(turmaED); // objetos individuais de cada lista, que não se repetem
        //uniao.retainAll(turmaED); // objetos que aparecem nas duas listas


        uniao.forEach(aluno -> System.out.println(aluno));




    }
}
