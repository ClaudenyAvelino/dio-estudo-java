public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void mudarDeCanal(int novoCanal) {
    canal = novoCanal;
  }

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

  public void aumentarVolume() {
    volume++;
  }

  public void diminuirVolume() {
    volume--;
  }

}
