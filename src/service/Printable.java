package service;

import java.util.*;

public class Printable implements Runnable{
    List<String> list;

    public Printable(List<String> list){
        this.list = list;
    }
    @Override
    public void run() {
        for (String element:list){
            System.out.println(element);
        }
    }
}
