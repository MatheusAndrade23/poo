package exercicios.capitulo_2.animais;

public class Cachorro extends Mamifero {

  public Cachorro(String nome, double vida) {
    super(nome, vida);
  }

  @Override
  void emitirSom() {
    System.out.println("auauauauau");
  }
}
