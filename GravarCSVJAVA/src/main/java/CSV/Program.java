package CSV;



import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Program {

    public static void main(String[] args) throws IOException {

        List<Aluno> alunos = new ArrayList<Aluno>();
        Aluno Lucas = new Aluno("Lucas", 10, 10);
        Aluno Luan = new Aluno("Luan", 10, 1.2);
        Aluno Bruno = new Aluno("Bruno", 10, 5.9);

        alunos.add(Lucas);
        alunos.add(Luan);
        alunos.add(Bruno);

        var soma = Lucas.getNota() + Luan.getNota() + Bruno.getNota();
        System.out.printf("SOma da snotas é:" + soma);

        FileWriter arqLucas = new FileWriter("Lucas.csv");
        PrintWriter grArquivosLucas = new PrintWriter(arqLucas);
        grArquivosLucas.println("Nome" + ","+ "Idade"+ ","+ "Notas"+","+ "Soma das Notas");
        grArquivosLucas.println(Lucas.getNome() + ","+ Lucas.getIdade()+ ","+ Lucas.getNota() +","+ soma);
        arqLucas.close();

        FileWriter arqLuan = new FileWriter("Laun.csv");
        PrintWriter grArquivosLaun = new PrintWriter(arqLuan);
        grArquivosLaun.println("Nome" + ","+ "Idade"+ ","+ "Notas"+","+ "Soma das Notas");
        grArquivosLaun.println(Luan.getNome() + ","+ Luan.getIdade()+ ","+ Luan.getNota()+","+ soma);
        arqLuan.close();

        FileWriter arqBruno = new FileWriter("Bruno.csv");
        PrintWriter grArquivosBruno = new PrintWriter(arqBruno);
        grArquivosBruno.println("Nome" + ","+ "Idade"+ ","+ "Notas"+","+ "Soma das Notas");
        grArquivosBruno.println(Bruno.getNome() + ","+ Bruno.getIdade()+ ","+ Bruno.getNota()+","+ soma);
        arqBruno.close();

        FileWriter arqAlunos = new FileWriter("Alunos.csv");
        PrintWriter grArquivosAlunos = new PrintWriter(arqAlunos);
        grArquivosAlunos.println("Nome" + ","+ "Idade"+ ","+ "Notas"+","+ "Soma das Notas");
        grArquivosAlunos.println(Lucas.getNome() + ","+ Lucas.getIdade()+ ","+ Lucas.getNota()+","+ soma);
        grArquivosAlunos.println(Luan.getNome() + ","+ Luan.getIdade()+ ","+ Luan.getNota()+","+ soma);
        grArquivosAlunos.println(Bruno.getNome() + ","+ Bruno.getIdade()+ ","+ Bruno.getNota()+","+ soma);
        arqAlunos.close();


    }
}