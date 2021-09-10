package processadordemacros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Input {

  public static void entrada(String caminhoFunction) {
   
    System.out.printf("\nTexto do arquivo:\n");
    try {
      FileReader arq = new FileReader(caminhoFunction); //abre o arquivo pra leitura
      BufferedReader lerArq = new BufferedReader(arq); 
    
    //essa parte debaixo, é só um teste pra ver se tá lendo, com a construção da macro, esse laço é apagado
      String linha = lerArq.readLine(); // lê a primeira linha
      while (linha != null) {
        System.out.printf("%s\n", linha);
        linha = lerArq.readLine(); // lê da segunda até a última linha
      }
      arq.close();
    } catch (IOException opening) {
        System.out.printf("Erro na abertura do arquivo: %s\n", caminhoFunction);
    }
    
    System.out.println();
  }
}