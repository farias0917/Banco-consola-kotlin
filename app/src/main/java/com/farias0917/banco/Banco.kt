package com.farias0917.banco

class Banco {
}

fun main() {
    println("Ingresa tu usuario y contraseña para poder acceder")
    print("usuario: ")
    val usuario = readLine()!!.toString()
    val cajero = Cajero()

    print("contraseña: ")
    val pass = readLine()!!.toString()
    val u = Usuario(usuario, pass)

    if (u.nombre.equals("Emanuel") && u.contraseña.equals("1234")){
        while (true){
            println("¡BIENVENIDO!")
            println("---Menú---")
            println("¿Que opción desea ralizar?")
            println("1.Retirar")
            println("2.Recargar saldo")
            println("3.Mostrar saldo")
            println("4.Salir")

            val op = readLine()!!.toString()
            var cantidadRetiro = 0
            var cantidadRecarga = 0
            if (op.equals("1")){
                println("Tienes ${cajero.saldo}$")
                println("¿Cuanto deseas retirar?")

                cantidadRetiro = readLine()!!.toIntOrNull()!!
                if (cantidadRetiro > cajero.saldo){
                    println("No cuentas con los suficientes fondos para retirar")
                }else{
                    println("Has retirado ${cantidadRetiro}$")
                    cajero.retirar( cantidadRetiro)
                }
            }else if (op.equals("2")){
                println("¿Cuanto dinero deseas recargar?")
                cantidadRecarga = readLine()!!.toIntOrNull()!!

                cajero.recargar(cantidadRecarga)

                println("¡La recarga se ha realizado con éxito!")

            }else if (op.equals("3")){
                println("Tu saldo actual es: ${cajero.mostrarSaldo()}$")
            }else if (op.equals("4")){
                println("¿Esta seguro que desea salir?")
                println("1.Si")
                println("2.No")
                val salir = readLine()!!.toString()

                if (salir.equals("1")){
                    break
                }
            }else{
                println("Ingrese una opción válida")
            }
        }
    }else{
        println("Error al ingresar")
    }

    println("¡Hasta la proxima!")
}