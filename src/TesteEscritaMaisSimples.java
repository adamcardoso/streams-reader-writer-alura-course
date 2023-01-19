import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaMaisSimples {
    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream("lorem5.txt");
            PrintWriter pw = new PrintWriter("lorem6.txt");

            ps.println("Testando a escrita com PrintStream");
            ps.println();

            pw.println("Testando a escrita com PrintWriter!");
            pw.println();

            ps.close();
            pw.close();
        }catch (Exception e) {
            System.out.println("Erro! Arquivo não encontrado: " + e.getMessage());
        }
    }
}
