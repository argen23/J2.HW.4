package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
                System.out.println("list-a");
                //list A
                Scanner scanner = new Scanner(System.in);
                ArrayList<String> listA = new ArrayList<>();
                listA.add(scanner.nextLine());
                listA.add(scanner.nextLine());
                listA.add(scanner.nextLine());
                listA.add(scanner.nextLine());
                listA.add(scanner.nextLine());
                Collections.sort(listA);
                Iterator<String> iterator = listA.iterator();
                while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                }
                System.out.println("list-b");
                //list B
                Scanner sc = new Scanner(System.in);
                ArrayList<String> listB = new ArrayList<>();
                listB.add(sc.nextLine());
                listB.add(sc.nextLine());
                listB.add(sc.nextLine());
                listB.add(sc.nextLine());
                listB.add(sc.nextLine());
                Collections.sort(listB);
                Collections.reverse(listB);
                Iterator<String> it = listB.iterator();
                while (it.hasNext()) {
                        System.out.println(it.next());
                }
                System.out.println("list-c");
                //list C
                ArrayList<String> listC = new ArrayList<>();
                listC.addAll(listA);
                listC.addAll(listB);
                Iterator<String> iteratorC = listC.iterator();
                int i = -1;
                while (i<listC.size()){
                i++;
                        System.out.println(listA.get(i)+"\n"+listB.get(i));
                }
                while (iteratorC.hasNext()){
                        System.out.println(iteratorC.next());
                }
        }
}
