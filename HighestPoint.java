import java.util.*;
class HighestPoint {
		private String highPName;
		private int highPH;

		HighestPoint(String name, int height) {
			highPName = name;
			highPH = height;

			if (height < 0) {
				System.out.println("Highest point can't be negative");
			}
		}

		public String getHighPName() {
			return highPName;
		}

		public int getHighPH() {
			return highPH;
		}

		@Override
		public String toString() {
			return(highPName + " " + highPH + "m");
		}
	}