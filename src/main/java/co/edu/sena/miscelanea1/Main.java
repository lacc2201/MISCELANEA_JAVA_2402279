package co.edu.sena.miscelanea1;

import java.util.Scanner;

public class Main {
    public static void main ( String[] args ){
        double dato1;
        double dato2;
        double dato3;
        double dato4;
        String dato5;

    //Area triangulo
    
    Ejercicios ejercicios = new Ejercicios();
    
    System.out.println(" Calcular el área de un triángulo");
    Scanner scr = new Scanner(System.in);
    
    System.out.println("Ingrese la base del triángulo: ");
    dato1 = scr.nextDouble();
    
    System.out.println("Ingrese la base del triángulo: ");
    dato2 = scr.nextDouble();
    
    dato3 = ejercicios.areaTriangulo(dato1, dato2);
    System.out.println("El área del triánguo es: " + dato3);


    //Sumar números digitados

    System.out.println(" Sumar dos números" );
    Scanner suma = new Scanner(System.in);
    
    System.out.println("Ingrese el primer número");
    dato1 = suma.nextDouble();
    System.out.println("Ingrese el segundo número");
    dato2 = suma.nextDouble();
    
    dato3 = ejercicios.Suma(dato1, dato2);
    System.out.println("La suma de los dos número es: " + dato3);


    //Número elevado al cuadrado

    System.out.println(" Número elvado al cuadrado" );
    Scanner eleva = new Scanner(System.in);
    
    System.out.println("Ingrese un número");
    dato1 = eleva.nextDouble();
    
    dato3 = ejercicios.Elevado(dato1);
    System.out.println("El número elevado al cuadrado es: " + dato3);
    

    //Euros a doláres

    System.out.println("Convertir de euros a doláres" );
    Scanner con = new Scanner(System.in);
    
    System.out.println("Ingrese un valor en euros");
    
    dato1 = con.nextDouble();
    
    dato3 = ejercicios.Conversion(dato1);
    System.out.println("El valor en doláres es: " + dato3);


    //Area y perimetro

    System.out.println("Area y perimetro de un cuadrado" );
    Scanner lado = new Scanner(System.in);
    
    System.out.print("Ingrese el lado del cuadrado: ");
    dato1 = lado.nextDouble();
    double area = ejercicios.calcularArea(dato1);
    double perimetro = ejercicios.calcularPerimetro(dato1);

    System.out.println("El área del cuadrado es: " + area);
    System.out.println("El perímetro del cuadrado es: " + perimetro);

    //Area y volumen de cilindro
    System.out.println("Area y volumen de un cilindro" );
    Scanner cilindro = new Scanner(System.in);

    System.out.print("Ingrese el radio del cilindro: ");
        double radio = cilindro.nextDouble();
        
    System.out.print("Ingrese la altura del cilindro: ");
        double altura = cilindro.nextDouble();
        double areaBase = ejercicios.calcularAreaBase(radio);
        double volumen = ejercicios.calcularVolumen(radio, altura);
        
    System.out.println("El área de la base del cilindro es: " + areaBase);
    System.out.println("El volumen del cilindro es: " + volumen);


    //Circunferencia
    System.out.println("Circunferencia y area de un circulo inscrito" );
    Scanner circunferencia = new Scanner(System.in);

    System.out.print("Ingrese el radio de la circunferencia: ");
        double radio2 = circunferencia.nextDouble();
        
        double longitud = ejercicios.calcularLongitud(radio2);
        double areaCirculoInscrito = ejercicios.calcularAreaCirculoInscrito(radio2);
        
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área del círculo inscrito es: " + areaCirculoInscrito);
    
    
    //Promedio

    System.out.println("Promedio de tres numeros digitados" );
    Scanner calcularPromedio = new Scanner(System.in);

    System.out.print("Ingrese el primer número: ");
        double num1 = calcularPromedio.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = calcularPromedio.nextDouble();
        
        System.out.print("Ingrese el tercer número: ");
        double num3 = calcularPromedio.nextDouble();
        
        double promedio = ejercicios.calcularPromedio(num1, num2, num3);
        
        System.out.println("El promedio de los tres números ingresados es: " + promedio);

    
    //CONDICIONALES
    //Positivo o negativo
    System.out.println("Positivo o Negativo");
    System.out.println("Ingrese un número");
    dato1 = scr.nextDouble();
    dato5 = ejercicios.PositivoNegativo(dato1);
    System.out.println(dato5);


    //Mayor o menor
    System.out.println("Mayor o menor");
    Scanner mayor_menor = new Scanner(System.in);

    System.out.println("Ingrese el primer numero");
    dato1 = scr.nextDouble();

    System.out.println("Ingrese el segundo numero");
    dato2 = scr.nextDouble();

    dato5 = ejercicios.mayor_menor(dato1,dato2);
    System.out.println(dato5);


    //Numero escrito mayor y menor
    System.out.println("Mayor y menor");
    Scanner mayorymenor = new Scanner(System.in);

    System.out.println("Ingrese el primer número");
    dato1 = scr.nextDouble();

    System.out.println("Ingrese el segundo número");
    dato2 = scr.nextDouble();

    System.out.println("Ingrese el tercer número");
    dato3 = scr.nextDouble();

    ejercicios.mayorymenor( dato1, dato2, dato3);


    //A < B
    System.out.println("A menor que B: suma, de lo contrario resta");
    Scanner AmenorB = new Scanner(System.in);

    System.out.println("Ingrese el primer número(A)");
    dato1 = scr.nextDouble();

    System.out.println("Ingrese el segundo número(B)");
    dato2= scr.nextDouble();

    double resultado = ejercicios.AmenorB(dato1, dato2);
    System.out.println("El resultado de la suma o resta dependiendo el numero si A es menor que B es: " + resultado);


    //cociente
    System.out.println("Cociente entre A y B");
    Scanner cociente = new Scanner(System.in);

    System.out.println("Ingrese el primer numero(A)");
    dato1 = scr.nextDouble();

    System.out.println("Ingrese el segundo numero(B)");
    dato2 = scr.nextDouble();

    ejercicios.cociente(dato1,dato2, dato3);
    

    // suma de numeros negativos
    System.out.println("Suma de numeros negativos o multiplicacion de positivos");
    Scanner sumaNegoMul = new Scanner(System.in);

    System.out.print("Ingresa el primer número: ");
    dato1 = scr.nextDouble();

    System.out.print("Ingresa el segundo número: ");
    dato2 = scr.nextDouble();

    ejercicios.sumaNegoMul(dato1, dato2);

    //Año bisiesto
    System.out.println("Año bisiesto: si es o no es");
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa el año: ");
    int año = scanner.nextInt();

    ejercicios.verifiAño(año);
}
}