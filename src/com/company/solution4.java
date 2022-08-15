package com.company;
import java.util.Scanner;
import java.util.*;
public class solution4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        Vehicles[] vehicles =new Vehicles[n];
        for (int i = 0; i < n; i++) {
            int number =sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            double price=sc.nextDouble();sc.nextLine();
            vehicles[i]=new Vehicles(number,name,price);
        }
        String nm=sc.nextLine();sc.close();
        Vehicles ans=findVihicleMinimumPrice(vehicles);
        Vehicles ans2=findVihicleMaximumPrice(vehicles);
        Vehicles ans3=searchByname(vehicles,nm);
        if(ans!=null){
            System.out.println("number="+ans.getNumber());
            System.out.println("name="+ans.getName());
            System.out.println("price="+ans.getPrice());
        }else {
            System.out.println("No vehicle found");
        }
        if(ans2!=null){
            System.out.println("number="+ans2.getNumber());
            System.out.println("name="+ans2.getName());
            System.out.println("price="+ans2.getPrice());
        }else {
            System.out.println("No vehicle found");
        }
        if(ans3!=null){
            System.out.println("number="+ans3.getNumber());
            System.out.println("name="+ans3.getName());
            System.out.println("price="+ans3.getPrice());
        }else {
            System.out.println("No vehicle found");
        }

        double ans4=calculatedAvg(vehicles);
        System.out.println("average ="+Math.round(ans4));
    }

    /*minimum */
    public static Vehicles findVihicleMinimumPrice(Vehicles[] vehicles ){
        double min=vehicles[0].price;
        Vehicles vh=vehicles[0];
        for(Vehicles temp : vehicles){
            if(temp.getPrice()<min) {
                min = temp.getPrice();
                vh = temp;
            }
        }
        return vh;
    }

    /*maximum*/

    public static Vehicles findVihicleMaximumPrice(Vehicles[] vehicles ){
        double max=vehicles[0].price;
        Vehicles vh=vehicles[0];
        for(Vehicles temp : vehicles){
            if(temp.getPrice()>max){
                max=temp.getPrice();
                vh=temp;
            }
        }
        return vh;
    }
    /*Search method */
    public static Vehicles searchByname(Vehicles[] vehicles, String nm){
        Vehicles vh=null;
        for(Vehicles temp:vehicles){
            if(temp.getName().equalsIgnoreCase(nm)){
                vh=temp;
            }
        }
        return vh;
    }


    public static Double calculatedAvg(Vehicles[] vehicles){
        double sum=0;
        int count = 0;
        for(Vehicles avg: vehicles){
            sum+=avg.getPrice();
            count+=1;
        }
    return  (sum/count);
    }

}


class Vehicles{
    int number;
    String name;
    double price;

    public Vehicles(int number, String name, double price){
        this.number=number;
        this.name=name;
        this.price=price;
    }

    public int getNumber(){return number;}
    public String getName(){return name;}
    public double getPrice(){return price;}


}

/*input
3
12
bwn
23243.0
23
df
43254.0
34
hfg
432665.0
hfg

-
*/