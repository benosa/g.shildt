// Функции поддержки
package appsupport.supportfuncs;

public class SupportFuncs {

    //выяснить является ли a множителем b
    public static boolean isFactor(int a, int b) {
        if ((b % a) == 0) return true;
        return false;
    }
}
