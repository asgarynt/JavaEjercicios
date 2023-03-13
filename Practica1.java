package PracticaJava1;

import java.time.LocalTime;

import java.util.Scanner;

public class Practica {

	static Scanner s = new Scanner(System.in);

	static String triangleValidator() {
		System.out.println("\nEjercicio 1: Area de un triangulo teniendo sus tres lados");

		System.out.println("Ingresa la medida del lado a del triangulo");
		double a = s.nextDouble();
		System.out.println("Ingresa la medida del lado b del triangulo");
		double b = s.nextDouble();
		System.out.println("Ingresa la medida del lado c del triangulo");
		double c = s.nextDouble();

		if (a + b > c && a + c > b && c + b > a) {
			double semiperimetro = (a + b + c) / 2;
			double areaSqrt = (semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
			double area = Math.sqrt(areaSqrt);
			return "El área del triangulo es: " + area;
		} else {
			return "No Forma un triangulo";
		}
	}

	static String circle() {
		System.out.println("\nEjercicio 2: Area y circunferencia de un circulo mediante el radio");

		System.out.println("Ingresa la medida del radio");
		double radio = s.nextDouble();

		double diametro = Math.PI * Math.PI * radio;
		double area = Math.PI * radio * radio;
		return "El area del círculo es: " + area + "\nEl diametro del círculo es: " + diametro;
	}

	static String mostrarHoraDelSistema() {
		System.out.println("\nEjercicio 3: Hora en la consola");
		LocalTime horaActual = LocalTime.now();
		return "La hora actual del sistema es: " + horaActual;
	}

	static String secondsTo() {
		System.out.println("\nEjercicio 4: Segundos a horas y minutos");

		System.out.println("Ingresa los segundos a convertir en horas y minutos");
		double seconds = s.nextDouble();

		double hours = seconds / 3600;
		double minutes = seconds / 60;
		return seconds + " segundos ==  " + hours + " horas == " + minutes + " minutos";

	}

	static String volumeSphere() {
		System.out.println("\nEjercicio 5: Volumen de una esfera");

		System.out.println("Ingresa el radio de la esfera");
		double radio = s.nextDouble();
		double volumen = (double) 4 / 3 * Math.PI * Math.pow(radio, 3);
		return "El volumen de la esfera es: " + volumen;
	}

	static String volumeCone() {
		System.out.println("\nEjercicio 6: Volumen de un cono");
		System.out.println("Ingresa el radio del cono");
		double radio = s.nextDouble();
		System.out.println("Ingresa la altura del cono");
		double height = s.nextDouble();

		double volumen = (double) 1 / 3 * Math.PI * Math.pow(radio, 2) * height;
		return "El volumen del cono es: " + volumen;
	}

	static String areaCube() {
		System.out.println("\nEjercicio 7: Area superficial de un cubo mediante un lado");

		System.out.println("Ingresa la medida del lado");
		double side = s.nextDouble();
		return "El area superficial del cubo es: " + (6 * (Math.pow(side, 2)));

	}

	static String leapYear() {
		System.out.println("\nEjercicio 8: Ingresa un año");

		System.out.println("Ingresa el año");

		int year = s.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return "Es un año bisiesto";
		} else {
			return "No es un año bisiesto";
		}
	}

	static void primeNumbers() {
		System.out.println("\nEjercicio 9: Mostrar en pantalla los primeros 100 numeros primos");
		int primeNum = 2;
		for (int i = 0; i < 100; i++) {
			if (primeNum % 2 == 0) {
				System.out.print(primeNum + " ");
				primeNum += 2;
			}
		}
	}

	static int sumTwoNumbers(int numA, int numB) {
		while (numB != 0) {
			int sumaSinAcarreo = numA ^ numB;
			int acarreo = (numA & numB) << 1;
			numA = sumaSinAcarreo;
			numB = acarreo;
		}
		return numA;
	}

	static boolean palindromeNumber(int num) {
		int num1 = num / 10;
		int num2 = num % 10;
		return num1 == num2;
	}

