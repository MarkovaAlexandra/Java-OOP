package Seminar01.Task2;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrinks extends VendingMachine{

    List<HotDrinks> listHotDrinks = new ArrayList<>();

    void initGoods(List<HotDrinks>listHotDrinks){

        this.listHotDrinks=listHotDrinks;
    }
    @Override
    Goods getGoods(String name) {
        for (HotDrinks hd:listHotDrinks) {
            if(hd.getName().equals(name)) return hd;

        };
        return new HotDrinks("not found",0,0,0);
    }

    /**
     *
     * @param name название
     * @param temper температура напитка
     * @param vol объем напитка
     * @return возвращает лист напитков
     */
    List<HotDrinks> getGoods(String name, int temper, double vol) {
        List<HotDrinks> resultHDlist = new ArrayList<>();

        for (HotDrinks hd : listHotDrinks) {
            if (hd.getName().equals(name) && hd.getTemperature() == 50 && hd.getVolume() == vol) {
                resultHDlist.add(hd);
            };


        }
            return resultHDlist;
        }

    }
