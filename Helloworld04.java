import it.extracube.corsojava.lezione01.helloworld04.SalutoEnglish;
import it.extracube.corsojava.lezione01.helloworld04.SalutoFrancaise;
import it.extracube.corsojava.lezione01.helloworld04.SalutoItaliano;

public final class Helloworld04 {
  private static final String[] SALUTI = {
    "Hello, World!!!"
    , "Ciao, Mondo!!!"
    , "Salut, Monde!!!"
  };


  public static void main(String args[]) {
      new SalutoEnglish(  SALUTI[0]).saluta();
      new SalutoItaliano( SALUTI[1]).saluta();
      new SalutoFrancaise(SALUTI[2]).saluta();
  }
}
