import java.io.*;
import java.util.Objects;

public class TesteCopiaArquivo {
    public static void main(String[] args) {
        try {
            //FileInputStream fis = new FileInputStream("lorem.txt");
            InputStream fis = System.in;
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            OutputStream fos = new FileOutputStream("lorem3.txt");
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            System.out.println();
            String linha = br.readLine();

            while (Objects.nonNull(linha) && !linha.isEmpty()) {
                bw.write(linha);
                bw.newLine();
                linha = br.readLine();
            }

            br.close();
            bw.close();

        }catch (Exception e) {
            System.out.println("Erro! Arquivo não encontrado: " + e.getMessage());
        }
    }
}