import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class bj2750_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			int num2 = scan.nextInt();
			if (!list.contains(num2)) {
				list.add(num2);
			}

		}

		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i) + "\n");
		}

		System.out.println(sb);

	}
}
