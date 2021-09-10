package processadordemacros;

import java.io.FileWriter;
import java.io.IOException;

public class Output {

  public static void saida(String caminhoFunction) throws IOException {

    FileWriter arq = new FileWriter(caminhoFunction);

    arq.close();

    System.out.printf("\nArquivo criado com sucesso em %s\n", caminhoFunction);
  }

}