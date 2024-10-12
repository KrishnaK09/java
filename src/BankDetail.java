import java.util.Scanner;

public class BankDetail {
    public static void main(String[] args) {

        Bank bank = new Bank("k.k", "Krishna", "Kanani", 500);
        System.out.println(bank.getUsername());
        System.out.println(bank.getFirstname());
        System.out.println(bank.getLastname());
        System.out.println(bank.getBalance());

        bank.setDeposit(1000);
        bank.setWithdraw(200);


        setdata();


    }

    public static void setdata() {
        Bank bank = new Bank();
        bank.setUsername("k.k");
        bank.setFirstname("Kanani");
        bank.setLastname("Kanani");
        bank.setBalance(500);


        System.out.println(bank.getUsername());
        System.out.println(bank.getFirstname());
        System.out.println(bank.getLastname());
        System.out.println(bank.getBalance());
    }
}
