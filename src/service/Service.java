package service;

import java.util.*;

public class Service {
    private List<String> list = new ArrayList<>();

    public void addElement(String element){
        list.add(element);
    }
    Thread print = new Thread(new Printable(list));

    public void getList() throws InterruptedException {
        try {
                print.start();
                Thread.sleep(200);
        }catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
