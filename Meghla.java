import java.util.Scanner;

public class Meghla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p1, p2, cs1 = 0, cs2 = 0;
        int winner = 0, maxLead = 0;

        while (n-- > 0) {
            p1 = sc.nextInt();
            p2 = sc.nextInt();
            cs1 += p1;
            cs2 += p2;

            int lead = Math.abs(cs1 - cs2);
            if (lead > maxLead) {
                maxLead = lead;
                winner = (cs1 > cs2) ? 1 : 2;
            }
        }

        System.out.println(winner + " " + maxLead);
        sc.close();
    }
}
