import java.util.Scanner;
class ATMSimulation {
    void createAccount(int[] create,int[] pin,double[] balance,int i) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Account no of user  "+(i+1));
        create[i]=sc.nextInt();
        System.out.println("Enter pin");
        pin[i]=sc.nextInt();
        System.out.println("Enter balance");
        balance[i]=sc.nextDouble();
        
        System.out.println("Account created Successfully");
        
        //ystem.out.println("i value is :"+i);
        
    }
    double checkBalance(double[] balance,int index) {
        return balance[index];
    }
    double deposit(int index1,int amount,double[] balance) {
        balance[index1]=balance[index1]+amount;
        return balance[index1];
    }
    double withdraw(int index2,int amount2,double[] balance) {
        if(balance[index2]<amount2) {
            System.out.println("Unsufficient balance");
            return balance[index2];
        }
        balance[index2]=balance[index2]-amount2;
        return balance[index2];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] create=new int[size];
        int[] pin=new int[size];
        double[] balance=new double[size];
        int i=0;
        ATMSimulation a=new ATMSimulation();
        while(true) {
            //Scanner s=new Scanner(System.in);
            
            System.out.println("Choose\n 1.Create Account \n 2.Check Balance \n 3.Deposit \n 4.Withdraw \n 5.Exit");
            int ch=sc.nextInt();
            
            switch(ch) {
                case 1:
                    a.createAccount(create,pin,balance,i);
                    //System.out.println(i);
                    i++;
                    break;
                case 2:
                    int index=sc.nextInt();
                    if(index>size) {
                        System.out.println("No Account Exists");
                    }
                    double res=a.checkBalance(balance,index);
                    System.out.println(res);
                    break;
                case 3:
                    System.out.println("Enter user:");
                    int index1=sc.nextInt();
                    System.out.println("Enter amount: ");
                    int amount=sc.nextInt();
                    double res1=a.deposit(index1,amount,balance);
                    System.out.println("Updated balance after deposit: "+res1);
                    break;
                case 4:
                    System.out.println("Enter user");
                    int index2=sc.nextInt();
                    System.out.println("Enter amount to withdraw:");
                    int amount2=sc.nextInt();
                    double res2=a.withdraw(index2,amount2,balance);
                    System.out.println("Updated balance after withdraw: "+res2);
                    break;
                case 5:
                    System.out.println("Thank you");
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice");
            }
            //System.out.println("Current i value:"+i);
            //sc.close();
        }

        //sc.close();
    }
}