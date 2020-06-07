package com.lolo.factory.factorymethod.pizzastore.order;

import java.util.Scanner;

public class PizzaStore {

    public static void main(String[] args) {
        System.out.print("请输入地理位置[bj/ld]: ");
        Scanner sc = new Scanner(System.in);
        String loc = sc.nextLine();
        if (loc.equals("bj")) {
            //创建北京口味的各种Pizza
            new BJOrderPizza();
        } else {
            //创建伦敦口味的各种Pizza
            new LDOrderPizza();
        }
    }
}
