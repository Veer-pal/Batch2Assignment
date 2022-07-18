package Veer;
import java.util.*;

public class ShuffleList {
	public static void main(String args[]) {
		int listSize, j, i = 0, l = 0;
		List<Integer> list1 = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the size of list: ");
		listSize = scanner.nextInt();

		do {
			System.out.println("Enter digits to ArrayList: ");
			Integer input = scanner.nextInt();
			list1.add(input);
			System.out.println(list1);

			l++;
		} while (l < listSize);

		System.out.println("The entered array list is: " + list1);
		j = listSize - 1;
		List<Integer> list2 = new ArrayList<>();
		for (int k = 0; k < listSize; k++) {
			if (j >= (listSize / 2)) {
				addToList(list2, list1.get(j));
				j--;
			}
			if (i < (listSize / 2)) {
				addToList(list2, list1.get(i));
				i++;

			}
			k++;
		}
		System.out.println("The list after Shuffle: " + list2);

		scanner.close();
	}

	private static void addToList(List<Integer> list1, Integer values) {
		list1.add(values);
	}

}