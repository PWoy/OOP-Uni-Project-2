import java.util.*;

public class Countries {
	public static void main(String[] args) {

		Continent europe = new Continent("Europe");
		Country france = new Country("France");
		france.setHighest("Mont Blanc", 4810);
		france.setLowest("Etang de Lavalduc", -10);
		
		Country uk = new Country("UK");
		uk.setHighest("Ben Nevis", 1344);
		uk.setLowest("The Fens", -4);

		europe.addCountry(france.getCountryName());
		europe.addHighP(france.getHighestPoint(), france.getHighestPointN());
		europe.addLowP(france.getLowestPoint(), france.getHighestPointN());

		europe.addCountry(uk.getCountryName());
		europe.addHighP(uk.getHighestPoint(), uk.getHighestPointN());
		europe.addLowP(uk.getLowestPoint(), uk.getHighestPointN());





		europe.printCountries();
		System.out.println(europe.getHighest());
	}
}