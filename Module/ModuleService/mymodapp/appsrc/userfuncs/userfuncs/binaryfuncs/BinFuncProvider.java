// В этом интерфейсе определяется форма поставщика
// услуг, получающего экземпляры типа BinaryFunc

package userfuncs.binaryfuncs;

import userfuncs.binaryfuncs.BinaryFunc;

public interface BinFuncProvider {

    // получить экземпляр типа BinaryFunc
    public BinaryFunc get();
}
