package it.extracube.corsojava.lezione01.helloworld04;

public final class SalutoEnglish {
  private String messaggio;

  public SalutoEnglish(final String messaggio) {
    this.messaggio = messaggio;
  }

  public final void saluta() {
    System.out.println(this.messaggio);
  }
}
