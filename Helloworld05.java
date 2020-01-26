import it.extracube.corsojava.lezione01.helloworld05.SalutoEnglish;
import it.extracube.corsojava.lezione01.helloworld05.SalutoEspanol;
import it.extracube.corsojava.lezione01.helloworld05.SalutoFrancaise;
import it.extracube.corsojava.lezione01.helloworld05.SalutoItaliano;

public final class Helloworld05 {

  public static void main(String args[]) {
      new SalutoEnglish().saluta();
      new SalutoItaliano().saluta();
      new SalutoFrancaise().saluta();
      new SalutoEspanol().saluta();
  }
}
