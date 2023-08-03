package Ch3;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        int input;

        System.out.print("숫자를 하나 입력하세요.>");

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
        /*
         * Integer.parseInt 메소드는 문자열을 기본형 정수(primitive type int)로 리턴한다.
         * try-catch 쓴다면 문자열이 유효한 숫자로 포함하지 않는다면 NumberFormatException 쓰로우된다.
         */
        input = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환

        if(input==0) {
            System.out.println("입력하신 숫자는 0입니다.");
        }

        if(input!=0)
            System.out.println("입력하신 숫자는 0이 아닙니다.");
        System.out.println("입력하신 숫자는 " + input + "입니다.");
    }
}