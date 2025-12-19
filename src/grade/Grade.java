package grade;

public class Grade {

    // 속성
    // 성적 등급(A/B/C/D/F)을 지정하는 필드
    // Main 클래스에서 유효성 검사를 거친 값이 전달된다.
    private String grade;

    // 생성자
    // Grade 객체를 생성할 때 성적 등급을 받아 필드에 저장한다.
    public Grade(String grade) {
        this.grade = grade;
    }

    // 메서드
    // 성적 등급에 따라 점수 범위를 출력하는 메서드
    public void printGradeRange() {
        // garde 값에 따라 분기 처리
        switch (grade) {
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
            default:
                // 예상하지 못한 값이 들어온 경우
                System.out.println("잘못된 입력입니다!");
        }
    }
}
