package com.company;
import sun.font.TrueTypeFont;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner Invoice = new Scanner(System.in);
        String Quit;

        do
        {

            System.out.println("Enter the CustomerId: ");
            int CustomerID = Invoice.nextInt();

            System.out.println("Enter the name: ");
            String Name = Invoice.nextLine();
            Invoice.nextLine();

            System.out.println("Enter the SalesAmount: ");
            double SalesAmount = Invoice.nextInt();
            Invoice.nextLine();

            System.out.println("Enter the TaxCode: ");
            String TaxCode = Invoice.nextLine();

            double SalesTax = 0;
            double TotalSalesAmount = 0;

            if (TaxCode.equals("NRM"))
                {

                SalesTax = (SalesAmount*0.06);
                TotalSalesAmount = (SalesAmount+SalesTax);

                }
else if  (TaxCode.equals("NPF"))
        {

            SalesTax = (SalesAmount*0);
            TotalSalesAmount = (SalesAmount+SalesTax);

        }
else if   (TaxCode.equals("BIZ"))
        {

            SalesTax = (SalesAmount*0.045);
            TotalSalesAmount = (SalesAmount+SalesTax);

        }
            System.out.println("The Result of CustomerID is:  " + CustomerID);
            System.out.println("The Result of Name  is:  " + Name);
            System.out.println("The Result of TaxCode  is:  " + TaxCode);
            System.out.println("The Result of SalesAmount  is:  " + SalesAmount);
            System.out.println("The Result of TotalSalesAmount  is:  " + TotalSalesAmount);
            System.out.println("Do you want quit(yes/no)");
            Quit = Invoice.nextLine();

            if (Quit.equals("yes"))
            {
                System.out.println("Thanks");
                System.exit(0);
            }
        }

        while (Quit.equalsIgnoreCase("yes")||Quit.equalsIgnoreCase("no"));
    }
}