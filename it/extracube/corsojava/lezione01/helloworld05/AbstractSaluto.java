package it.extracube.corsojava.lezione01.helloworld05;

abstract class AbstractSaluto {
  private final String messaggio;

  protected AbstractSaluto(final String messaggio) {
    this.messaggio = messaggio;
  }

  protected abstract String getPrefisso();
  protected abstract String getSuffisso();

  public final void saluta() {
    System.out.println(String.format("%2$s%1$s%3$s", this.messaggio
                                                   , getPrefisso()
                                                   , getSuffisso()
                                     ));
  }
}
