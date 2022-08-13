// определение модуля математической функции
module appfuncs {
    // экспортировать пакет appfuncs.simplefuncs
    exports appfuncs.simplefuncs;

    // потребовать модуль appsupport
    // и сделать его переходным
    requires transitive appsupport;
}
