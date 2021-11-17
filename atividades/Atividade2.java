package atividades;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Atividade2 {
    public static void main(String args[]) throws IOException {
        FileInputStream pastadoarquivo = new FileInputStream("C:\\Users\\Mariza\\Desktop\\Testes\\Inputs.txt");
        InputStreamReader ainput = new InputStreamReader(pastadoarquivo);
        BufferedReader buff = new BufferedReader(ainput);
        String  linha = buff.readLine();
        String input1 = linha;
        line = buff.readLine();
        String[] input1a = input1.split(" ");
        String[] input = new String[Integer.parseInt(input1a[1])];
        int i = -1;
        do{
            i = i + 1;
            input[i] =  linha;
            linha = buff.readLine();
        } while ( linha != null);
        int[] vendedores = new int[Integer.parseInt(input1a[0])];
        int[] desempenho = new int[Integer.parseInt(input1a[0])];
        int fim = 1;
        for (int j = 0; j < vendedores.length; j++) {
            try {
                vendedores[j] = Integer.parseInt(input[j]);
                input[j] = "0";
            } catch (Exception v) {
                System.out.println("estão faltando ligações");
            }
        }
        while (fim == 1) {
            fim = 0;
            for (int j = 0; j < vendedores.length; j++) {
                vendedores[j] = vendedores[j] - 1;
                if (vendedores[j] == 0) {
                    desempenho[j] = desempenho[j] + 1;
                }
            }
                for (int j = 0; j < vendedores.length; j++) {
                    for (int k = 0; k < input.length; k++) {
                        if (vendedores[j] == 0 && Integer.parseInt(input[k]) != 0) {
                            try {
                                vendedores[j] = Integer.parseInt(input[k]);
                                input[k] = "0";
                            } catch (Exception v) {
                            System.out.println("estão faltando ligações");
                        }
                    }
                }
            }
                for (int j = 0; j < vendedores.length; j++) {
                    if (vendedores[j] > 0) {
                        fim = 1;
                    }
                }
            }
            for (int j = 0; j < vendedores.length; j++) {
                System.out.println(j + 1 + " " + desempenho[j]);
            }
        }  
    }
}
