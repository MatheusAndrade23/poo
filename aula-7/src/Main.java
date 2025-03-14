public class Main {
  public static void main(String[] args){
    Salgado coxinha = new Salgado("coxinha");
    Salgado enroladinho = new Salgado("enroladinho");

    Cantina neide = new Cantina("neide");

    neide.addSalgado(coxinha);
    neide.addSalgado(enroladinho);
    neide.mostraInfo();
  }
}