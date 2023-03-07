package org.example.Seminar02;

import java.util.*;

public class Market implements QueueBehavior, MarketBehavior{
    List<Buyer> actors = new LinkedList<>();
    Queue<Buyer> actorsQueue = new ArrayDeque<>();


    @Override
    public void acceptToMarket(Buyer actor) {
        actors.add(actor);
        System.out.println(actor.getName() + " зашел в магазин");

    }

    @Override
    public void releaseFromMarket(Buyer actor) {
        actors.remove(actor);
        System.out.println(actor.getName() + " вышел из магазина");

    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Buyer actor) {
        actorsQueue.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
    }



    @Override
    public void takeOrder() {
        actorsQueue.peek().isTakeOrder();
        System.out.println(actorsQueue.peek().getName() + " сделал заказ");
    }

    @Override
    public void giveOrder() {
        actorsQueue.peek().isMakeOrder();
        System.out.println(actorsQueue.peek().getName() + " забрал заказ");
    }

    @Override
    public void releaseFromQueue() {

        System.out.println(actorsQueue.peek().getName() + " вышел из очереди");
        actorsQueue.poll();
    }
}
