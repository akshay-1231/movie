package MMS;

import java.util.Scanner;

public class TestMovies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		MovieManager mms= new MovieManager();
		String ch;
		
		
		do {
		System.out.println("***************Welcome to 420 Cinema House*************");
		System.out.println("1. Add Movie");
        System.out.println("2. Update Movie");
        System.out.println("3. Delete Movie");
        System.out.println("4. Search Movie");
        System.out.println("5. Book Ticket");
        System.out.println("6. Display Movies");
        System.out.println("7. Display Bookings");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();
        
        switch(choice)
        {
        
        case 1:
        
            System.out.print("Enter movie title: ");
            String title = sc.next();
            System.out.print("Enter movie genre: ");
            String genre = sc.next();
            System.out.print("Enter available seats: ");
            int availableSeats = sc.nextInt();
            System.out.print("Enter director: ");
            String director = sc.next();
            System.out.print("Enter release year: ");
            int releaseYear = sc.nextInt();
            System.out.print("Enter rating: ");
            double rating = sc.nextDouble();
            System.out.print("Enter language: ");
            String language = sc.next();
            System.out.print("Enter description: ");
            String description = sc.next();
            
           Movie movie = new Movie( title, genre, availableSeats, director, releaseYear, rating, language, description);
           mms.addMovie(movie);
          break;
          
        
        case 2:
        	 System.out.print("Enter movie ID to update: ");
             String updateMovieId = sc.next();
             
             System.out.print("Enter new movie title: ");
             String newTitle = sc.next();
             System.out.print("Enter new genre: ");
             String newGenre = sc.next();
             System.out.print("Enter new available seats: ");
             int newAvailableSeats = sc.nextInt();
             System.out.print("Enter new director: ");
             String newDirector = sc.next();
             System.out.print("Enter new release year: ");
             int newReleaseYear = sc.nextInt();
             System.out.print("Enter new rating: ");
             double newRating = sc.nextDouble();
             System.out.print("Enter new language: ");
             String newLanguage = sc.next();
             System.out.print("Enter new description: ");
             String newDescription = sc.next();
             
             Movie movie1 = new Movie(newTitle, newGenre, newAvailableSeats, newDirector, newReleaseYear, newRating, newLanguage, newDescription);
              mms.updateMovie(updateMovieId, movie1);
              
              break;
              
        case 3:
        	
        	System.out.print("Enter movie ID to delete: ");
            String deleteMovieId = sc.next();
            
            mms.deleteMovie(deleteMovieId);
            break;
            
        case 4:
        	   System.out.print("Enter movie title to search: ");
               String searchTitle = sc.next();
               
               Movie fmovie = mms.searchMovie(searchTitle);
               if(fmovie !=null)
               {
            	   
            	   System.out.println("Movie found"+fmovie);
               }
               else 
               {
            	   System.out.println("Sorry Movie is not found");
               
               }
               
              break;
              
        case 5:
        
            
            System.out.print("Enter movie title to book: ");
            String bookMovietitle= sc.next();
            
            mms.bookTickit(bookMovietitle);
            break;
            
        case 6:
        	
        	mms.displayAllMovies();
        	break;
            
        case 7:
        	mms.displayAllBooking();
        	
        	break;
        	
        case 0: 
            System.out.println("Exiting...");
            break;
            
        default: {
            System.out.println("Invalid choice, please try again.");
            break;
  
        }
		}
        System.out.println("Do you want to continue? (Yes or No)");
       ch = sc.next();
		}
        while(ch.equalsIgnoreCase(ch));
        System.out.println("********* Have A Good Day ***********");

		
	}
}
