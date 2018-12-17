package org.xingyi.javadragon;

import java.util.HashSet;
import java.util.Set;

public class MutableDemo {


    public static void main(String[] args) {
        Money first = new Money(1);
        Money second = new Money(2);
        Set<Money> account = new HashSet<>();
        account.add(first);
        account.add(second);

        System.out.println(account.contains(first));
        System.out.println(account.contains(second));

        System.out.println("And now for the fun");

        first.amount = 5;

        //The game is 'what will be printed out now'
        System.out.println(account.contains(first));
        System.out.println(account.contains(second));


    }

}
