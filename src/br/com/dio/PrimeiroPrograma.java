package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

    private static livro Livro;

    public static void main(String[] args) {
        Gato gato = new Gato();

        Object npaginas = null;
        Livro livro = new Livro ("O problema dos 3 corpos", npaginas: 300);

        System.out.println(gato);
        int a = 5;
        int b = 3;

        System.out.println("Hello World! " + (a+b));

            }
}

class Livro {
    private String nome;
    private Integer npaginas;

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npaginas=" + npaginas +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpaginas() {
        return npaginas;
    }

    public void setNpaginas(Integer npaginas) {
        this.npaginas = npaginas;
    }

    public Livro(String nome, Integer npaginas) {
        this.nome = nome;
        this.npaginas = npaginas;
    }
}
