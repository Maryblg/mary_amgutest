package test.ship;
/*Created by Mariy 02 2021*/
public class StarShip {
    /*ВЫСОТА*/
    public  double shipHeight;
//добавить конструктор для корабля
    public StarShip (double shipHeight) {
        this.shipHeight=shipHeight;
    }
    //возвращает высоту корабля
    public double getShipHeight(){
        return this.shipHeight;
    }
}
