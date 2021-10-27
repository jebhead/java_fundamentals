package labs_examples.lambdas.labs;

import javax.swing.tree.DefaultTreeCellEditor;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.nio.file.Paths;

public class Stream_X4 {


    private static Stream<String> stringStream;

    public static void main(String[] args) throws IOException {

        IntStream.range(1,16).forEach(System.out :: print);
        System.out.println();

        System.out.println(IntStream.range(1, 13).count());

        System.out.println(IntStream.range(1,7).map(x -> x+7).sum());

        System.out.println(Arrays.stream(new int[]{2, 5, 7, 23, 54, 32, 6, 15, 45})
                .map(x -> x - 3)
                .filter(x -> x > 10)
                .average());

        String bandsFile = "src/labs_examples/lambdas/examples/stream_api/example_files/bands.txt";

        Stream<String> bands = Files.lines(Paths.get(bandsFile));

        bands
                .filter(x -> x.length() < 7)
                .sorted()
                .forEach(System.out::println);

        bands.close();

        String dataFile = "src/labs_examples/lambdas/examples/stream_api/example_files/data.txt";

        Stream<String> data = Files.lines(Paths.get(dataFile));

        System.out.println(data
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count());

        data.close();

        String dataFile1 = "src/labs_examples/lambdas/examples/stream_api/example_files/data.txt";

        Stream<String> data1 = Files.lines(Paths.get(dataFile));

        data1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));

        data1.close();

        String bandsFile2 = "src/labs_examples/lambdas/examples/stream_api/example_files/bands.txt";

        Stream<String> bands2 = Files.lines(Paths.get(bandsFile));

        bands2
                .filter(x -> x.contains("on"))
                .collect(Collectors.toList())
                .forEach(x -> System.out.println(x));


    }
}
