package chapter3;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        lightspeed = 186000; // Приблизительная скорость света, миль в секунду
        days = 1000; // Количество дней.
        seconds = days * 24 * 60 * 60; // Преобразовать в секунды
        distance = lightspeed * seconds; // Вычислить расстояние.
        System.out.print(" За " + days);
        System.out.print(" дней свет пройдет около");
        System.out.println(distance + " миль ");


    }
}
