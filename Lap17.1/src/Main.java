public class Main {
    public static void main(String[] args) {
        final BankAccount account = new BankAccount(1000.00,"12345-678" );
        double a = 0;
        Thread trThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // deposit & withdraw
                double newDeposit = 300;
                double newWithdraw = 50;
                account.deposit(newDeposit);
                account.withdraw(newWithdraw);
                System.out.println("deposit: " + newDeposit);
                System.out.println("withdraw: " + newWithdraw);
            }
        });
        trThread1.start();
        Thread trThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // deposit & withdraw
                double newDeposit = 203.75;
                double newWithdraw = 100;
                account.deposit(newDeposit);
                account.withdraw(newWithdraw);
                System.out.println("deposit: " + newDeposit);
                System.out.println("withdraw: " + newWithdraw);
            }
        });
        trThread2.start();
    }
}