package atividades;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programa3 {
    public static void main(String args[]) throws IOException {
        FileInputStream pastadoarquivo = new FileInputStream("C:\\Users\\Mariza\\Desktop\\Testes\\Inputs.txt");
        InputStreamReader ainput = new InputStreamReader(pastadoarquivo);
        BufferedReader buff = new BufferedReader(ainput);
        String linha = buff.readLine();
        String[] input = new String[2];
        int i = -1;
         do{
            i = i + 1;
            input[i] = linha;
            linha = buff.readLine();
            }while (linha != null)
            String[] input1 = input[0].split(" ");
            String[] input2 = input[1].split(" ");
            int[] input1a = new int[input1.length];
            int[] input2b = new int[input2.length];
        for(int j = 0; j < input1.length; j++){
            input1a[j] = Integer.parseInt(input1[j]);
            input2b[j] = Integer.parseInt(input2[j]);
        }
            if(input2b[0] >= input1a[0] && input2b[0] <= input1a[2] && input2b[1] >= input1a[1] && input2b[1] <= input1a[3]){
                    System.out.println("1");
                }else{
                if (input2b[2] >= input1a[0] && input2b[2] <= input1a[2] && input2b[3] >= input1a[1] && input2b[3] <= input1a[3]){
                    System.out.println("1");
                }else{
                    System.out.println("0");
            }
        }
    }
}
