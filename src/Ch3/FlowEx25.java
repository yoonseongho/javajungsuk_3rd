package Ch3;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("합계를 구할 숫자를 입력하세요.");

        while(flag) {
            System.out.print(">>");

            String tmp = sc.nextLine();
            num = Integer.parseInt(tmp);

            if(num!=0) {
                sum += num;
            } else {
                flag = false;
            }
        }
        System.out.println("합계:" + sum);
    }
}