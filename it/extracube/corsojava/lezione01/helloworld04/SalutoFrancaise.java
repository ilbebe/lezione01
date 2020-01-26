package it.extracube.corsojava.lezione01.helloworld04;

public final class SalutoFrancaise{
  private String messaggio;

  public SalutoFrancaise(final String messaggio) {
    this.messaggio = messaggio;
  }

  public final void saluta() {
    System.out.println(this.messaggio);
  }
}
