package MiniProjekatTicTacToeAndConectFour;

import java.util.Scanner;

public class TicTacToe {
	// metoda koja prikazuje trenutno stanje u tabeli iksoks
	public static void ispis(int red, int kolona, String unos, String polja[][]) {
		System.out.println("-------");
		for (int i = 0; i < polja.length; i++) {
			System.out.print("|");
			for (int j = 0; j < polja.length; j++) {
				if (red == i && kolona == j) {

					polja[i][j] = unos;
				}
				System.out.print(polja[i][j]);
				System.out.print("|");
			}
			System.out.println();
			System.out.println("-------");
		}
	}

	// overload metoda skoja ce samo na pocetku prikazati izgled iksoksa
	public static void ispis() {
		String[][] polja = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };
		System.out.println("-------");
		for (int i = 0; i < polja.length; i++) {
			System.out.print("|");
			for (int j = 0; j < polja.length; j++) {

				System.out.print(polja[i][j]);
				System.out.print("|");
			}
			System.out.println();
			System.out.println("-------");
		}
	}

	// provjerava da li je iko pobijedio
	public static boolean provjera(String[][] polja) {
		// igrac X
		if (polja[0][0].equals("X") && polja[1][1].equals("X") && polja[2][2].equals("X")) {
			System.out.println("Igraè X je pobijedio!");
			return true;
		} else if (polja[0][2].equals("X") && polja[1][1].equals("X") && polja[2][0].equals("X")) {
			System.out.println("Igraè X je pobijedio!");
			return true;
		} else if (polja[0][0].equals("X") && polja[1][0].equals("X") && polja[2][0].equals("X")) {
			System.out.println("Igraè X je pobijedio!");
			return true;
		} else if (polja[0][1].equals("X") && polja[1][1].equals("X") && polja[2][1].equals("X")) {
			System.out.println("Igraè X je pobijedio!");
			return true;
		} else if (polja[0][2].equals("X") && polja[1][2].equals("X") && polja[2][2].equals("X")) {
			System.out.println("Igraè X je pobijedio!");
			return true;
		} else if (polja[0][0].equals("X") && polja[0][1].equals("X") && polja[0][2].equals("X")) {
			System.out.println("Igraè X je pobijedio!");
			return true;
		} else if (polja[1][0].equals("X") && polja[1][1].equals("X") && polja[1][2].equals("X")) {
			System.out.println("Igraè X je pobijedio!");
			return true;
		} else if (polja[2][0].equals("X") && polja[2][1].equals("X") && polja[2][2].equals("X")) {
			System.out.println("Igraè X je pobijedio!");
			return true;
			// igrac O
		} else if (polja[0][0].equals("O") && polja[1][1].equals("O") && polja[2][2].equals("O")) {
			System.out.println("Igraè O je pobijedio!");
			return true;
		} else if (polja[0][2].equals("O") && polja[1][1].equals("O") && polja[2][0].equals("O")) {
			System.out.println("Igraè O je pobijedio!");
			return true;
		} else if (polja[0][0].equals("O") && polja[1][0].equals("O") && polja[2][0].equals("O")) {
			System.out.println("Igraè O je pobijedio!");
			return true;
		} else if (polja[0][1].equals("O") && polja[1][1].equals("O") && polja[2][1].equals("O")) {
			System.out.println("Igraè O je pobijedio!");
			return true;
		} else if (polja[0][2].equals("O") && polja[1][2].equals("O") && polja[2][2].equals("O")) {
			System.out.println("Igraè O je pobijedio!");
			return true;
		} else if (polja[0][0].equals("O") && polja[0][1].equals("O") && polja[0][2].equals("O")) {
			System.out.println("Igraè O je pobijedio!");
			return true;
		} else if (polja[1][0].equals("O") && polja[1][1].equals("O") && polja[1][2].equals("O")) {
			System.out.println("Igraè O je pobijedio!");
			return true;
		} else if (polja[2][0].equals("O") && polja[2][1].equals("O") && polja[2][2].equals("O")) {
			System.out.println("Igraè O je pobijedio!");
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		String[][] polja = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };
		Scanner input = new Scanner(System.in);
		boolean krajIgre = true;
		int potez = 0;
		int potez2 = 0;

		int brojac = 0;
		ispis();
		while (krajIgre) {

			// player X

			if (potez != 0 && potez2 != 0) {

			} else {
				potez++;
				int red;
				while (true) {
					try {
						System.out.println("Unesite red(0, 1 ili 2) za igraca X: ");
						red = input.nextInt();
						while (red < 0 || red > 2) {
							System.out.println(
									"Pogresan unos.Red ne moze biti manji od 0 ili veci od 2.Unesite 0, 1 ili 2");
							red = input.nextInt();
						}
						break;
					} catch (Exception e) {
						System.out.println("Pogesan unos.Pokusajte ponovo");
						input.nextLine();
					}
				}
				int kolona;
				while (true) {
					try {
						System.out.println("Unesite kolonu(0, 1 ili 2 za igraca X:");
						kolona = input.nextInt();
						while (kolona < 0 || kolona > 2) {
							System.out.println(
									"Pogresan unos.Kolona ne moze biti manji od 0 ili veci od 2.Unesite 0, 1 ili 2");
							kolona = input.nextInt();
						}
						break;
					} catch (Exception e) {
						System.out.println("Pogesan unos.Pokusajte ponovo");
						input.nextLine();
					}
				}
				for (int i = 0; i < polja.length; i++) {
					for (int j = 0; j < polja.length; j++) {
						if (red == i && kolona == j) {
							if (polja[i][j].equals("O") || polja[i][j].equals("X")) {
								System.out.println("To polje je zauzeto!");
								potez = 0;
								potez2 = 0;
							} else {
								polja[i][j] = "X";
								ispis(red, kolona, "X", polja);
								potez = 2;
								potez2 = 2;
								brojac++;
							}
						}
					}
				}
				if (provjera(polja) == true || brojac == 9) {
					if (brojac == 9) {
						System.out.println("Nerijeseno je!");
						krajIgre = false;
						break;
					} else {
						krajIgre = false;
						System.out.println("-------");
						for (int i = 0; i < polja.length; i++) {
							System.out.print("|");
							for (int j = 0; j < polja.length; j++) {

								System.out.print(polja[i][j]);
								System.out.print("|");
							}
							System.out.println();
							System.out.println("-------");
						}
						break;
					}

				}
			}
			potez2++;
			// player O
			if (potez != 2 && potez2 != 2) {

			} else {
				int red1;
				while (true) {
					try {
						System.out.println("Unesite red(0, 1 ili 2) za igraca O: ");
						red1 = input.nextInt();
						while (red1 < 0 || red1 > 2) {
							System.out.println(
									"Pogresan unos.Red ne moze biti manji od 0 ili veci od 2.Unesite 0, 1 ili 2");
							red1 = input.nextInt();
						}
						break;
					} catch (Exception e) {
						System.out.println("Pogesan unos.Pokusajte ponovo");
						input.nextLine();
					}
				}
				int kolona1;
				while (true) {
					try {
						System.out.println("Unesite kolonu(0, 1 ili 2 za igraca O:");
						kolona1 = input.nextInt();
						while (kolona1 < 0 || kolona1 > 2) {
							System.out.println(
									"Pogresan unos.Kolona ne moze biti manji od 0 ili veci od 2.Unesite 0, 1 ili 2");
							kolona1 = input.nextInt();
						}
						break;
					} catch (Exception e) {
						System.out.println("Pogesan unos.Pokusajte ponovo");
						input.nextLine();
					}
				}
				for (int i = 0; i < polja.length; i++) {
					for (int j = 0; j < polja.length; j++) {
						if (i == red1 && j == kolona1) {
							if (polja[i][j].equals("O") || polja[i][j].equals("X")) {
								System.out.println("To polje je zauzeto!");
								potez2 = 1;
								potez = 1;
							} else {
								polja[i][j] = "O";
								ispis(red1, kolona1, "O", polja);
								potez2++;
								potez = 0;
								brojac++;
							}

						}
					}
				}
				if (provjera(polja) == true || brojac == 9) {
					if (brojac == 9) {
						System.out.println("Nerijeseno je!");
						krajIgre = false;
						break;
					} else {
						krajIgre = false;
						System.out.println("-------");
						for (int i = 0; i < polja.length; i++) {
							System.out.print("|");
							for (int j = 0; j < polja.length; j++) {

								System.out.print(polja[i][j]);
								System.out.print("|");
							}
							System.out.println();
							System.out.println("-------");
						}
						break;
					}

				}
			}

		}

	}

}
