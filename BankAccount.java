import java.util.Scanner;
class BankAccount
{
public int accountNumber;
public String accountHolderName;
private double balance;
BankAccount(int accountNumber,String accountHolderName,double balance )
{
this.accountNumber = accountNumber;
this.accountHolderName = accountHolderName;
this.balance = balance;
}
public void deposit(double amount)
{
if(amount>0)
{
balance = balance + amount;
System.out.println("Amount Deposited: "+amount);
}
else
{
System.out.println("Invalid Deposit Amount");
}
}
public void withdraw(double amount)
{
if(amount<=balance)
{
balance = balance - amount;
System.out.println("Withdrawn Amount: "+amount);
}
else
{
System.out.println("Insufficient Balance");
}
}
void display()
{
System.out.println("\n Account Details");
System.out.println("Account Number: "+accountNumber);
System.out.println("Account Holder Name: "+accountHolderName);
System.out.println("Balance: "+balance);
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Account Number:");
int accountNumber = sc.nextInt();
sc.nextLine();
System.out.println("Enter Account Holder Name:");
String accountHolderName = sc.nextLine();
System.out.println("Enter Initial Balance:");
double balance = sc.nextDouble();
sc.nextLine();
BankAccount account = new BankAccount(accountNumber,accountHolderName,balance);
System.out.println("Enter Deposited Amount: ");
double dep = sc.nextDouble();
account.deposit(dep);
System.out.println("Enter Withdrawl Amount: ");
double wd = sc.nextDouble();
account.withdraw(wd);
account.display();
}
}

 

