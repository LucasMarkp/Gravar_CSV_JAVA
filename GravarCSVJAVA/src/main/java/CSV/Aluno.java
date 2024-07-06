package CSV;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {

    private String nome;

    private int idade;

    private double nota;

    public Aluno(String nome, int idade, double nota){
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public Aluno(){
    }

    public String getNome(){return this.nome;}
    public int getIdade(){return this.idade;}
    public double getNota(){return this.nota;}

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNota(double nota){
        this.idade = idade;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}