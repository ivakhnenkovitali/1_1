public class Runner1 {

    //Runner.main() -static метод вызываются через имя класса
    public static void main(String[] args) {

        //System -КЛАСС
        //out - его открытое static поле (PrintStream класс out)
        //println - метод клааса PrintStream
        System.out.println("Hello"); // в конец сообщения переходит на нов-ю строку


        System.out.print("Hello"); //НЕ ПЕРЕХОДИТ
        System.out.println("Hello java!"); //для форматированого вывода (%d.2lf)
    }
}