	static String sumDigits(int num) {
		if (99 >= num && num >= 10) {
			int num1 = num / 10;
			int num2 = num % 10;
			return "La suma de ambos digitos es: " + (num1 + num2);
		}
		return "No es un número que cumpla las condiciones";
	}

	static String removeSpace(String n) {
		System.out.println("\nEjercicio 13: Remover espacios");
		return n.replaceAll("\\s", "");
	}

	static String invertString(String text) {
		System.out.println("\n\nEjercicio 14: Revertir un String");
		return new StringBuilder(text).reverse().toString();
	}

	static int factorialNum(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorialNum(n - 1);
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// EJERCICIOS 1 SECCIÓN

		// Pedir 2 numeros (x), (y)
		// Enteros
		System.out.println("Escribe dos numeros enteros");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println(x);
		System.out.println(y);

		// 1. Convertir a double cada numero
		double doubleX = (double) x;
		double doubleY = (double) y;
		System.out.println(doubleX);
		System.out.println(doubleY);

		// 2. Tomar las variables enteras y convertir a datos binarios.
		String binariox = Integer.toBinaryString(x);
		String binarioy = Integer.toBinaryString(y);
		int binariointx = Integer.parseInt(binariox);
		int binariointy = Integer.parseInt(binarioy);
		System.out.println(binariointx);
		System.out.println(binariointy);

		// 3. Mostrar el numero mayor
		int numMax = Math.max(x, y);
		System.out.println(numMax);

		// 4. Obtener el promedio de (x) y (y)
		double avg = (double) (x + y) / 2;
		System.out.println(avg);

		// EJERCICIOS 2 SECCION

		// 1. Escribir un metodo para encontrar el area de un triangulo a partir de 3
		// lados ingresados
		// Revisar si es un triangulo válido
		System.out.println(triangleValidator());

		// 2 Escribir un metodo para encontrar el area y la circunferencia de un
		// circuclo dado el radio
		// Utilizar PI de la libreria JAVA
		System.out.println(circle());

		// 3 Escribir un metodo que muestre por consola la hora del sistema
		// Utilizar e investigar la libreria de java
		System.out.println(mostrarHoraDelSistema());

		// 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos,
		// segundos) segun sea
		// Ej 3600 = "1 hora" = "60 min" = 3600 seg
		System.out.println(secondsTo());

		// 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
		System.out.println(volumeSphere());

		// 6 Escribir un metodo para encontrar el volumen de un cono dado el radio y la
		// altura
		System.out.println(volumeCone());

		// 7 Encontrar el area superficial de un cubo dado un lado a
		System.out.println(areaCube());

		// 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
		System.out.println(leapYear());

		// EJERCICIOS 3 SECCION

		// 9. Escribir mostrar en pantalla los primeros 100 numeros primos
		primeNumbers();

		// 10. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos
		System.out.println("\n\nEjercicio 10: Sumar dos numeros sin operador aritmetico");
		System.out.println(sumTwoNumbers(10, 8));

		// 11. Escribir un método para verificar si un numero positivo de 2 digitos es
		// palindromo
		System.out.println("\n\nEjercicio 11: Verificar si un numero positivo de 2 digitos es palindromo");
		System.out.println(palindromeNumber(11));

		// 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un
		// numero donde 99 >= n >= 10
		System.out.println("\n\nEjercicio 12: Escribir un metodo para sumar los digitos de un número");
		System.out.println(sumDigits(82));

		// 13. Escribir un método para remover espacios en blanco de un String. ej ->
		// "Hola Mundo" -> "HolaMundo"
		System.out.println("\n" + removeSpace("Hola mundo"));

		// 14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" ---
		// Sin usar loops
		System.out.println(invertString("hola"));

		// 15. Escribir un metodo para encontrar el factorial de un numero sin loops
		System.out.println("\n\nEjercicio 15: Factorial de un numero sin loops");
		System.out.println(factorialNum(6));

	}

}
