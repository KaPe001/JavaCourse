package OOP;

public class Main2 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        //("12345", 0.00, "Kinga P", "kingap@email.com", "(010) 123=4567");

        bankAccount.setBalance(20.00);
        bankAccount.depositFunds(200.00);
        bankAccount.depositFunds(400.00);
        //bankAccount.withdrawFunds(1000.00);
        bankAccount.withdrawFunds(600.00);

        VipCustomer personOne = new VipCustomer();
        System.out.println(personOne.getName());

        VipCustomer personTwo = new VipCustomer("Kinga", 150000000.00);
        System.out.println(personTwo.getName());

        VipCustomer personThree = new VipCustomer("Kuba", 150.00, "kinga@email.com");
        System.out.println(personThree.getName());
        System.out.println(personThree.getEmail());


        //--------------------------------------------

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());
    }
}
