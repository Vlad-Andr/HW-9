package com.company;

import com.company.task1.OriginalTask;
import com.company.task2.ClientList;
import com.company.task3.ListOfMovie;
import com.company.task4.ListBox;


public class AppRelise {
    public static void appStart() {

        System.out.println("Task 1 : \n");

        OriginalTask t = new OriginalTask(){
            @Override
            public Object calculate(Integer a, Integer b, Integer c) {
                double s = Math.pow(a * b, c);
                return s;
            }
        };
        System.out.println(t.calculate(12, 23, 55));

        ClientList s = new ClientList();
        s.createAndGetUsers();
        s.filterListByUsers();

        ListOfMovie k = new ListOfMovie();
        k.filtredByMovie();

        ListBox p = new ListBox();
        p.findFragileThing();
    }
}
