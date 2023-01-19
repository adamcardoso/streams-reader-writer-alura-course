import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.stream.Stream;

public class TesteLeitura {
    public static void main(String[] args) {
        // Fluxo de entrada com um arquivo
        try {
            FileInputStream fis = new FileInputStream("lorem.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String linha = br.readLine();
            System.out.println();

            
            while (Objects.nonNull(linha)) {
                System.out.println(linha);
                linha = br.readLine();
            }

            br.close();

        }catch (Exception e) {
            System.out.println("Erro! Arquivo não encontrado: " + e.getMessage());
        }
    }
}