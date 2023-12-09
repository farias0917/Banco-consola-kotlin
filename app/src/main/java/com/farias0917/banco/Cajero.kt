package com.farias0917.banco

class Cajero (var saldo:Int = 0){

    fun retirar(cantidad:Int): Int {
        saldo -= cantidad
        return cantidad
    }

    fun recargar(cantidad: Int): Int {
        saldo += cantidad
        return cantidad
    }

    fun mostrarSaldo():Int{
        return saldo
    }

}