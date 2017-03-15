import java.util.*;
class LowestPoint {
		private String lowPName;
		private int lowPH;

		LowestPoint(String name, int height) {
			lowPName = name;
			lowPH = height;
		}

		public String getlowPName() {
			return lowPName;
		}

		public int getlowPH() {
			return lowPH;
		}

		@Override
		public String toString() {
			return(lowPName + " " + lowPH + "m");
		}

	}