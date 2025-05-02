package exercicios.capitulo_2.animais;

public class Lontra extends Mamifero implements Aquatico{
  public Lontra(String nome, double vida) {
    super(nome, vida);
  }

  @Override
  void emitirSom() {
    System.out.println("");
  }

  @Override
  public void nadar() {
    System.out.println("nadou");
  }
}
