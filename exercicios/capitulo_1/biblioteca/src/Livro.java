class Livro {
  String titulo;

  Autor autor;

  Biblioteca biblioteca;

  Pessoa pessoa;

  public Livro(){
    biblioteca = new Biblioteca();

    biblioteca.nome = "Biblioteca Cachoeira";
    biblioteca.endereco = "Rua Coronel Portugal";
  }

  public String detalhes(){
    return "Titulo: " + titulo + " Autor: " + autor.nome + " Biblioteca: " + biblioteca.nome;
  }

  public void emprestar(){
    System.out.println("Livro " + titulo + " emprestado!");
  }

  public void devolver(){
    System.out.println("Livro " + titulo + " devolvido!");
  }
}