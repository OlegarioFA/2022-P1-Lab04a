// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst {
    public static void main(String[] args) {
        System.out.println("Lab04a, Student Version\n");

        double principal = 250000;
        double annualRate = 4.85;
        double numYears = 30;
        double nmp = numYears * 12;
        double monthlyrate = (annualRate / 12) / 100;
        double Calculation1 = Math.pow((1 + monthlyrate), nmp);
        double MonthlyPayment = (((monthlyrate * Calculation1) / (Calculation1 - 1)) * principal);
        double TotalPayment = ((MonthlyPayment * 12) * 30);
        double TotalInterest =(TotalPayment - principal);




        System.out.println("Principal:         $" + principal);
        System.out.println("Annual Rate:        " + annualRate + "%");
        System.out.println("Number of Years:    " + numYears);
        System.out.println("Monthly Payment:   $" + MonthlyPayment);
        System.out.println("Total Payment:     $" + TotalPayment);
        System.out.println("Total Interest:    $" + TotalInterest);
    }
}

