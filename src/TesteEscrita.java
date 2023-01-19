import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) {
        try {
            OutputStream fos = new FileOutputStream("lorem2.txt");
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

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
