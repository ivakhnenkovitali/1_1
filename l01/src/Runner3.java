import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Runner3 {
    public static void main(String[] args) {
        int intValue = 0; //объявление целочисленной переменной
        System.out.println(intValue); // при попытку вывода непроинцциолизивовать пременной


        //получаеь ситаксическую ошибку
        //по соглашениям примитивные переменные при переменной объявлени обязательно должно быть
        // проиницилизированно

        System.out.println(intValue);

        byte byteValue = (byte) 150; // ошибки нет. но хронится -160
        short shortValue = 15;
        long longValue = 1500;





        System.out.println(byteValue);

        longValue = 3000000000l; // l - компелятор примет это значение как LONG
        //ПО умолчанию компилятор все целые числа в коде воспринимаем как int




        byte b1 = 2;
        byte b2 = 3;

        // продвижение типов данных в арифметических вырожениях
        // bute, short, int -> int


        byteValue = (byte) (b1 + b2);
        longValue = intValue + longValue;

        float floatValue = 3.6f;     // f - кампилятор примет это значение как float

        double doubleValue = 4.9;
        char s1 = 'g';



        boolean f1 = true;
        //final величины можно проинициализивроть только один раз
        final int SIZE;
        SIZE = 10;


        //SIZE = 15; ОШИБКА -- НЕЛЬЗЯ переприсвоить final величину
        System.out.println("Переменная int: " + intValue);
        doubleValue = (double) 10 / 3;  //выделяется целая часть от деления
        //для получения вещественного результата при делении 2х

        System.out.println("doubleValue: " + doubleValue);
        System.out.printf("doubleValue %.2f%n", doubleValue);// %n для перехода на следующу строку




        System.out.printf("%d %d %d %d %f %f %c %d %s%n", byteValue, shortValue, intValue, longValue,
                floatValue, doubleValue, s1, f1, "строка");
    }
}
