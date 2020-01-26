package it.extracube.corsojava.lezione01.helloworld04;

public final class SalutoItaliano {
  private String messaggio;

  public SalutoItaliano(final String messaggio) {
    this.messaggio = messaggio;
  }

  public final void saluta() {
    System.out.println(this.messaggio);
  }
}
