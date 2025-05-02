package exercicios.capitulo_2.animais;

public class Boi extends Mamifero{

  public Boi(String nome, double vida) {
    super(nome, vida);
  }

  @Override
  void emitirSom() {
    System.out.println("muuuuuuu");
  }
  
}
