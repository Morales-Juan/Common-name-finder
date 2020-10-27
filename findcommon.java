import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author juanjosemorales
 *
 */

public class Finder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner kbd = null;
		
		try {
			kbd = new Scanner(new File("boynames.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			HashSet list = new HashSet();
		
			ArrayList matchNames = new ArrayList();
		
		int commonNames = 0;
		int sumboys = 0;
		int sumgirls = 0;
		
		while (kbd.hasNextLine()) {
			
				String names = kbd.next();
			
				int nextInt = kbd.nextInt();
			
				sumboys = sumboys + nextInt; //count number of boys
			
				list.add(names); //add all boys names to hash set
		}
		
		try {
			kbd = new Scanner(new File("girlnames.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (kbd.hasNextLine()) {
			
				String names = kbd.next();
			
				int nextInt = kbd.nextInt();
			
				sumgirls = sumgirls + nextInt; // count number of girls
		
				if (!list.add(names)) { //if add method returns false add name to array of common names
					matchNames.add(names);
					commonNames++;               //count names added to common names list
				}
		}
		
		System.out.println("Amount of common names:" + commonNames);
		System.out.println("Common names:" + matchNames);
		System.out.println("Number of boys recorded in the census:" + sumboys);
		System.out.println("Number of girls recorded in the census:" + sumgirls);
		
	}

}
