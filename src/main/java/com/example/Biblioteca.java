package com.example;

import java.util.ArrayList;

public class Biblioteca {
    private static final int MAX_LIVROS = 100; // Variável de classe
    private ArrayList<Livro> livros; // Variável de instância

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public boolean adicionarLivro(Livro livro) 
    {
        if (livros.size() < MAX_LIVROS) 
        {
            for (int i = 0; i < livros.size(); i++) {
                livros.add(livro);
                return true;
            }
        }

    return false;
    }
    
    public boolean removerLivro(String titulo) 
        {
           return false; 
        }
  
    public void listarLivros() 
    {
        System.out.println("\nLivros disponíveis:");
        for (int i = 0; i < livros.size(); i++) 
        {
            Livro p = livros.get(i);
            System.out.println(
                i + " Titulo: " + p.getTitulo() + 
                " | Autor: " + p.getAutor() +
                " | Ano: " + p.getAno()
            );
        }
    }
}
