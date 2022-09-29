// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        double nmp = numYears*12;
        double mr = (annualRate/12)/100;
        double n1 = Math.pow((1 + mr),nmp);
        double n2 = ((mr * n1)/(n1 - 1)) * principal;



        System.out.println("Principal:          $" + principal);
        System.out.println("Annual Rate:        " + annualRate +"%");
        System.out.println("Number of Years:    " + numYears);
        System.out.println("Monthly Payment:    $" + n2);
    }
}

