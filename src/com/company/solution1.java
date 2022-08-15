package com.company;

import java.util.Scanner;

class solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        College[] colleges=new College[5];
        int n=sc.nextInt();sc.nextLine();
        for (int i = 0; i < n; i++) {
            int id =sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            int contact=sc.nextInt(); sc.nextLine();
            String add=sc.nextLine();
            int pin =sc.nextInt();sc.nextLine();

            colleges[i]=new College(id,name,contact,add,pin);

        }

        String input =sc.next();
        College ans= findMaxiWithPin(colleges);
        if(ans!=null){

            System.out.println("id ="+ans.id);
            System.out.println("name"+ans.name);
            System.out.println("contact"+ans.contact);
            System.out.println("add"+ans.add);
            System.out.println("pin"+ans.pin);
        }
        else {
            System.out.println("No data found");


        }



        College ans2=findWthAddress(colleges,input);
        if(ans2!=null){
            System.out.println("id ="+ans2.id);
            System.out.println("name"+ans2.name);
            System.out.println("contact"+ans2.contact);
            System.out.println("add"+ans2.add);
            System.out.println("pin"+ans2.pin);


        }else
        {
            System.out.println("No match is found ");
        }

    }






    public static College findMaxiWithPin(College[] colleges) {
        College max=null;
        int pin=0;
        for (int i = 0; i < colleges.length; i++) {

            if(colleges[i].pin >pin) {
                pin= colleges[i].pin;
                max=colleges[i];

            }
        }
        return max;

    }



    public static College findWthAddress(College[] colleges, String input) {
        College m=null;
        for (int i = 0; i < colleges.length ; i++) {
            if (colleges[i].add.equalsIgnoreCase(input)) {
                m = colleges[i];
            }
        }
        return m;
    }
}


class College{
    int id;
    String name;
    int contact;
    String add;
    int pin;


    public College(int id, String name, int contact, String add, int pin) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.add = add;
        this.pin = pin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }


}
