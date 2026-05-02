import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int count = 0;

        for (char ch : text.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }

        System.out.println("Vowels: " + count);

        sc.close();
    }
}
