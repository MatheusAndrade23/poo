package exercicios.capitulo_2.animais;

abstract class Mamifero {
  protected String nome;
  protected double vida;

  Mamifero(String nome, double vida) {
    this.nome = nome;
    this.vida = vida;
  }

  abstract void emitirSom();

  void mostraInfo(){
    System.out.println("Nome: " + this.nome);
    System.out.println("Vida: " + this.vida);
  }
} 
