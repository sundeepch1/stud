package basic.programs.stream;

import javax.script.ScriptException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String... strings) throws ScriptException {
        final Collection<Streams.Task> tasks = Arrays.asList(
                new Streams.Task( Streams.Status.OPEN, 5 ),
                new Streams.Task( Streams.Status.OPEN, 13 ),
                new Streams.Task( Streams.Status.CLOSED, 8 )
        );

        final double totalPoints = tasks
                .stream()
                .parallel()
                .map( task -> task.getPoints() ) // or map( Task::getPoints )
                .reduce( 0, Integer::sum );

        final Collection< String > result = tasks
                .stream()
                .mapToInt( Streams.Task::getPoints )
                //.asLongStream()
                .mapToDouble( points -> points / totalPoints )
                //.boxed()
                .mapToLong( weight -> ( long )( weight * 100 ) )
                .mapToObj( percentage -> percentage + "%" )
                .collect( Collectors.toList() );

        System.out.println( result );

        final Map<Streams.Status, List<Streams.Task>> map = tasks
                .stream()
                .collect( Collectors.groupingBy( Streams.Task::getStatus ) );
        System.out.println( map );

        final String text = "Base64 finally in Java 8!";
        final String encoded = Base64
                .getEncoder()
                .encodeToString( text.getBytes( StandardCharsets.UTF_8 ) );
        System.out.println( encoded );
        final String decoded = new String(
                Base64.getDecoder().decode( encoded ),
                StandardCharsets.UTF_8 );
        System.out.println( decoded );
    }
}
