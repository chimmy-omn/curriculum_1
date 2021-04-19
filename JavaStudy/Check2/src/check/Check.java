package check;

import constants.Constants;

public class Check {

	private static String firstName = "Kudou";
	private static String lastName = "Manaka";

	public static void main(String[] args) {

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);

		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);

		System.out.print("printNameメソッド → ");
		printName(firstName, lastName);

		pet.introduce();
		rp.introduce();
	}

	private static void printName(String firstName, String lastName) {

		System.out.println(firstName + lastName);

	}

}
