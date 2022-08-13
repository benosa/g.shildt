// определение главного модуля приложения
// It now uses BinFuncProvider.
module appstart {
    //требуются модули appfuncs и userfuncs
    requires appfuncs;
    requires userfuncs;

    // теперь в модуле appstart применяется
    // интерфейс BinFuncProvider
    uses userfuncs.binaryfuncs.BinFuncProvider;
}
