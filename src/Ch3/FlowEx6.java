package Ch3;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");

        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int com = (int)(Math.random() * 3) + 1; // 1, 2, 3중 하나가 com에 저장됨

        System.out.println("당신은 " + user + "입니다.");
        System.out.println("당신은 " + com + "입니다.");

        switch (user-com) {
            case 2: case -1:
                System.out.println("당신이 졌습니다.");
                break;
            case 1: case -2:
                System.out.println("당신이 이겼습니다.");
                break;
            case 0:
                System.out.println("비겼습니다.");
//                break; 마지막 문자이므로 break를 사용할 필요가 없다.
        }
    }
}