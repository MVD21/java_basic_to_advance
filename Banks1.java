import java.util.*;

class Bank {
    Scanner sc = new Scanner(System.in);
    String name;
    int accno;
    int total;

    void account() {
        System.out.println("Enter your name:");
        sc.nextLine();            
        name = sc.nextLine();

        System.out.println("Enter account number:");
        accno = sc.nextInt();

        System.out.println("Enter initial amount (minimum 2000):");
        total = sc.nextInt();

        if (total < 2000) {
            total = 2000;
            System.out.println("Minimum balance is 2000. Set to 2000.");
        }

        System.out.println("Account created successfully\n");
    }

    void deposit(int amt) {
        total += amt;
        System.out.println("Deposit successful");
    }

    void withdraw(int amt) {
        if (amt <= total) {
            total -= amt;
            System.out.println("Withdraw successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void check() {
        System.out.println("Balance: " + total);
    }

    void show() {
        System.out.println(name + "\t" + accno + "\t" + total);
    }
}

class Passbook {
    int accno, total, amount;
    String name, date, trscode;

    void pass() {
        System.out.println(
            accno + "\t" + name + "\t" + total + "\t" +
            trscode + "\t" + date + "\t" + amount
        );
    }
}

class Banks1 {
    public static void main(String args[]) {
        Scanner cs = new Scanner(System.in);

        Bank ba[] = new Bank[100];
        Passbook p[] = new Passbook[100];

        int c, n = -1, n2 = -1;

        do {
            System.out.println("\nMENU");
            System.out.println("1) Create account");
            System.out.println("2) Deposit");
            System.out.println("3) Withdraw");
            System.out.println("4) Check balance");
            System.out.println("5) Display all customers");
            System.out.println("6) Print passbook");
            System.out.println("7) Exit");
            System.out.print("Enter choice: ");

            c = cs.nextInt();

            switch (c) {

                case 1:
                    ba[++n] = new Bank();
                    ba[n].account();
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    int accno = cs.nextInt();
                    System.out.print("Enter deposit amount: ");
                    int amt = cs.nextInt();
                    System.out.print("Enter date: ");
                    String date = cs.next();

                    for (int i = 0; i <= n; i++) {
                        if (ba[i].accno == accno) {
                            ba[i].deposit(amt);

                            p[++n2] = new Passbook();
                            p[n2].accno = ba[i].accno;
                            p[n2].name = ba[i].name;
                            p[n2].total = ba[i].total;
                            p[n2].amount = amt;
                            p[n2].date = date;
                            p[n2].trscode = "D";
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    accno = cs.nextInt();
                    System.out.print("Enter withdraw amount: ");
                    amt = cs.nextInt();
                    System.out.print("Enter date: ");
                    date = cs.next();

                    for (int i = 0; i <= n; i++) {
                        if (ba[i].accno == accno) {
                            ba[i].withdraw(amt);

                            p[++n2] = new Passbook();
                            p[n2].accno = ba[i].accno;
                            p[n2].name = ba[i].name;
                            p[n2].total = ba[i].total;
                            p[n2].amount = amt;
                            p[n2].date = date;
                            p[n2].trscode = "W";
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    accno = cs.nextInt();

                    for (int i = 0; i <= n; i++) {
                        if (ba[i].accno == accno) {
                            ba[i].check();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Name\tAccNo\tBalance");
                    for (int i = 0; i <= n; i++) {
                        ba[i].show();
                    }
                    break;

                case 6:
                    System.out.println("AccNo\tName\tBalance\tType\tDate\tAmount");
                    for (int i = 0; i <= n2; i++) {
                        p[i].pass();
                    }
                    break;
            }

        } while (c >= 1 && c <= 6);
    }
}
