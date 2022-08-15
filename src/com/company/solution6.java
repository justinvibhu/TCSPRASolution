//package com.company;

import java.util.Scanner;
public class Solution
{

    public static void main(String[] args)
    {
        //code to read values
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();

        Customer []c=new Customer[size];
        for (int i=0;i<size;i++) {
            int customerid=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            int age = sc.nextInt();sc.nextLine();
            String city = sc.nextLine();
            c[i] = new Customer(customerid,name,age,city);
        }

        String input1=sc.nextLine();
        sc.close();
        //code to call required method
        int avg = calculateAverageAgeOfCustomers(c);
        Customer c1 =  findCustomerByGivenCity( c, input1);
        //code to display the result
        System.out.println(avg);
        if(c1==null) {
            System.out.println("No Customer found with mentioned attribute.");
        }
        else {
            System.out.println(c1.customerid);
            System.out.println(c1.customerName);
            System.out.println(c1.age);
            System.out.println(c1.city);
        }
    }
    //code methods
    public static int calculateAverageAgeOfCustomers(Customer[] c)
    {
        int sum = 0;
        int avg =0;
        for (int i=0;i<c.length;i++) {
            sum=sum+c[i].age;
        }
        avg=sum/c.length;
        return avg;
    }
    public static Customer findCustomerByGivenCity(Customer[] c,String input1)
    {
        for (int i=0;i<c.length;i++) {
            if(c[i].city.equalsIgnoreCase(input1)) {
                return c[i];
            }
        }
        return null;
    }
}
public class Customer
{
    //code to build the class
    int customerid;
    String customerName;
    int age;
    String  city;
    public Customer(int customerid, String customerName, int age, String city) {
        super();
        this.customerid = customerid;
        this.customerName = customerName;
        this.age = age;
        this.city = city;

    }

}