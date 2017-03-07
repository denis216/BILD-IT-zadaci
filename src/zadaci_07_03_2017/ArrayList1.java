package zadaci_07_03_2017;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		while(true){
		try{
		System.out.println("Enter integers (input ends with (0) ): ");
		int in = input.nextInt();
		while (in != 0) {
			list.add(in);
			in = input.nextInt();
		}
		System.out.println("Maximum value in a list is: " + max(list));
		}catch(Exception e){
			System.out.println("Wrong input.Please try again");
			input.nextLine();
		}
		}

	}
	public static Integer max(ArrayList<Integer> list){
		if (list == null || list.size() == 0)
			return null;
		int max = 0;
		for(int i = 0;i<list.size();i++){
			if(list.get(i)>max){
				max = list.get(i);
			}
		}
		return max;
		
	}

}
