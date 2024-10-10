package MMS;

public class Booking {

	

	private String movieId;
	
	public Booking( String movieId) {
		super();
	
		this.movieId = movieId;
	}

	

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}



	@Override
	public String toString() {
		return "Booking [movieId=" + movieId + "]";
	}
	
	
	
}
