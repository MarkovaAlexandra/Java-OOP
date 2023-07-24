package Seminar02;

public interface MarketBehavior {
    void acceptToMarket(Buyer actor);
    void releaseFromMarket(Buyer actors);
    void update();


}
