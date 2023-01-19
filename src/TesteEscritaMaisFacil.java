import java.io.*;

public class TesteEscritaMaisFacil {
    public static void main(String[] args) {
        try {
            /*OutputStream fos = new FileOutputStream("lorem4.txt");
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);*/

            BufferedWriter bw = new BufferedWriter(new FileWriter("lorem4.txt"));

            bw.write("Testando a escrita de um novo arquivo!");
            bw.newLine();
            bw.newLine();
            bw.write("Testando a escrita de um novo arquivo!");


            bw.close();

        }catch (Exception e) {
            System.out.println("Erro! Arquivo não encontrado: " + e.getMessage());
        }
    }
}
