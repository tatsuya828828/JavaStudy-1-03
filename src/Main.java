import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int weight = 60;
		int age1 = 40;
		int age2 = 30;
		int age = 33;
		String name = "湊";

		if(weight == 60 && (age1 + age2 >= 60) && (age%2 == 1) && name.equals("湊")) {
			System.out.println("正解です");
		}


		int isHungry = 1;
		String food = "すし";
		System.out.println("こんにちは");
		if(isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("お腹がペコペコです");
			System.out.println(food +"をいただきます");
		}
		System.out.println("ごちそうさまでした");


		System.out.println("1: 検索 2:登録 3:削除 4:変更");
		System.out.print("数字を入力してください: ");
		int selected = new Scanner(System.in).nextInt();
		switch(selected) {
			case 1:
				System.out.println("検索します");
				break;
			case 2:
				System.out.println("登録します");
				break;
			case 3:
				System.out.println("削除します");
				break;
			case 4:
				System.out.println("変更します");
				break;
		}


		System.out.println("[数当てゲーム]");
		int ans = new Random().nextInt(10);
		System.out.println("0~9の数字を入力してください(5回挑戦可能です)");
		for(int i=0; i<5; i++) {
			System.out.println((i+1) +"回目の挑戦");
			int num = new Scanner(System.in).nextInt();
			if(ans == num) {
				System.out.println("あたりです！");
				break;
			} else if(ans+1 == num || ans-1 == num) {
				System.out.println("惜しい！");
			}
			if(i == 4) {
				System.out.println("残念、挑戦失敗です...");
			}
		}
		System.out.println("終了します");
	}
}
