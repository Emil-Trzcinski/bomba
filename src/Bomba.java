import java.util.Scanner;

public class Bomba {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj czas odliczania:");
        int odliczanie = scanner.nextInt();


         for(int i = odliczanie; odliczanie > 0;  odliczanie--)
        {
            if (odliczanie%2==0)
            {
                System.out.println(odliczanie);
            }
        }

        System.out.println("Ka Boom");
    }
}

