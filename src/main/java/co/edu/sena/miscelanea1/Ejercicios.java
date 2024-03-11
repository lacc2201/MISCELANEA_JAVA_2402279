package co.edu.sena.miscelanea1;

public class Ejercicios {
    
    public double areaTriangulo(double dato1, double dato2){
        return (dato1 * dato2) / 2;
    }


    public double Suma(double dato1, double dato2){
        return dato1 + dato2;
    }


    public double Elevado(double dato1){
        return dato1 * dato1;
    }


    public double Conversion(double dato1){
        return dato1 * 1.08;
    }

    public double calcularArea(double dato1){
        return dato1 * dato1;
    }
        
    public double calcularPerimetro(double dato1){
        return 4 * dato1;
    }
    
    public double calcularAreaBase(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double calcularVolumen(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    public double calcularLongitud(double radio2) {
        return 2 * Math.PI * radio2;
    }
    
    public double calcularAreaCirculoInscrito(double radio2) {
        return Math.PI * Math.pow(radio2, 2);
    }
    public double calcularPromedio(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    //CONDICIONALES

    public String PositivoNegativo(double numero) {
        if(numero > 0) {
            return "El número ingresado es positivo";
    }else if(numero < 0) {
        return "El número ingresado es negativo";
    } else{
        return "El número ingresado es cero";
    }
    }

    public String mayor_menor(double dato1, double dato2) {
        if(dato1 > dato2) {
            return "El primer numero ingresado es mayor y el segundo es menor";
        }else if(dato2 > dato1) {
            return "El segundo numero ingresado es mayor y el primero es menor";
        } else{
            return "los dos numeros son iguales";
    }
    }

    public static void mayorymenor(double dato1, double dato2, double dato3) {
        if (dato1 > dato2 && dato1 > dato3) {
            if (dato2 > dato3) {
                System.out.println(dato1 + " es el número mayor y " + dato3 + " es el número menor");
            } else {
                System.out.println(dato1 + " es el número mayor y " + dato2 + " es el número menor");
            }
        } else if (dato2 > dato1 && dato2 > dato3) {
            if (dato3 > dato1) {
                System.out.println(dato2 + " es el número mayor y " + dato1 + " es el número menor");
            } else {
                System.out.println(dato2 + " es el número mayor y " + dato3 + " es el número menor");
            }
        } else if (dato3 > dato1 && dato3 > dato2) {
            if (dato3 > dato1) {
                System.out.println(dato3 + " es el número mayor y " + dato1 + " es el número menor");
            } else {
                System.out.println(dato3 + " es el número mayor y " + dato2 + " es el número menor");
            }
        }
    }

    public double AmenorB(double dato1, double dato2){
        if (dato1 < dato2) {
            return dato1 + dato2;
        } else {
            return dato1 - dato2;
        }
    }

    public static void cociente(double dato1, double dato2, double dato3) {
        if (dato2 == 0) {
            System.out.println("La division por cero no es posible.");
        } else if (dato1 < dato2) {
            dato3 = (double) dato1 / dato2;
            System.out.println("El resultado es: " + dato3);
        } else {
            dato3 = dato1 - dato2;
            System.out.println("El resultado es: " + dato3);
        }
    }
    public static void sumaNegoMul(double dato1, double dato2) {
        if (dato1 < 0 || dato2 < 0) {
            double sum = dato1 + dato2;
            System.out.println("Al menos uno de los números es negativo, la suma es: " + sum);
        } else {
            double product = dato1 * dato2;
            System.out.println("Ninguno de los números es negativo, el producto es: " + product);
        }
    }

    public static void verifiAño(int año) {
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println(año + " es un año bisiesto");
        } else {
            System.out.println(año + " no es un año bisiesto");
        }
    }
}
