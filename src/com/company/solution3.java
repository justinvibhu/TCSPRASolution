package com.company;
import java.util.Scanner;
import java.util.Arrays;

class solution3 {
    public static void main(String[] args) throws Exception{

        Scanner sc=new Scanner(System.in);

        int n =sc.nextInt();sc.nextLine();
        Colleges[] colleges =new Colleges[n];
        for (int i = 0; i < n; i++) {
            int id =sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            int contact=sc.nextInt();sc.nextLine();
            String address=sc.nextLine();
            int pin=sc.nextInt();sc.nextLine();
            colleges[i]=new Colleges(id, name, contact,address,pin);
        }
        String input=sc.nextLine();
        Colleges ans =findCollegeWithMaximumPincode(colleges);
        if(ans!=null){
            System.out.println("id="+ans.id);
            System.out.println("name="+ans.name);
            System.out.println("contact="+ans.contact);
            System.out.println("add="+ans.address);
            System.out.println("pin"+ans.pin);
        }else{
            System.out.println("No College found with mentioned attribute");
        }

        Colleges ans2= searchCollegeByAddress(colleges,input);
        if(ans2!=null){
            System.out.println("id="+ans2.id);
            System.out.println("name="+ans2.name);
            System.out.println("contact="+ans2.contact);
            System.out.println("add="+ans2.address);
            System.out.println("pin"+ans2.pin);
        }else{
            System.out.println("No College found with mentioned attribute");
        }


    }
    public static Colleges findCollegeWithMaximumPincode(Colleges[] colleges){
//        Colleges max=null;
//        int pin=0;
//        for (int i = 0; i < colleges.length; i++) {
//
//            if(colleges[i].pin >pin) {
//                pin= colleges[i].pin;
//                max=colleges[i];
//
//            }
//        }
//        return max;

        Colleges co=colleges[0];
        int max=colleges[0].getPin();
        for(Colleges temp: colleges){
            if(temp.getPin()>max){
                max= temp.getPin();
                co=temp;
            }
        }
        return co;


    }

    public static Colleges searchCollegeByAddress(Colleges[] colleges, String input){
        for (int i = 0; i < colleges.length; i++) {
            if(colleges[i].address.equalsIgnoreCase(input)){
                return colleges[i];

            }

        }
        return null;
    }

}


class Colleges{
    int id;
    String name;
    int contact;
    String address;
    int pin;

    public Colleges(int id, String name,int contact, String address,int pin){
        this.id=id;
        this.name=name;
        this.contact=contact;
        this.address=address;
        this.pin=pin;
    }

    public int getId(){return id;}
    public String getName(){return name;}
    public int getContact(){return contact;}
    public String getAddress(){return address;}
    public int getPin(){return pin;}

    public void setId(int id){this.id=id;}
    public void setName(String name){this.name=name;}
    public void setContact(int contact){this.contact=contact;}
    public void setAddress(String address){this.address=address;}
    public void setPin(int pin){this.pin=pin;}

}


