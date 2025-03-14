class Autor {
  String nome;

  String nacionalidade;

  Livro livro;

  public Livro escreverLivro(String titulo){
    Livro novo_livro = new Livro();

    novo_livro.titulo = titulo;
    novo_livro.autor = this;
    novo_livro.biblioteca.endereco = "Egito";
    novo_livro.biblioteca.nome = "Alexandria";

    livro = novo_livro;
    return novo_livro;
  }

  public void obterBiografia(){
    System.out.println("");
  }
}