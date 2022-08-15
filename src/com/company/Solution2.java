package com.company;


import java.util.Scanner;
public class Solution2{

    public static void main(String[] args){
        Vehicle[] vehicle=new Vehicle[4];
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();sc.nextLine();
        for (int i = 0; i <n; i++) {
            int number=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            double price=sc.nextDouble();sc.nextLine();
            vehicle[i]=new Vehicle(number, name, price);
        }
        String input1=sc.nextLine();sc.close();
        Vehicle ans =findVehicleByMinimumPrice(vehicle);
        if(ans!=null){
            System.out.println("number-"+ans.number);
            System.out.println("name-"+ans.name);
            System.out.println("price-"+ans.price);
        }else{System.out.println("no data found ");}


        Vehicle ans2=searchVehicleByName(vehicle, input1);
        if(ans!=null){
            System.out.println("number-"+ans2.number);
            System.out.println("name-"+ans2.name);
            System.out.println("Price-"+ans2.price);
        }else{System.out.println("no data found ");}
    }

    /*methods1 - Find the minimum value */

    public static Vehicle findVehicleByMinimumPrice(Vehicle[] vehicle){
        Vehicle v=null;
        double min=10000.0;
        for (int i = 0; i < vehicle.length; i++) {
            if(min>vehicle[0].price){
                min=vehicle[0].price;
                v=vehicle[i];
            }

        }
        return v;

    }


/*Method 2 Searching by name */
    public static Vehicle searchVehicleByName(Vehicle[] vehicle, String input1){
        for (int i = 0; i < vehicle.length; i++) {
            if(vehicle[i].name.equalsIgnoreCase(input1)){
                return vehicle[i];
            }
        }
        return null;
    }

}


/*Class */
class Vehicle{
    int number;
    String name;
    double price;
/*Constructor*/
    public Vehicle(int number, String name, double price){
        this.number=number;
        this.name=name;
        this.price=price;

    }

    /*getter */
    public int getNumber(){
        return number;

    }
    public String getName(){
        return name;

    }
    public double getPrice(){
        return price;
    }

    /*setter*/
    public void setNumber(int number){
        this.number=number;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrice( double price){
        this.price=price;
    }
}