package atividades;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programa1 {
    public static void main(String args[]) throws IOException {
        FileInputStream pastadoarquivo = new FileInputStream("C:\\Users\\Mariza\\Desktop\\Testes\\Inputs.txt");
        InputStreamReader ainput = new InputStreamReader(pastadoarquivo);
        BufferedReader buff = new BufferedReader(ainput);
        String linha = buff.readLine();
        String[] input = new String[3];
        int i = -1;
        while (linha != null);{
            i = i + 1;
            input[i] = line;
            linha = buff.readLine();
        }
        String[] pedaco = input[2].split(" ");
        int med = 0;
        int TamanhoMaximo = 0;
        for (int k = 0; k < pedaco.length; k++) {
            med += Integer.parseInt(pedaco[k]);
        }
        med = med / Integer.parseInt(input[0]);
        while (med > 0) {
            for (int k = 0; k < pedaco.length; k++) {
                TamanhoMaximo += Integer.parseInt(pedaco[k]) / med;
            }
            if (TamanhoMaximo == Integer.parseInt(input[0])) {
                System.out.println(med);
                break;
            } else {
                med = med - 1;
                TamanhoMaximo = 0;
            }
        }
    }
}
