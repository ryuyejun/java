package method;

public class MethodProblem3 {
    public static void main(String[] args) {
        int balance = 10000;
        balance = input(balance,1000);
        balance = output(balance,100);
    }

    public static int input(int balance, int charge) {
        balance += charge;
        System.out.println(balance);
        return balance;
    }

    public static int output(int balance, int charge) {
        if (balance < charge) {
            System.out.println(charge + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        else {
            balance -= charge;
            System.out.println(charge + "원을 출금하였습니다 현재 잔액: " + balance);
        }
        return balance;

    }


}
