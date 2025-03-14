class Biblioteca {
  String nome;
  
  String endereco;

  public void adicionarLivro(Livro livro){
    System.out.println("Livro: " + livro.titulo + " adicionado!");
  }

  public void removerLivro(Livro livro){
    System.out.println("Livro: " + livro.titulo + " removido!");
  }

  public void listarLivro(){
    System.out.println("Livros listados!");
  }
}