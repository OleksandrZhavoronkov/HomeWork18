package com.example.demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Family {
    public String name;
    public String FamilyRole;

    public Family(String name, String familyRole) {
        this.name = name;
        FamilyRole = familyRole;
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", FamilyRole='" + FamilyRole + '\'' +
                '}';
    }

    public static void main(String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] FamilyContainer = new String [7];
        for (int i = 0; i < 7; i++) {

            if (i == 0) {
                System.out.println("Enter child name");
                Family Child = new Family(reader.readLine(),"Child");
                FamilyContainer[i] = String.valueOf(Child);
            } else if (i == 1) {
                System.out.println("Enter Mother name");
                Family Mother = new Family(reader.readLine(),"Mother");
                FamilyContainer[i] = String.valueOf(Mother);
            } else if (i == 2) {
                System.out.println("Enter Father name");
                Family Father = new Family(reader.readLine(),"Father");
                FamilyContainer[i] = String.valueOf(Father);
            } else if (i == 3) {
                System.out.println("Enter Grand Father (Mother Line) - name");
                Family GrandFatherMotherLine = new Family(reader.readLine(),"Grand Father - Mother Line");
                FamilyContainer[i] = String.valueOf(GrandFatherMotherLine);
            } else if (i == 4) {
                System.out.println("Enter Grand Mother (Mother Line) - name");
                Family GrandMotherMotherLine = new Family(reader.readLine(),"Grand Mother - Mother Line");
                FamilyContainer[i] = String.valueOf(GrandMotherMotherLine);
            } else if (i == 5) {
                System.out.println("Enter Grand Father (Father Line) - name");
                    Family GrandFatherFatherLine = new Family(reader.readLine(),"Grand Father - Father Line");
                FamilyContainer[i] = String.valueOf(GrandFatherFatherLine);
            } else {
                System.out.println("Enter Grand Mother (Father Line) - name");
                Family GrandMotherFatherLine = new Family(reader.readLine(),"Grand Mother - Father Line");
                FamilyContainer[i] = String.valueOf(GrandMotherFatherLine);
            }

        }
        System.out.println("Family:");
        arrayDisplay(FamilyContainer);
    }
    public static void arrayDisplay (String[] FamilyContainer) {
        for (String s : FamilyContainer) {
            System.out.println(s);
        }
    }
}