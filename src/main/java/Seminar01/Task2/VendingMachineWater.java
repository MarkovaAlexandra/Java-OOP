package Seminar01.Task2;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineWater extends VendingMachine{
    List<Water> listWater = new ArrayList<>();

    void initGoods(List<Water>listWater) {
        this.listWater = listWater;

    }

    @Override
    Goods getGoods(String name) {
        for (Water bw:listWater) {
            if(bw.getName().equals(name)){
                return bw;
            }

        }
        return new Water("not found",0);
    }


    List<Water> getGoods(String name,int maxPrice) {
        List<Water> resultList = new ArrayList<>();
        for (Water bw:listWater) {
            if(bw.getName().equals(name) && bw.getPrice() <= maxPrice){
                resultList.add(bw);

            }

        }
        return resultList;
    }
}
