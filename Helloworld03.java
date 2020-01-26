import java.util.HashSet;
import java.util.Set;

public final class Helloworld03 {
  private static final Set<String> SALUTI = new HashSet<String>(){
    {
      add("Hello, World!!!");
      add("Ciao, Mondo!!!");
      add("Salut, Monde!!!");
    }
  };

  private String messaggio;

  private Helloworld03(final String messaggio) {
    this.messaggio = messaggio;
  }

  private void saluta() {
    System.out.println(this.messaggio);
  }

  public static void main(String args[]) {
    for (final String curr : SALUTI) {
      new Helloworld03(curr).saluta();
    }
  }
}
