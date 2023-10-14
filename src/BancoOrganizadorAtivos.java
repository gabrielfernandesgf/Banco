import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class BancoOrganizadorAtivos {
    public static void main(String[] args) throws IOException {
     Scanner scanner = new Scanner(System.in);
     ArrayList < String > ativos = new ArrayList < > ();

    //Entrada dos tipos de ativos
    int quantidadeAtivos = scanner.nextInt();
    scanner.nextLine(); 

    // Entrada dos códigos dos ativos
    
    for (int i = 0; i < quantidadeAtivos; i++) {
      String codigoAtivo = scanner.nextLine();
      ativos.add(codigoAtivo);
    }

    // Ordenar os ativos em ordem alfabética e Imprimir
    Collections.sort(ativos);

    // Imprimir a lista de ativos ordenada
    for(String ativo: ativos){
        System.out.println(ativo);
    }
    }
}
