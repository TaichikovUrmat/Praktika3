import java.util.Scanner;

public class Seasons {

    int month;

    public Seasons(int month) {
        this.month = month;

    }
    public Seasons(){

    }

    public int Seasons() {
    Scanner scanner = new Scanner(System.in);
    int month = scanner.nextInt();
            switch (month) {
                case 1, 2, 12:
                    System.out.println("Кыш");
                    break;
                case 3, 4, 5:
                    System.out.println("Жаз");
                    break;
                case 6, 7, 8:
                    System.out.println("Жай");
                    break;
                case 9, 10, 11:
                    System.out.println("Куз");
                    break;
                default:
                    System.out.println("invalit");

            }
            return 0;
        }
    }
