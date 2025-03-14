public class Main {
  public static void main(String[] args) {
    Autor autor1 = new Autor();

    autor1.nome = "Primo do Dodas";
    autor1.nacionalidade = "Brasileiro";

    Pessoa pessoa1 = new Pessoa();
    
    pessoa1.nome = "Dodas";
    pessoa1.idade = 21;

    Livro livro1 = autor1.escreverLivro("As Crônicas de Nárnia");

    pessoa1.emprestarLivro(livro1);
    pessoa1.devolverLivro(livro1);

    System.out.println(livro1.detalhes());
  }
} 