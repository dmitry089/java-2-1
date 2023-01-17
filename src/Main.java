import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int  ticket = 3147;
        int bonusMiles = 20;
        System.out.println("Количество начисленных миль:");
        System.out.println(ticket/bonusMiles); //Вывод бонусов
    }
}