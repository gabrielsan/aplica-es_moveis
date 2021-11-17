package atividades;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Atividade1 {
    public static void main(String args[]) throws IOException {
        FileInputStream pastadoarquivo = new FileInputStream("C:\\Users\\Mariza\\Desktop\\Testes\\Inputs.txt");
        InputStreamReader ainput = new InputStreamReader(pastadoarquivo);
        BufferedReader buff = new BufferedReader(ainput);
        String linha = buff.readLine();
        String[] input = new String[3];
        int i = -1;
        while (linha != null) {
            i = i + 1;
            input[i] = line;
            linha = buff.readLine();
        }
        String[] pedaco = input[2].split(" ");
        int media = 0;
        int TamanhoMaximo = 0;
        for (int k = 0; k < pedaco.length; k++) {
            media += Integer.parseInt(pedaco[k]);
        }
        media = media / Integer.parseInt(input[0]);
        while (media > 0) {
            for (int k = 0; k < pedaco.length; k++) {
                TamanhoMaximo += Integer.parseInt(pedaco[k]) / media;
            }
            if (TamanhoMaximo == Integer.parseInt(input[0])) {
                System.out.println(media);
                break;
            } else {
                media = media - 1;
                TamanhoMaximo = 0;
            }
        }
    }
}