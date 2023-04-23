import service.Printable;
import service.Service;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Before ...");
//
//        ArrayList<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        Thread thread = new Thread(new Printable(list));
//
//        try {
//            Thread.sleep(2000);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        thread.start();
//
//        System.out.println("After ...");
//
        Service service = new Service();

        System.out.println("Before");

        service.addElement("Go");
        service.addElement("To");
        service.addElement("Hell");

        service.getList();

        System.out.println("After");



    }
}