import java.util.ArrayList;
import java.util.Scanner;

public class MovieWatchlistAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> movies = new ArrayList<>();
    
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("add")) {
                System.out.println("Movie name, year, rating and genre: ");
                String movieInfo = scanner.nextLine();
                movies.add(movieInfo);
            }

            if (command.equals("list")) {
                printMovies(movies);
            }

            if (command.equals("search")) {
                System.out.println("Search word:");
                String word = scanner.nextLine();
                searchMovies(movies, word);
            }

            if (command.equals("best")) {
                printBestMovie(movies);
            }

            if (command.equals("average")) {
                printAverageRating(movies);
            }

            if (command.equals("genres")) {
                printGenres(movies);
            }
        }
    }

    public static void printMovies(ArrayList<String> movies) {
        
        for (String movie : movies ) {
            
            String[] parts = movie.split(",");
            String name = parts[0];
            int year = Integer.valueOf(parts[1]);
            double rating = Double.valueOf(parts[2]);
            int genre = Integer.valueOf(parts[3]);
            System.out.println(name + " (" + year + "), rating: " + rating + ", genre: " + genre);
        }
    }

    public static void searchMovies(ArrayList<String> movies, String word) {
        for (String movie : movies) {
            String[] parts = movie.split(",");

            String name = parts[0];
            int year = Integer.valueOf(parts[1]);
            int rating = Integer.valueOf(parts[2]);
            String genre = parts[3];

            if (name.toLowerCase().contains(word.toLowerCase())) {
                System.out.println(name + " (" + year + "), rating: " + rating + ", genre: " + genre);
            }
        }
    }

    public static void printBestMovie(ArrayList<String> movies) {

    }

    public static void printAverageRating(ArrayList<String> movies) {

    }

    public static void printGenres(ArrayList<String> movies) {

    }
}