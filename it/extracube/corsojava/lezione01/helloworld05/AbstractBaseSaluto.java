package it.extracube.corsojava.lezione01.helloworld05;

abstract class AbstractBaseSaluto extends AbstractSaluto {
  protected AbstractBaseSaluto(final String saluto) {
    super(saluto);
  }

  protected String getPrefisso() {
    return "";
  }
  protected final String getSuffisso() {
    return "!!!";
  }
}
