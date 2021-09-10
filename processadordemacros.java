package processadordemacros;

import java.util.Scanner;

public class processadordemacros {

  public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);
    System.out.printf("Informe o caminho da entrada:\n");
    String caminho = ler.next(); //leitura do caminho do arquivo asm
    
    Input.entrada(caminho);
  }

}