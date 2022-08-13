// В классе AbsPlus предоставляется конкретная
// реализация интерфейса BinaryFunc и возвращается
// результат выполнения операции abs(a) + abs(b)
package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinaryFunc;

public class AbsPlus implements BinaryFunc {

    // возвратить имя данной функции
    public String getName() {
        return "absPlus";
    }

    // реализовать функцию absPlus()
    public int func(int a, int b) {
        return Math.abs(a) + Math.abs(b);
    }
}
