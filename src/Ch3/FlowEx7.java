package Ch3;

import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args) {
        System.out.print("당신의 주민번호를 입력하세요.");

        Scanner sc = new Scanner(System.in);
        String regNo = sc.nextLine();

        char gender = regNo.charAt(7);

        switch (gender) {
            case '1': case '3':
                System.out.println("당신은 남자입니다.");
                break;

            case '2': case '4':
                System.out.println("당신의 여자입니다.");
                break;
            default:
                System.out.println("유효하지 않은 주민번호입니다.");
        }
    }
}