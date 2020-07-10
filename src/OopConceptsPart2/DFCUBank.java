package OopConceptsPart2;

public class DFCUBank implements UGBranch, KenyaBank {
    //A class cam implement more than one interface

    //if a class is implementing any interface, it is compulsory/mandatory to define/override all the Methods of the interface

    public void credit() {
        System.out.println("DFCU---Credit");
    }
    public void debit() {
        System.out.println("DFCU---Debit");

    }
    public void transferMoney() {
        System.out.println("DFCU---Money transfer");

    }
    public void educationLoan() {
        System.out.println("DFCU -------- edu Loan");
    }
    public void carLoan() {
        System.out.println("DFCU-----Car Loan");
    }
    public void mutual_fund() {
        System.out.println("DFCU----Mutual Fund");
    }


}
