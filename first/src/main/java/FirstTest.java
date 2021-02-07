import test.ship.StarShip;

public class FirstTest {
    public static void main(String[] args) {
        //создаю экземпляр класса корабля
        StarShip ship = new StarShip(253.25);

        //задаю конкретные свойства
       // ship.shipHeight = 253.25;
        displayHeigh(ship);
    }
     public static void displayHeigh(StarShip ship)   {
        System.out.println("Высота коробля составляет :"+ ship.getShipHeight());

    }
    /*public static double getStarShipHeight (StarShip ship) {
        return ship.shipHeight;
    }*/
        /*helloTest();
        helloTest("username");
        System.out.println(helloTest("значение1","значение2"));


        System.out.println("We are here! Hello! ");

        System.out.println(8 + 2);
        System.out.println(8 - 2);
        System.out.println(8 * 2);
        System.out.println(8 / 3);

        System.out.println(8.0 / 3);

        int side = 7;
        String text = "Площадь квадрата со стороной ";
        System.out.println(text + side + " = " + (side * side));

        double sidedo = 7.45;
        System.out.println("Площадь квадрата со стороной " + sidedo + " = " + (sidedo * sidedo));

    }

    /*демо методов*/
    //1 метод без параметров
    /*public static void helloTest() {
        System.out.println("We are here! Hello! ");
    }
    //2 метод с параметром
    public static void helloTest(String value) {
        System.out.println("We are here! Hello! "+ value);
    }
    //3 метод с возвратом значения
    public static String helloTest(String value1, String value2) {
         return "We are here! Hello! "+ value1 + ", " + value2;
    }*/

}
