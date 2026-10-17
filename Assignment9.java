/**
 * Name:
 * Date:
 */
public class Assignment9 {

    public static void main(String[] args) {
        MovieTracker tracker = new MovieTracker();

        // Create a few movies
        Movie inception = new Movie("Inception", 148, 2010, "PG-13");
        Movie up = new Movie("Up", 96,  2009, "PG");
        Movie jaws = new Movie("Jaws", 124, 1975, "PG");
        Movie matrix = new Movie("The Matrix", 136, 1999, "R");
        Movie frozen = new Movie("Frozen", 102, 2013, "PG");

        // Record which movies each user has watched
        tracker.addMovie("alice", inception);
        tracker.addMovie("alice", matrix);
        tracker.addMovie("alice", up);

        tracker.addMovie("bob", jaws);
        tracker.addMovie("bob", matrix);

        tracker.addMovie("jane", frozen);
        tracker.addMovie("jane", frozen);
        tracker.addMovie("jane", jaws);
        

        // getMovies returns the set of movies for one user
        System.out.println("=== getMovies ===");
        System.out.println("alice: " + tracker.getMovies("alice"));
        System.out.println("bob: " + tracker.getMovies("bob"));
        System.out.println("jane: " + tracker.getMovies("jane"));
        System.out.println("Alice has watched The Matrix: " + tracker.hasWatched("alice", matrix));
        System.out.println("Bob has watched The Matrix: " + tracker.hasWatched("bob", matrix));
        System.out.println("Jane has watched The Matrix: " + tracker.hasWatched("jane", matrix));
      
    }
}
