package grade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        System.out.println("프로그램을 시작합니다.");

        // 올바른 성적이 입력될 때까지 반복
        while (true) {

            // 성적 입력 안내 메시지 출력
            System.out.println("성적을 입력하세요. :");

            // 사용자로부터 성적 입력 받기
            String input = sc.next();

            // 입력받은 값을 모두 대문자로 변환
            // 숫자, 기호는 그대로 유지됨
            String GradeName = input.toUpperCase();

            // 유효한 성적(A/B/C/D/F)인지 검사
            if (!isValidgrade(GradeName)) {
                // 유효하지 않은 값이면 오류 메시지 출력
                System.out.println("잘못된 입력입니다!");
                // 다시 입력받기 위해 반복문의 처음으로 이동
                continue;
            }

            // 유효한 성적이면 Grade 객체 생성
            Grade grade = new Grade(GradeName);

            // 성적에 해당되는 점수 범위 출력
            grade.printGradeRange();
            // 정상 처리 후 반복문 종료
            break;
        }
        // Scanner 지원 해제
        sc.close();
    }

    // 성적이 A/B/C/D/F 중 하나인지 검사하는 메서드
    private static boolean isValidgrade(String GradeName) {
        return GradeName.equals("A") ||
               GradeName.equals("B") ||
               GradeName.equals("C") ||
               GradeName.equals("D") ||
               GradeName.equals("F");
    }
}
