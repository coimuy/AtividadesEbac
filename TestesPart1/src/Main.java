import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> pessoas = new ArrayList<>();

        System.out.println("Digite o nome e o gênero da pessoa (separados por vírgula) ou 'sair' para finalizar:");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("sair")) {
                break;
            }
            pessoas.add(input);
        }

        List<String> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.split(",")[1].trim().equalsIgnoreCase("F"))
                .collect(Collectors.toList());

        System.out.println("\nLista de Pessoas:");
        pessoas.forEach(System.out::println);

        System.out.println("\nLista de Mulheres:");
        mulheres.forEach(System.out::println);

        testMulheresLista(mulheres);

        scanner.close();
    }

    @Test
    public static void testMulheresLista(List<String> mulheres) {
        assertTrue(mulheres.stream().allMatch(pessoa -> pessoa.split(",")[0].trim().endsWith("a")));
    }
}
