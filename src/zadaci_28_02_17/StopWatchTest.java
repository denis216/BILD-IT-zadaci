package zadaci_28_02_17;
import java.util.Arrays;

public class StopWatchTest {

	public static void main(String[] args) {
		int[] randomArr = new int[100000];
		// Pravimo niz od 100 000 i ubacujemo random brojeve u njega
		System.out.println("Kreiramo nesortiran niz od 100,000 brojeva......");
		for (int i = 0; i < randomArr.length; i++) {
			randomArr[i] = (int) (Math.random() * 100000);
		}

		StopWatch stopWatch = new StopWatch();
		System.out.println("Sortiranje niza koristeci Arrays.sort");
		//Ovaj Thread.sleap sam ubacio cisto da tebi bude preglednije.Nemoj mi uzeti za zlo :)
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stopWatch.start();
		Arrays.sort(randomArr);
		stopWatch.stop(); 
		//P.S Ensare kod mene zavrsi od 5 do 7 ms :D :P
		System.out.println("Potrebno vrijeme: " + stopWatch.getElapsedTime() + " milisekundi");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		for (int i = 0; i < randomArr.length; i++) {

			System.out.printf("%6d ", randomArr[i]);
			if ((i + 1) % 10 == 0)
				System.out.printf("\n");

		}

	}
}
