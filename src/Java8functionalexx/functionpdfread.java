package Java8functionalexx;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.IOException;

public class functionpdfread {

    public static void main(String[] args) {

        String file = "C:\\Users\\rdamera\\OneDrive - Capgemini\\rohi\\ellipse\\pratice\\src\\Java8functionalexx\\examplefortxt";
        
        try {
            System.out.println("-----txtfile------");
            Files.lines(Paths.get(file)).forEach(System.out::println);

            System.out.println("---Filter only spring  -------");

            // Filter lines that contain "spring", sort them, and collect into a list
            List<String> result = Files.lines(Paths.get(file))
                                       .filter(n -> n.contains("spring"))
                                       .sorted()
                                       .collect(Collectors.toList());
          
            // Print the filtered and sorted result
            result.forEach(System.out::println);
            System.out.println("------splitting--------");
            System.out.println(result.stream().flatMap(n->Stream.of(n.split(""))).collect(Collectors.toList()));
            System.out.println("------counting --------");
            System.out.println(result.stream().map(n->n.length()).collect(Collectors.toList()));
            System.out.println("-------counting repeated -------");
            System.out.println(result.stream().collect(Collectors.groupingBy(n->n, Collectors.counting())));
            System.out.println("------counting all--------");
            System.out.println(result.stream().map(n->n.length()).count());
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
