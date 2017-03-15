import java.util.*;
class Continent {

	ArrayList<String> countries = new ArrayList<String>();
	ArrayList<String> highArea = new ArrayList<>();
	ArrayList<Integer> highPoint = new ArrayList<>();
	ArrayList<String> lowArea = new ArrayList<>();
	ArrayList<Integer> lowPoint = new ArrayList<>();
	String continentName;

	Continent(String name) {
		continentName = name;
	}

	public void addCountry(String name) {
			countries.add(name);
			
	}

	public void addHighP(String name, int n) {
			highArea.add(name);
			highPoint.add(n);

			
	}

	public void addLowP(String name, int n) {
			lowArea.add(name);
			lowPoint.add(n);

			
	}

	public void printCountries() {
		
		for (int i = 0; i < countries.size(); i++) {
			System.out.print("Name: ");
			System.out.print(countries.get(i)+ "\n");
			System.out.print("Highest Point: " + "Name: " + highArea.get(i) + "\n");
			System.out.print("\tHeight: " + highPoint.get(i) + "\n");
			System.out.print("Lowest Point: " + "Name: " + lowArea.get(i) + "\n");
			System.out.print("\tHeight: " + lowPoint.get(i) + "\n");

		}

	}

	public String getHighest() {
		int max = 0;
		int counter = 0;

		for (int i = 0; i < countries.size(); i++) {
			if (highPoint.get(i) > max) {
				max = highPoint.get(i);
				counter = i;
			}
			
		}

		return ("The country with the highest point is " + countries.get(counter) + " with a height of " + max);

	}

}