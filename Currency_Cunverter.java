
package com.examplle.CurrencyConverter;
import java.util.*;
import java.text.DecimalFormat;

public class Curency_Converter {
    public static void main(String[] args)
    {
        double rupee,dollar,pound,code,euro;
        DecimalFormat f= new DecimalFormat(  "##.###");
        Scanner sc= new Scanner(System.in);
        System.out.println("*** Welcome to Webeduclick Currency Converter Project ***\nSelect the any currency code \n1:Rupees\n2:Dollar\n3:Pound\n4:Euro");

        code=sc.nextInt();
        if(code== 1) {
            System.out.println("Enter amount in rupee: ");
            rupee = sc.nextDouble();
            dollar = rupee / 77.34;
            System.out.println("dollar : " + f.format(dollar));
            pound = rupee / 94.46;
            System.out.println("pound : " + f.format(pound));
            euro = rupee / 88.36;
            System.out.println("Euro : " + f.format(euro));

        }
        else if (code == 2)
        {
            System.out.println("Enter amount in dollar: ");
            dollar = sc.nextDouble();
            rupee = dollar *77.34;
            System.out.println("rupee : " + f.format(rupee));
            pound = dollar *0.82;
            System.out.println("pound : " + f.format(pound));
            euro = dollar *0.96;
            System.out.println("Euro : " + f.format(euro));

        }
        else if (code == 3)
        {
            System.out.println("Enter amount in pound: ");
            pound = sc.nextDouble();
            rupee =pound * 94.43;
            System.out.println("rupee : " + f.format(rupee));
            dollar =pound*1.22;
            System.out.println("dollar : " + f.format(dollar));
            euro = pound*1.17;
            System.out.println("Euro : " + f.format(euro));

        }
        else if(code== 4)
        {
            System.out.println("Enter amount in euro: ");
            euro = sc.nextDouble();
            rupee = euro*88.43;
            System.out.println("rupee : " + f.format(rupee));
            dollar = euro*1.04;
            System.out.println("dollar : " + f.format(dollar));
            pound  = euro*0.85;
            System.out.println("Pound : " + f.format(pound));


        }

        else
        {
            System.out.println("Invalid code!");
        }

    }
}