import java.util.Scanner;

class CricketScore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalRuns = 0;

        for(int ball = 1; ball <= 6; ball++) {
            System.out.println("Enter runs scored on ball " + ball + ": ");
            int runs = sc.nextInt();

            totalRuns = totalRuns + runs;
        }

        System.out.println("Total Runs in Over: " + totalRuns);
    }
}