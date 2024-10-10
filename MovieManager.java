package MMS;

import java.util.ArrayList;
import java.util.HashMap;

public class MovieManager {

	private ArrayList<Movie> movies;
	private ArrayList<Booking> bookings;

	private HashMap<String, Movie> mapMovie;

	 public MovieManager() {
	        movies = new ArrayList<>(); // Initialize the movies list
	        bookings = new ArrayList<>(); // Initialize the bookings list
	        mapMovie = new HashMap<>(); // Initialize the movie map
	    }

	public void addMovie(Movie movie)

	{
		movies.add(movie);
		mapMovie.put(movie.getMovieId(), movie);
		System.out.println("Movie added Sucessfully" + movie.getTitle());

	}

	public void updateMovie(String movieId, Movie updateMovie) {
		if (mapMovie.containsKey(movieId)) {

			movies.remove(mapMovie.get(movieId));
			movies.add(updateMovie);
			mapMovie.put(movieId, updateMovie);
			System.out.println("Movie updated " + updateMovie.getMovieId());

		}
		else {

			System.out.println("Movie not found");
		}

	}
	
	public void deleteMovie(String movieId)
	{
		
		if(movies.contains(movieId))
		{
			Movie movie = mapMovie.remove(movieId);
			movies.remove(movie);
			System.out.println("Movie delete successfully"+ movieId);
			
		}
		else {
			
			System.out.println("Movie not found");
		}
	}
		
		public Movie searchMovie(String title)
		{
			for(Movie movie : movies) {
				if(movie.getTitle().equalsIgnoreCase(title)){
					return movie;
				}
				
			}
			System.out.println("Movie not found");
			return null;
			
		}
		
		public void bookTickit(String movieId) {
		    if (mapMovie.containsKey(movieId)) {
		        Movie movie = mapMovie.get(movieId); 
		        if (movie.getAvailableSeats() > 0) { 
		            movie.setAvailableSeats(movie.getAvailableSeats() - 1); 
		            bookings.add(new Booking( movieId)); 
		            System.out.println("Ticket booked for " + movie.getTitle()); 
		        } else {
		            System.out.println("No available seats for movie: " + movie.getTitle()); 
		        }
		    } else {
		        System.out.println("Movie not found for booking!"); 
		    }
		}

		
		public void displayAllMovies()
		{
			System.out.println("These Movies are available");
			for(Movie movie: movies)
			{
				System.out.println(movie);
				
			}
			
		}
		
		
		public void displayAllBooking()

		
		{
			System.out.println("Bookings");
			
			for(Booking booking: bookings)
			{
				System.out.println(booking);
			}
			
		}
}


