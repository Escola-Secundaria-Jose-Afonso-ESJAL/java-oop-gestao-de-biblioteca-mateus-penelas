package src.main.java.com.example;

public class Main {
    public static void main(String[] args) {

        Biblioteca bib1 = new Biblioteca();

        Livro l1 = new Livro("O Jack Espinho", "Matuca Piruca", 1967);
        Livro l2 = new Livro("O Jack Polido", "Matuca Çaruca", 1968);
        Livro l3 = new Livro("O Jack Redondo", "Matuca Riruca", 1969);

        bib1.adicionarLivro(l1);
        bib1.adicionarLivro(l2);
        bib1.adicionarLivro(l3);

        Livro l4 = new Livro("O Jack Espinho", "Matuca Maruca", 2000);
        bib1.adicionarLivro(l4);

        bib1.removerLivro("O Jack Polido");

        bib1.listarLivros();
    }
}
