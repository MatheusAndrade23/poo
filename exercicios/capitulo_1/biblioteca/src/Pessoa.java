class Pessoa {
  String nome;

  int idade;

  Livro livro;

  public void emprestarLivro(Livro livro){
    this.livro = livro;
    System.out.println(nome + " emprestando " + livro.titulo);
  }

  public void devolverLivro(Livro livro){
    System.out.println(nome + "devolvendo" + livro.titulo);
  }

  public void listarLivroEmprestado(Livro livro){
    System.out.println("Livro " + livro.titulo + " está emprestado!");
  }
}