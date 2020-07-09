
public class Main {
	public static void main(String[] args) {
		boolean hare = true;
		boolean ame = false;
		boolean tenki = ame;

		if(tenki == hare) {
			System.out.println("洗濯します");
			System.out.println("散歩をします");
		} else if(tenki == ame) {
			System.out.println("DVDを見ます");
		}
	}
}
