package org.example.Seminar02;

import java.util.List;

public interface MarketBehavior {
    void acceptToMarket(Buyer actor);
    void releaseFromMarket(Buyer actors);
    void update();


}
