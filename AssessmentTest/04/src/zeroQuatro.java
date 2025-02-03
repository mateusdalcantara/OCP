import java.util.Collection;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class zeroQuatro {
    public static void main(String[] args) {

        // O qual é a saída desse código?

        Predicate<String> empty = String::isEmpty;

        Predicate<String> notEmpty = empty.negate();



        // Cria várias strings vazias
        var result = Stream.generate(() -> "")
                .filter(notEmpty) // Deleta as strings vazias criadas
                .collect(Collectors.groupingBy(k -> k))
                .entrySet() // Retorna um conjunto de chave-valor
                .stream() // Fluxo de entradas de mapa
                .map(Map.Entry::getValue) // Pegar todos os valores de entrada
                .flatMap(Collection::stream) // Compactar coleções de dados
                .collect(Collectors.partitioningBy(notEmpty)); // Divide o fluxo em elementos vazios e não vazios



        System.out.println(result); //não aparece nada por conta do filter,
        // mas internamente é {true=[], false=[]} e não termina de executar.

        // flatMap ele junta os dados se tiver uma lista com cada nome ele
        // pode ser utilizado para transformar em uma lista
    }

}
