package spellItOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Spell it out main class
 * @author jerill
 *
 */
public class Main {

	public static void main(String[] args) {

		while (true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a number to spell it out :");

			try {
				long i = Long.parseLong(br.readLine());

				System.out.println( SpellItOut.convert(i));

			} catch (NumberFormatException nfe) {
				System.err.println("Invalid Format!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}