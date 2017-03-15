import java.util.*;
class Country {
		private String countryName;
		private String highestPoint;
		private String lowestPoint;
		private int highestPointN;
		private int lowestPointN;

		Country(String _name) {
			countryName = _name;
		}


		public void setHighest(String highPName, int highPH) {
			HighestPoint highest = new HighestPoint(highPName, highPH);

			highestPoint = highPName;
			highestPointN = highPH;
		}

		public void setLowest(String lowPName, int lowPH) {
			LowestPoint lowest = new LowestPoint(lowPName, lowPH);

			lowestPoint = lowPName;
			lowestPointN = lowPH;
		}




		public String getCountryName() {
			return countryName;
		}

		public String getHighestPoint() {
			return highestPoint;
		}

		public String getLowestPoint() {
			return lowestPoint;
		}

		public int getLowestPointN() {
			return lowestPointN;
		}

		public int getHighestPointN() {
			return highestPointN;
		}

		@Override
		public String toString() {
			return("Name " + countryName);
		}

		public void High() {
			System.out.println("Name " + highestPoint);
			System.out.println("Highest Point: " + highestPointN + "\n");
		}

		public void Low() {
			System.out.println("Name " + lowestPoint);
			System.out.println("Lowest Point " + lowestPointN + "\n");
		}


	}