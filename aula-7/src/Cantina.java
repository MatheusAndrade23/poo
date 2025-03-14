public class Cantina {
  String nome;

  Salgado[] salgados = new Salgado[10];

  public Cantina(String nome){
    this.nome = nome;
  }

  public void addSalgado(Salgado novoSalgado) {
    for (int i = 0; i < 10; i++) {
      if(salgados[i] == null){
        salgados[i] = novoSalgado;
        return;
      }
    }
  }

  public void mostraInfo(){
    System.out.println("Os Salgados são:");

    for (Salgado salgado : salgados) {
      if(salgado != null){
        System.out.println(salgado.nome);
      }
    }
  }
}