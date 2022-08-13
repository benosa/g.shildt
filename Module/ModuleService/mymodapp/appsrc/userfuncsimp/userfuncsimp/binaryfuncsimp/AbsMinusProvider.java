// В этом классе реализуется поставщик
// двоичной функции сложения absMinus()

package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.*;

public class AbsMinusProvider implements BinFuncProvider {

    // предоставить объект типа AbsMinus
    public BinaryFunc get() {
        return new AbsMinus();
    }
}
