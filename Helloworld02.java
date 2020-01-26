public final class Helloworld02 {
  private static final String[] SALUTI = {
    "Hello, World!!!"
    , "Ciao, Mondo!!!"
    , "Salut, Monde!!!"
  };

  private String messaggio;

  private Helloworld02(final String messaggio) {
    this.messaggio = messaggio;
  }

  private void saluta() {
    System.out.println(this.messaggio);
  }

  public static void main(String args[]) {
    for (final String curr : SALUTI) {
      new Helloworld02(curr).saluta();
    }
  }
}
