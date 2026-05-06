package method;
import java.util.Scanner;

public class Methodproblem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int totalCharge = 0;
        while (result < 4){
            firstPrint();
            System.out.print("선택: ");
            int num = scanner.nextInt();
            totalCharge= input(totalCharge,num);
            result = num;

        }
    }

    public static void firstPrint() {
        System.out.println("-----------------------------------");
        System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4. 종료");
        System.out.println("-----------------------------------");
    }

    public static int input(int totalCharge,int num) {
        Scanner scanner = new Scanner(System.in);
        if (num == 1) {
            System.out.print("입금액을 입력하세요 :");
            int charge = scanner.nextInt();
            totalCharge = totalCharge + charge;
            System.out.println(charge +"원을 입금하였습니다 현재 잔액: "+ totalCharge);
        }
        else if (num == 2) {
            System.out.print("출금액을 입력하세요 :");
            int charge = scanner.nextInt();
            totalCharge = totalCharge - charge;
            System.out.println(charge +"원을 출금하였습니다. 현재 잔액: "+ totalCharge);
        }
        else if (num == 3) {
            System.out.println("현재 잔액:" + totalCharge);
        }
        else if (num == 4) {
            return num;
        }

        return totalCharge;
    }

}
