package uebung_3_3;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double Alter = 19; // in Jahren
		double Körpergewicht = 55; // in kg
		double Körpergröße = 1.70; // in m
		double Geschlecht = 1; // weiblich = 0; männlich = 1

		double BMI = ((Körpergewicht) / (Körpergröße * Körpergröße));
		System.out.println("BMI = " + BMI);

		if (Alter < 24 && (Geschlecht == 1) && (BMI >= 20) && (BMI <= 25)) {
			System.out
					.println("Ihr BMI befindet sich im Bereich des Normalgewichts");
		} else if (Alter >= 25 && (Alter <= 34) && (Geschlecht == 1)
				&& (BMI >= 21) && (BMI <= 26)) {
			System.out
					.println("Ihr BMI befindet sich im Bereich des Normalgewichts");
		} else if (Alter >= 35 && (Alter <= 44) && (Geschlecht == 1)
				&& (BMI >= 22) && (BMI <= 27)) {
			System.out
					.println("Ihr BMI befindet sich im Bereich des Normalgewichts");
		} else if (Alter >= 45 && (Alter <= 54) && (Geschlecht == 1)
				&& (BMI >= 23) && (BMI <= 28)) {
			System.out
					.println("Ihr BMI befindet sich im Bereich des Normalgewichts");
		} else if (Alter >= 55 && (Alter <= 64) && (Geschlecht == 1)
				&& (BMI >= 24) && (BMI <= 29)) {
			System.out
					.println("Ihr BMI befindet sich im Bereich des Normalgewichts");
		} else if (Alter > 64 && (Geschlecht == 1) && (BMI >= 25)
				&& (BMI <= 30)) {
			System.out
					.println("Ihr BMI befindet sich im Bereich des Normalgewichts");
		} else {
			System.out
					.println("Ihr BMI befindet sich nicht im Bereich des Normalgewichts");
		}

		if (Alter < 24 && (Geschlecht == 0) && (BMI >= 19) && (BMI <= 24)) {
			System.out
					.println("Ihr BMI befindet sich im Bereich des Normalgewichts");
		} else if (Alter >= 25 && (Alter <= 34) && (Geschlecht == 0)
				&& (BMI >= 20) && (BMI <= 25)) {
			System.out
					.println("Ihr BMI befindet sich im Bereich des Normalgewichts");
		} else if (Alter >= 35 && (Alter <= 44) && (Geschlecht == 0)
				&& (BMI >= 21) && (BMI <= 26)) {
			System.out
					.println("Ihr BMI befindet sich im Bereich des Normalgewichts");
		} else if (Alter >= 45 && (Alter <= 54) && (Geschlecht == 0)
				&& (BMI >= 22) && (BMI <= 27)) {
			System.out
					.println("Ihr BMI befindet sich im Bereich des Normalgewichts");
		} else if (Alter >= 55 && (Alter <= 64) && (Geschlecht == 0)
				&& (BMI >= 23) && (BMI <= 28)) {
			System.out
					.println("Ihr BMI befindet sich im Bereich des Normalgewichts");
		} else if (Alter > 64 && (Geschlecht == 0) && (BMI >= 24)
				&& (BMI <= 29)) {
			System.out
					.println("Ihr BMI befindet sich im Bereich des Normalgewichts");
		} else {
			System.out
					.println("Ihr BMI befindet sich nicht im Bereich des Normalgewichts");
		}

	}

}
