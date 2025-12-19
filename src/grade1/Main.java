package grade1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("프로그램을 시작합니다.");

        while (true) {

            System.out.println("성적을 입력하세요. :");

            String input = sc.next();

            String GradeName = input.toUpperCase();
            if (!isValidgrade(GradeName)) {
                System.out.println("잘못된 입력입니다!");
                continue;
            }

            switch (GradeName) {
                case "A":
                    System.out.println("90 ~ 100");
                    break;
                case "B":
                    System.out.println("80 ~ 89");
                    break;
                case "C":
                    System.out.println("70 ~ 79");
                    break;
                case "D":
                    System.out.println("60 ~ 69");
                    break;
                case "F":
                    System.out.println("0 ~ 59");
                    break;
            }
            break;
        }
        sc.close();
    }

    public static boolean isValidgrade(String GradeName) {
        return GradeName.equals("A") ||
                GradeName.equals("B") ||
                GradeName.equals("C") ||
                GradeName.equals("D") ||
                GradeName.equals("F");
    }
}
