package OopConceptsPart2;

public class TestBank {
    public static void main(String[] args) {
        DFCUBank dfcu = new DFCUBank();
        dfcu.credit();
        dfcu.debit();
        dfcu.transferMoney();
        dfcu.educationLoan();
        dfcu.carLoan();
        dfcu.mutual_fund();


        //The static Variable min_bal is called using the Interface name
        System.out.println(UGBranch.min_bal);

    }
}
