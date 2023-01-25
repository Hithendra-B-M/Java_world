/*Simple understandable code of Bank system operation . Two accounts like Savings and Current account are created*/
import java.util.*;
class Account{
Scanner i=new Scanner(System.in);
String custName;
int accNo;
double balance;
String typeOfAccount;
public void withdrawal(double amount) {
if(balance>0)
balance=balance-amount;
else
System.out.println("Account has 0 balance");
}
public void deposit(double amount) {
balance=balance+amount;
}
public void updateBal() {
System.out.println("Updated balance is: "+balance);
}
}
class Current extends Account{
double serviceCharge;
String chequeBook;
public void issueCheque() {
System.out.println("The issued checkbook number is:
"+(int)(Math.random()*10000));
}
public void checkBal() {
if(balance>100) {
System.out.println("The balance is: "+balance);
}
else {
System.out.println("The balance is less than the minimum
requirement");
imposePenalty(78);
}
}
public void imposePenalty(int charges) {
balance=balance-charges;
}
}
class Savings extends Account{
double interest;
public void checkBal() {
System.out.println("The balance is: "+balance);
}
public double compundInterest() {
int r,t,n;
System.out.println("Enter rate of interest:");
r=i.nextInt();
System.out.println("Enter time period:");
t=i.nextInt();
System.out.println("Enter no of times:");
n=i.nextInt();
double interest=balance*Math.pow((1+r/n),n*t);
//interest= (balance*years*2)/100;
System.out.println("The interest given will be: "+(interest));
return interest;
}
public void depositInterest(double interest) {
balance=balance+interest;
System.out.println("The interest has been deposited "+balance);
}
}
class Bank{
public static void main(String args[]) {
Scanner input=new Scanner(System.in);
System.out.println("Enter the customer type of account: ");
String type=input.nextLine();
if(type.equals("savings") || type.equals("Savings")) {
Savings acc=new Savings();
System.out.println("Enter the customer name: ");
acc.custName=input.nextLine();
System.out.println("Enter the customer Account number: ");
acc.accNo=input.nextInt();
System.out.println("Enter the customer intial balance: ");
acc.balance=input.nextDouble();
while(true) {
System.out.println("1. Deposit 2. Withdraw \n3. Check
Balance 4. Compute interest 5. Exit");
int choice=input.nextInt();
switch(choice) {
case 1: System.out.println("Enter the amount to be
deposited: ");
int deposit=input.nextInt();
acc.deposit(deposit);
break;
case 2: System.out.println("Enter the amount to be
withdrawed: ");
double withdraw=input.nextDouble();
acc.withdrawal(withdraw);
break;
case 3: acc.checkBal();
break;
case 4:
double in=acc.compundInterest();
acc.depositInterest(in);
break;
case 5: return;
}
}
}
else if(type.equals("current") || type.equals("Current")){
Current curr=new Current();
System.out.println("Enter the customer name: ");
curr.custName=input.nextLine();
System.out.println("Enter the customer Account number: ");
curr.accNo=input.nextInt();
System.out.println("Enter the customer intial balance: ");
curr.balance=input.nextDouble();
while(true) {
curr.issueCheque();
System.out.println("1. Deposit 2. Withdraw \n3. Check
Balance 4. Exit");
int choice=input.nextInt();
switch(choice) {
case 1: System.out.println("Enter the amount to be
deposited: ");
double deposit=input.nextDouble();
curr.deposit(deposit);
break;
case 2: System.out.println("Enter the amount to be
withdrawed: ");
double withdraw=input.nextDouble();
curr.withdrawal(withdraw);
break;
case 3: curr.checkBal();
curr.imposePenalty(78);
break;
case 4: return;
}
}
}
else {
System.out.print("Invalid account type");
System.exit(0);
}
}
}
