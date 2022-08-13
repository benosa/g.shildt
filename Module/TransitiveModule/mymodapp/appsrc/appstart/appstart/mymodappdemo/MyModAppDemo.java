// Этот исходный файл обновлен с целью
// использовать класс SupportFuncs
package appstart.mymodappdemo;

import appfuncs.simplefuncs.SimpleMathFuncs;
import appsupport.supportfuncs.SupportFuncs;

public class MyModAppDemo {
    public static void main(String[] args) {

        // Теперь метод isFactor() вызывается по ссылке
        // на класс SupportFuncs. а не класс SimpleMathFuncs
        if (SupportFuncs.isFactor(2, 10)) {
            System.out.println("2 - множитель 10");
        }

        System.out.println("Наименьший общий множитель "
                + "35 и 105 - "
                + SimpleMathFuncs.lcf(35, 105));

        System.out.println("Наибольший общий множитель "
                + "35 и 105 - "
                + SimpleMathFuncs.gcf(35, 105));
    }
}


