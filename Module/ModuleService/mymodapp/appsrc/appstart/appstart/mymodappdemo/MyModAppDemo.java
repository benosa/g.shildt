// Модульное приложение, в котором демонстрируется
// применение служб и поставщиков их услуг

package appstart.mymodappdemo;

import appfuncs.simplefuncs.SimpleMathFuncs;
import userfuncs.binaryfuncs.BinFuncProvider;
import userfuncs.binaryfuncs.BinaryFunc;

import java.util.ServiceLoader;

public class MyModAppDemo {
    public static void main(String[] args) {

        //Сначала воспользуемся встроенными
        //функциями. как прежде
        if (SimpleMathFuncs.isFactor(2, 10)) {
            System.out.println("2 - множитель 10");
        }

        System.out.println("Наименьший общий множитель "
                + "35 и 105 - "
                + SimpleMathFuncs.lcf(35, 105));

        System.out.println("Наибольший общий множитель "
                + "35 и 105 - "
                + SimpleMathFuncs.gcf(35, 105));

        // Затем воспользуемся служебными операциями,
        // определяемыми пользователем

        // Получить загрузчик службы для двоичных функций
        ServiceLoader<BinFuncProvider> ldr = ServiceLoader.load(BinFuncProvider.class);

        BinaryFunc binOp = null;

        // Найти поставщика услуг и получить двоичную
        // функцию сложения AbsPlus()
        for (BinFuncProvider bfp : ldr) {
            if (bfp.get().getName().equals("absPlus")) {
                binOp = bfp.get();
                break;
            }
        }

        if (binOp != null)
            System.out.println("Результат выполнения "
                    + "функция absPlus(): "
                    + binOp.func(12, -4));
        else
            System.out.println("Функция AbsPlus() не найдена");


        binOp = null;

        // Найти поставщика услуг и получить двоичную
        // функцию сложения AbsMinus()
        for (BinFuncProvider bfp : ldr) {
            if (bfp.get().getName().equals("absMinus")) {
                binOp = bfp.get();
                break;
            }
        }

        if (binOp != null)
            System.out.println("Результат выполнения "
                    + "функция absMinus(): "
                    + binOp.func(12, -4));
        else
            System.out.println("Функция AbsMinus() не найдена");
    }
}


