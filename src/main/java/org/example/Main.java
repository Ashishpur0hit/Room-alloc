package org.example;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        List<Integer> boys_pair = new ArrayList<>();
        List<Integer> girls_pair = new ArrayList<>();
        List<Integer> not_alloc = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        char[] students = {
                'M', 'F', 'M', 'M', 'F',
                'F', 'M', 'F', 'M', 'M',
                'F', 'M', 'F', 'F', 'M',
                'M', 'F', 'M', 'F', 'M',
                'F'
        };

        List<List<Integer>> rooms= new ArrayList<>(10);

        int boys = 0,girls=0;
        for(int i=0;i<21;i++)
        {
            if(students[i]=='M') boys++;
            else girls++;
        }
        for(int i=0;i<21;i++)
        {
                if(students[i]=='M')
                {
                    boys_pair.add(i);
                }
                else {
                    girls_pair.add(i);
                }

                if(boys_pair.size()==2)
                {
                    rooms.add(new ArrayList<>(boys_pair));
                    boys_pair.clear();
                }
                if(girls_pair.size()==2) {
                    rooms.add(new ArrayList<>(girls_pair));
                    girls_pair.clear();
                }
        }
        not_alloc.addAll(boys_pair);
        not_alloc.addAll(girls_pair);
        for(int i=0;i<rooms.toArray().length;i++)
        {
            System.out.println("room number "+i+" is allocated to Student "+rooms.get(i).get(0) +" and "+rooms.get(i).get(1) + " are in same room");
        }
        System.out.println("Not allocating Students are");
        for(int i=0;i<not_alloc.toArray().length;i++) {
            System.out.println(not_alloc.get(i));
        }
    }
}