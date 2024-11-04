package actress;

public class Main {
	String name, country, last_movie;
	int movies, age;
	
	Main (String aname, String acountry, String l_movies, int aage, int amovie)
	{
		name = aname;
		country = acountry;
		last_movie = l_movies;
		movies = amovie;
		age = aage;
	}
			
	public static void main(String[] args) 
	{
		Main A = new Main ("Aishwarya Rai", "IND", "Panniyin Selan", 40, 50); 
		System.out.println("Name of the actress: " + A.name);
		System.out.println("Country: " + A.country);
		System.out.println("last movie name: " + A.last_movie);
		System.out.println("Age: " + A.age);
		System.out.println("Movies: " + A.movies);
	}

}
