fun main(args: Array<String>) {
    println("Bienvenido a la miselanea de programación!")
    println("Que desea realizar, seleccione una opción \r\n1-Operadores  \r\n2-Condicionales  \r\n3-Ciclos")

    do {
        val option: Int = readLine()!!.toInt()
        when (option) {
            1 -> {
                println("----------- MENÚ OPERADORES-----------")
                println("1. Calcular el área de un triángulo.")
                println("2. Ingresar dos números por teclado y sumarlos.")
                println("3. Ingresar un número y visualizar el número elevado al cuadrado.")
                println("4. Convierta de euros a dólares")
                println("5. Escribir el lado de un cuadrado y muestre el valor del área y del perímetro")
                println("6.  Escribir un algoritmo que determine el área y el volúmen de un cilindro")
                println(
                    "7. Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y\n" +
                            "el área (pi*r)^2 del círculo inscrito."
                )
                println("8. Calcular el promedio de tres (3) números ingresados por teclado.")
                println("99. Salir")
                println("-----------------------------")
                println("Ingrese el numero del ejercicio que desea realizar:")
                val exercise: Int = readLine()!!.toInt()
                when (exercise) {
                    1 -> {
                        println("Calcular el área de un triángulo")
                        println("Ingrese la base")
                        val base: Int = readLine()!!.toInt()
                        println("Ingrese la altura")
                        val height: Int = readLine()!!.toInt()
                        val result = (base * height) / 2
                        print("El area del triángulo es $result")
                    }

                    2 -> {
                        println("Sume dos numeros")
                        println("Ingrese el primer número:")
                        val number1: Int = readLine()!!.toInt()
                        println("Ingrese el segundo número:")
                        val number2: Int = readLine()!!.toInt()
                        val result = (number1 + number2)
                        print("La suma de los dos números es: $result")
                    }

                    3 -> {
                        println("visualizar el número elevado al cuadrado")
                        println("Ingrese un número:")
                        val number: Int = readLine()!!.toInt()
                        val result = (number * number)
                        print("El número elevado al cuadrado es: $result")
                    }

                    4 -> {
                        println("Escribir un algoritmo que convierta de euros a dólares")
                        val conversion = 1.17 // 1 euro = 1.17 dólares
                        print("Ingrese la cantidad en euros: ")
                        val euros = readLine()!!.toDoubleOrNull()
                        if (euros != null && euros >= 0) {
                            val dolares = euros * conversion
                            println("La cantidad en dólares es: $dolares")
                        } else {
                            println("Error. Asegúrese de ingresar un valor numérico positivo.")
                        }
                    }

                    5 -> {
                        println("Escribir el lado de un cuadrado y muestre el valor del área y del perímetro")
                        println("Ingrese el lado del cuadrado:")
                        val side: Int = readLine()!!.toInt()
                        val area = (side * side)
                        val perimeter = (side * 4)
                        print("El area del cuadrado es: $area y el perimetro es $perimeter")
                    }

                    6 -> {
                        println("Determine el área y el volúmen de un cilindro")
                        println("Digite el radio del cilindro")
                        val radio: Int = readLine()!!.toInt()
                        println("Digite la altura del cilindro")
                        val height: Int = readLine()!!.toInt()
                        if (radio != null && radio > 0 && height != null && height > 0) {
                            val area = (3.1416 * radio * radio)
                            val lateralArea = 2 * 3.1416 * radio * height
                            val totalArea = 2 * area + lateralArea
                            val volume = area * height
                            println("El área del cilindro es: $totalArea")
                            println("El volumen del cilindro es: $volume")
                        } else {
                            println("Error. Asegúrese de ingresar valores numéricos positivos.")
                        }
                    }

                    7 -> {
                        println(
                            "lea el radio de una circunferencia y escriba la longitud de la misma y\n" +
                                    "el área (pi*r)^2 del círculo inscrito.\n"
                        )
                    }

                    8 -> {
                        println("Calcular el promedio de tres (3) números ingresados por teclado.")
                        println("Ingrese el número 1:")
                        val number1: Int = readLine()!!.toInt()
                        println("Ingrese el número 2:")
                        val number2: Int = readLine()!!.toInt()
                        println("Ingrese el número 3:")
                        val number3: Int = readLine()!!.toInt()
                        val promedio = (number1 + number2 + number3) / 3
                        println("El promedio de los números es: $promedio")
                    }

                    99 ->{
                        println("¡Bay!")
                    }
                    else -> println("Opción inválida, por favor seleccione nuevamente.")
                }
            }
            /*******************************************************************************/
            2 -> {
                println("----------- MENÚ CONDICIONALES-----------")
                println("1. Saber si el número ingresado por teclado es positivo o negativo.")
                println("2. Reciba dos números cuál es el mayor y cuál es menor")
                println(
                    "3. Lea tres números enteros positivos y que calcule e imprima en\n" +
                            "pantalla el menor y el mayor de ellos."
                )
                println("4. Dados dos números A y B, sumarlos si A es menor que B o sino restarlos.")
                println("5. Dados dos números A y B encontrar el cociente entre A y B. ")
                println(
                    "6. Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario\n" +
                            "multiplicarlos"
                )
                println("7. Escribir un algoritmo que determine si un año es bisiesto o no.")
                println("99. Salir")
                println("-----------------------------")
                val exercise: Int = readLine()!!.toInt()
                when (exercise) {
                    1 -> {
                        println("Número positivo o negativo.")
                        println("Ingrese un número:")
                        val number = readLine()!!.toDoubleOrNull()
                        if (number != null) {
                            if (number > 0) {
                                println("El número ingresado es positivo.")
                            } else if (number < 0) {
                                println("El número ingresado es negativo.")
                            } else {
                                println("El número ingresado es cero.")
                            }
                        } else {
                            println("Error. Asegúrese de ingresar un valor numérico.")
                        }
                    }

                    2 -> {
                        println("Número mayor  o menor")
                        println("Ingrese un número:")
                        val number1: Int = readLine()!!.toInt()
                        println("Ingrese otro número:")
                        val number2: Int = readLine()!!.toInt()
                        if (number1 > number2) {
                            println("El número mayor es $number1 y el menor  es $number2.")
                        } else if (number2 > number1) {
                            println("El numero mayor es $number2 y el menor es $number1.")
                        } else {
                            println("Los numeros son iguales.")
                        }
                    }

                    3 -> {
                        println(
                            "Lea tres números enteros positivos y que calcule e imprima en\n" +
                                    "pantalla el menor y el mayor de ellos."
                        )
                        println("Ingrese el primer número.")
                        val number1: Int = readLine()!!.toInt()
                        println("Ingrese el segundo número.")
                        val number2: Int = readLine()!!.toInt()
                        println("Ingrese el tercer número.")
                        val number3: Int = readLine()!!.toInt()

                        var biggerNumber = number1
                        if (number2 > biggerNumber) {
                            biggerNumber = number2
                        } else if (number3 > biggerNumber) {
                            biggerNumber = number3
                        }
                        var minorNumber = number1
                        if (number2 < minorNumber) {
                            minorNumber = number2
                        } else if (number3 < minorNumber) {
                            minorNumber = number3
                        }
                        println("El número mayor es $biggerNumber")
                        println("El número menor es $minorNumber")
                    }

                    4 -> {
                        println("Dados dos números A y B, sumarlos si A es menor que B o sino restarlos.")
                        println("Ingrese el número A")
                        val A: Int = readLine()!!.toInt()
                        println("Ingrese el número B")
                        val B: Int = readLine()!!.toInt()
                        if (A < B) {
                            val addition = (A + B)
                            println("El resultado de su suma es: $addition")
                        } else {
                            val subtraction = (A - B)
                            println("El resultado de su resta es: $subtraction")
                        }
                    }

                    5 -> {
                        println(
                            "Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división por cero\n" +
                                    "no está definida, en ese caso debe aparecer una leyenda anunciando que la división no es\n" +
                                    "posible.\n"
                        )
                    }

                    6 -> {
                        println(
                            "Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario\n" +
                                    "multiplicarlos"
                        )
                        println("Digite el número A:")
                        val A: Int = readLine()!!.toInt()
                        println("Ingrese el número B")
                        val B: Int = readLine()!!.toInt()
                        if (A < 0 || B < 0) {
                            val addition = (A + B)
                            println("E resultado de la suma es: $addition")
                        } else if ((A > 0) || (B > 0)) {
                            val multiplication = (A * B)
                            println("El resultado de la multiplicación es: $multiplication")
                        } else {
                            println("Ingrese un número valido")
                        }
                    }

                    7 -> {
                        println("Determine si un año es bisiesto o no")
                        println("Ingrese un año")
                        val year: Int = readLine()!!.toInt()
                        if (year % 4 == 0) {
                            if (year % 100 == 0) {
                                year % 400 == 0
                                println("El año $year es bisiestro")
                            } else {
                                println("El año $year no es bisiestro")
                            }
                        } else {
                            println("El año $year no es bisiestro")
                        }
                    }
                    99 ->{
                        println("¡Bay!")
                    }
                    else -> println("Opción inválida, por favor seleccione nuevamente.")

                }
            }

            3 -> {
                println("----------- MENÚ CICLOS-----------")
                println("1. Imprimir todos los múltiplos de 3 que hay entre 1 y 100.")
                println("2. Imprimir los números impares entre 0 y 100.")
                println("3. Imprimir los números pares del 1 al 100.")
                println("4. Escribir un programa que imprima por pantalla los cuadrados de los números del 1 al 30")
                println(
                    "5. Escribir un programa que sume los cuadrados de los cien primeros números naturales,\n" +
                            "mostrando el resultado en pantalla"
                )
                println(
                    "6. Dados dos números naturales, el primero menor que el segundo, generar y mostrar todos los\n" +
                            "números comprendidos entre ellos en secuencia ascendente."
                )
                println("7. Sumar todos los números que se digitan por teclado mientras no sea cero.")
                println("99. Salir")
                println("-----------------------------")
                val exercise: Int = readLine()!!.toInt()
                when (exercise) {
                    1 -> {
                        println("1. Imprimir todos los múltiplos de 3 que hay entre 1 y 100.")
                        for (number in 1..100) {
                            if (number % 3 == 0) {
                                println(number)
                            }
                        }
                    }

                    2 -> {
                        println("2. Imprimir los números impares entre 0 y 100.")
                        for (number in 1..100 step 2) {
                            println(number)
                        }
                    }

                    3 -> {
                        println("3. Imprimir los números pares del 1 al 100.")
                        for (number in 1..100 step 2) {
                            println(number)
                        }
                    }

                    4 -> {
                        println("4. Los cuadrados de los números del 1 al 30")
                        for (i in 1..30) {
                            val square = i * i
                            println("El cuadrado de $i es: $square")
                        }
                    }

                    5 -> {
                        println("5. Escribir un programa que sume los cuadrados de los cien primeros números naturales, mostrando el resultado en pantalla")
                        var addition = 0
                        for (i in 1..100) {
                            val square = i * i
                            addition += square
                        }
                        println("La suma de los cuadrados es: $addition")
                    }

                    6 -> {
                        println(
                            "6. Dados dos números naturales, el primero menor que el segundo, generar y mostrar todos los\n" +
                                    "números comprendidos entre ellos en secuencia ascendente."
                        )
                        val number1 = 7
                        val number2 = 18
                        if (number1 < number2) {
                            println("Comprendidos con $number1 y $number2 en ascendente")
                            for (i in number1 + 1 until number2) {
                                println(i)
                            }
                        } else {
                            println("El primer nujmero debe ser menor al segundo")
                        }
                    }

                    7 -> {
                        println("7. Sumar todos los números que se digitan por teclado mientras no sea cero")
                        var addition = 0

                        println("Ingrese un número o 0 para terminar")
                        val input: Int = readLine()!!.toInt()

                        while (input != 0) {
                            addition += input
                            println("Ingrese otro número o 0 para terminar")
                            val input: Int = readLine()!!.toInt()
                        }
                        println("La suma total de los números es: $addition")
                    }
                    99 ->{
                        println("¡Bay!")
                    }
                    else -> println("Opción inválida, por favor seleccione nuevamente.")
                }
            }
        }
    } while (option != 99)
}
