package org.example.Seminar02;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        List<Buyer> actors = new LinkedList<>();
        Queue<Buyer> actorsQueue = new ArrayDeque<>();
        Human hm1 = new Human();
        hm1.name = "Борис";
        Human hm2 = new Human();
        hm2.name = "Ярослав";
        Human hm3 = new Human();
        hm3.name = "Вася";
        Market market = new Market();
        market.acceptToMarket(hm1);
        market.takeInQueue(hm1);
        market.acceptToMarket(hm2);
        market.takeInQueue(hm2);
        market.takeOrder();
        market.giveOrder();
        market.acceptToMarket(hm3);
        market.takeInQueue(hm3);
        market.releaseFromQueue();
        market.takeOrder();
        market.giveOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(hm1);
        market.update();

    }
}
