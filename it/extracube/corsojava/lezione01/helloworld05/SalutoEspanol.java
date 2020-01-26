package it.extracube.corsojava.lezione01.helloworld05;

public final class SalutoEspanol  extends AbstractBaseSaluto {
  private static final String SALUTO = "Hola, Mundo";

  public SalutoEspanol() {
    super(SALUTO);
  }

  protected final String getPrefisso() {
      return "\u00A1\u00A1\u00A1";
  }
}
