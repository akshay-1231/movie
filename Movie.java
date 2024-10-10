package MMS;

public class Movie {
	   
       static int id=100;
	   private String  movieId; 
	   private String title;
	    private String genre;
	    private int availableSeats;
	    private String director;
	    private int releaseYear;
	    private double rating; 
	    private String language; 
	    private String description;
	    
	    
	    
	    
	    
		public Movie( String title, String genre, int availableSeats, String director, int releaseYear,
				double rating, String language, String description) {
			super();
			this.movieId = "mid"+ ++id;
			this.title = title;
			this.genre = genre;
			this.availableSeats = availableSeats;
			this.director = director;
			this.releaseYear = releaseYear;
			this.rating = rating;
			this.language = language;
			this.description = description;
		}
		public static int getId() {
			return id;
		}
		public static void setId(int id) {
			Movie.id = id;
		}
		public String getMovieId() {
			return movieId;
		}
		public void setMovieId(String movieId) {
			this.movieId = movieId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public int getAvailableSeats() {
			return availableSeats;
		}
		public void setAvailableSeats(int availableSeats) {
			this.availableSeats = availableSeats;
		}
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		public int getReleaseYear() {
			return releaseYear;
		}
		public void setReleaseYear(int releaseYear) {
			this.releaseYear = releaseYear;
		}
		public double getRating() {
			return rating;
		}
		public void setRating(double rating) {
			this.rating = rating;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		@Override
		public String toString() {
			return "Movie [movieId=" + movieId + ", title=" + title + ", genre=" + genre + ", availableSeats="
					+ availableSeats + ", director=" + director + ", releaseYear=" + releaseYear + ", rating=" + rating
					+ ", language=" + language + ", description=" + description + "]";
		}
	    
	   
	    

}
