
package javadia3;

import java.util.Scanner;


public class JavaDia3 {
    public static int factorialOf(int num){
            int prod = 1;
            while(num>0)
            {
                prod = prod*num;
                num--;
            }
        return prod;
        }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner (System.in);
        System.out.println("Ingrese el numero del ejercicio: ");
        String opcion=teclado.nextLine();
        
        
        
        switch (opcion){
            case "1"://programa para imprimir todos los números naturales del 1 al n.
                int n =teclado.nextInt();
                for (int i=1; i<=n; i++){
                    System.out.println(i);
                }
                break;
                
            case "2"://programa para imprimir todos los números naturales en orden inverso.
                int nu =teclado.nextInt();
                
                while (nu!=0){
                    nu--;
                    System.out.println(nu+1);
                    
                }
                break;
                
            case "3"://programa para imprimir tablas de multiplicar.
                System.out.println("Ingrese la tabla de multiplicar:");
                int tabla=teclado.nextInt();
                for (int i=1; i<=10;i++){
                    int multip=tabla*i;
                    System.out.println(tabla+"x"+i+"="+multip);
                }
                break;
                
            case "4"://programa para imprimir tablas de multiplicar en orden inverso.
                System.out.println("Ingrese la tabla de multiplicar:");
                int tabla2=teclado.nextInt();
                for (int i=10; i>=1;i--){
                    int multip=tabla2*i;
                    System.out.println(tabla2+"x"+i+"="+multip);
                }
                break;
                
                
            case "5"://programa para imprimir todas las letras del alfabeto de la 'a' a la 'z'.
                String [] letras={"A","B","C","D","E","F", "G","H","I","J", "K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
                for(int i=0;i<letras.length;i++){
                    System.out.println(letras[i]);
                }
                break;
                
            case "6"://programa para imprimir el alfabeto en orden inverso, de la 'Z' a la 'A'.
                String [] letrass={"A","B","C","D","E","F", "G","H","I","J", "K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
                int cant=letrass.length;
                while (cant!=0){
                    cant--;
                    System.out.println(letrass[cant]);
                }
                break;
                
            case "7"://programa para imprimir todos los números pares entre 1 y 100.
                for (int i=1; i<=100;i++){
                    
                    if (i%2==0){
                        System.out.println(i);
                    }
                    
                }
                break;
                
            case "8"://programa para imprimir todos los números impares entre 1 y 100.
                for (int i=1; i<=100;i++){
                    
                    if (i%2!=0){
                        System.out.println(i);
                    }
                }
                break;
                
            case "9"://programa para encontrar la suma de todos los números naturales entre 1 y n.
                System.out.println("Ingrese n");
                int num=teclado.nextInt();
                int total=0;
                for (int i=1; i<=num;i++){
                    total+=i;
                    
                }
                System.out.println(total);
                break;
            case "10"://programa para encontrar la suma de todos los números pares entre 1 y n.
                System.out.println("Ingrese n");
                int nume=teclado.nextInt();
                int total2=0;
                for (int i=1; i<=nume;i++){
                    if (i%2==0){
                        total2+=i;
                    }
                    
                }
                System.out.println(total2);
                break;
                
            case "11"://Escribe un programa para encontrar la suma de todos los números impares entre 1 y n.
                int numer=teclado.nextInt();
                int total3=0;
                for (int i=1; i<=numer;i++){
                    if (i%2!=0){
                        total3+=i;
                    }
                }
                System.out.println(total3);
                break;
                
            case "12"://programa para imprimir los valores ASCII.
                for (int i=0; i<=255; i++){
                    System.out.println(i + " Valores ASCII: "+ (char)i);
                }
                break;
                
            case "13"://programa para encontrar el factorial de cualquier número.
                // formula 3 =3*2*1=6
                System.out.println("Ingrese un numero para saber el factorial:");
                int numeroFac=teclado.nextInt();
                int resultadoo=1;
                if (numeroFac==0 || numeroFac==1){
                    resultadoo=1;
                }else if(numeroFac>1){
                    for(int i=1;i<=numeroFac;i++){
                    resultadoo*=i;
                    
                }
                System.out.println("el factorial es: " + resultadoo);

                
                }
                break;
                
            case "14"://programa para calcular el valor de un número elevado a la potencia de otro.
                // 2= 2 * 2 * 2 =8 el exponente es 3 ya que se repite el numero 3 veces
                System.out.println("Ingrese el numero al cual le quieres calcular la potencia:");
                int numeroPot=teclado.nextInt();
                System.out.println("Ingrese el numero el cual va a ser el exponente: ");
                int exponente=teclado.nextInt();
                int result=1;
                for (int i=0; i<exponente;i++){
                    result*=numeroPot;
                }
                System.out.println("El valor es: "+ result);
                break;
                
            case "15"://programa para invertir los dígitos de un número dado.
                System.out.println("Ingrese un numero:");
                int numeIn=teclado.nextInt();
                int numeInvert=0;
                while (numeIn !=0){
                    int digito=numeIn %10;// se extrae el residuo
                    numeInvert=numeInvert* 10+digito;
                    numeIn=numeIn/10;
                }
                System.out.println("El numero invertido es: "+ numeInvert);
                break;
                
            case "16"://programa para calcular la suma de los dígitos de un número.
                System.out.println("Ingrese un numero");
                int numeroo1=teclado.nextInt();
                int suma=0;
                while (numeroo1 !=0){
                    int digito2=numeroo1 %10;// se extrae el residuo
                    suma=digito2;
                    numeroo1=numeroo1/10;
                }
                System.out.println("La suma de los digitos es: "+ suma);
                break;
                
            case "17"://programa para verificar si un número dado es primo o no.
                // El numero primo solo es divisible por 1 y por el mismo
                int num1=teclado.nextInt();
                 
                if (num1<=1){
                    System.out.println("El numero no es primo");
                }
                else if(num1>1){
                    for(int i = 2; i < num1; i++) {
                        if (num1 % i == 0) {
                            System.out.println("El numero no es primo");
                            break;
                        }
                        else if(num1 % i !=0){
                            System.out.println("El numero es primo");
                            break;
                        
                        }
                    }
                }
               
                break;
                
            case "18"://programa para calcular el MCD (Máximo Común Divisor) de dos números dados.
                System.out.println("Ingrese el primer numero:");
                int primNum=teclado.nextInt();
                System.out.println("Ingrese el segundo numero:");
                int segNum=teclado.nextInt();
                
                while (segNum !=0){
                    int dato= segNum;
                    segNum= primNum% segNum;
                    primNum=dato;
                }
                System.out.println("El MCD es: " +primNum);
                break;
                
            case "19"://programa que permita ingresar números hasta que el usuario lo desee y, al final, muestre la
                    //cantidad de números positivos, negativos y ceros ingresados.
                int positivos=0;
                int negativos=0;
                int ceros=0;
                int respuest;
                do{
                    System.out.println("Ingrese un numero:");
                    int numerro=teclado.nextInt();
                    if (numerro > 0){
                        positivos++;
                    }
                    else if(numerro<0){
                        negativos++;
                    }
                    else{
                        ceros++;
                    }
                    System.out.println("Quieres seguir ingresando otro numero (1=si / 2=no)");
                    respuest=teclado.nextInt();
                    
                }while (respuest==1);
                System.out.println("positivos: "+ positivos);
                System.out.println("negativos: "+ negativos);
                System.out.println("Ceros: "+ ceros);
                break;
                
            case "20"://programa que permita ingresar números hasta que el usuario lo desee y, al final, muestre el
                    //número más grande y el más pequeño ingresado.
                int numerro;
                int mayor=Integer.MIN_VALUE;
                int menor=Integer.MAX_VALUE;
                int respuest2=0;
                
                do{
                    System.out.println("Ingrese un numero:");
                    numerro=teclado.nextInt();
                    if (numerro > mayor){
                        mayor=numerro;
                    }
                    else if(numerro<menor){
                        menor=numerro;
                    }
                   
                    System.out.println("Quieres seguir ingresando otro numero (1=si / 2=no)");
                    respuest2=teclado.nextInt();
                    
                }while (respuest2==1);
                System.out.println("el numero mas grande es:"+ mayor);
                System.out.println("el numero mas pequeño es:"+ menor);
                break;
                   
         
            case "21"://programa para encontrar los números y la suma de todos los enteros entre 100 y 200 que sean
                //divisibles por 9.
                int total4=0;
                for (int i=100; i<=200;i++){
                    if (i%2==0){
                        if(i%9==0){
                            total4+=i;
                            
                        }
                    }
                }
                System.out.println(total4);
                break;
                
            case "22"://programa para convertir un número binario a decimal sin usar arreglos, 
                //funciones ni bucles while.
                System.out.println("Ingrese un numero binario:");
                String numeBinari=teclado.nextLine();
                int decimal=0;
                for (int i=0; i <numeBinari.length(); i++ ){
                    char dato= numeBinari.charAt(i);
                    
                    int Numero=Character.getNumericValue(dato);
                    int potencia=numeBinari.length()-1-i;
                    decimal+= Numero*potencia;
                }
                System.out.println("El numero en decimal es: "+ decimal);
                
            case "23"://programa para verificar si un número es un Número Fuerte o no. 
                System.out.println("Ingrese un numero para verificar si es fuerte:");
                int nuum=teclado.nextInt();
                int temp= nuum, remainder, sum=0;
                while (temp>0){
                    remainder=temp%10;
                    sum+=factorialOf(remainder);
                    temp=temp /10;
                    
                }
                if(sum==nuum){
                    System.out.println("El numero es fuerte");
                }
                else{
                    System.out.println("El numero no es fuerte");
                }
                break;
                
            
                
            case "24"://programa para convertir un número hexadecimal a decimal.
                System.out.println("Ingrese un numero hexadecimal:");
                String hex=teclado.next();
                int decimall=Integer.parseInt(hex,16);
                System.out.println("Decimal:"+ decimall);
                break;
                
            case "25"://programa para convertir un número hexadecimal a octal.
                System.out.println("Ingrese un numero hexadecimal:");
                String hexa=teclado.next();
                int decimall2=Integer.parseInt(hexa,16);
                String Octal2=Integer.toOctalString(decimall2);
                System.out.println("El numero hexadecimal: "+hexa+" en octal es:"+ Octal2);
                break;
                
            case "26"://programa para convertir un número hexadecimal a binario.
                System.out.println("Ingrese un numero hexadecimal:");
                String hexa2=teclado.next();
                int decimall3=Integer.parseInt(hexa2,16);
                String binario3=Integer.toBinaryString(decimall3);
                System.out.println("El numero hexadecimal "+ hexa2+ " en binario es: "+ binario3);
                break;
                
                
                
            case "27"://programa para convertir un número decimal a hexadecimal.
                System.out.println("Ingrese un numero decimal que quieras combertir a hexadecimal");
                int nnumeer=teclado.nextInt();
                String Hexadecimal=Integer.toHexString(nnumeer);
                System.out.println("El numero decimal "+ nnumeer+" en hexadecimal es: "+ Hexadecimal);
                break;
                
            case "28"://programa para convertir un número decimal a octal.
                System.out.println("Ingrese un numero decimal que quieras combertir a octal");
                int nnumee=teclado.nextInt();
                String Octal=Integer.toOctalString(nnumee);
                System.out.println("El numero decimal "+ nnumee+" en octal es: "+ Octal);
                break;
                
                
            case "29"://programa para convertir un número decimal a binario.
                System.out.println("Ingrese el numero decimal que quieres convertir a binario:");
                int numee=teclado.nextInt();
                String binario=Integer.toBinaryString(numee);
                System.out.println("El numero decimal "+ numee+" en binario es: "+ binario);
                break;
                
            case "30"://programa para convertir un número binario a octal.
                System.out.println("Ingrese el numero binario que quieres convertir a octal:");
                String numee6=teclado.nextLine();
                String Octal5=Integer.toOctalString(Integer.parseInt(numee6, 2));
                System.out.println("El numero decimal "+ numee6+" en octal es: "+ Octal5);
                break;
                
            case "31"://programa para convertir un número binario a decimal.
                System.out.println("Ingrese el numero que quieres convertir de binario a decimal");
                String binaryNu=teclado.nextLine();
                int decimalNumbb=Integer.parseUnsignedInt(binaryNu, 2);
                System.out.println("El numero: "+ binaryNu+ " en decimal es: "+ decimalNumbb);
                break;
                
            case "32"://programa para convertir un número binario a hexadecimal.
                System.out.println("Ingrese el numero que quieres convertir de binario a hexadecimal");
                String binary2=teclado.nextLine();
                int decimalNumbb2=Integer.parseInt(binary2, 2);
                String Hexadecimal3=Integer.toHexString(decimalNumbb2);
                System.out.println("El numero: "+ binary2+ " en hexadecimal es: "+ Hexadecimal3);
                break;
                
            case "33"://programa para convertir un número octal a binario.
                System.out.println("Ingrese el numero que quieres convertir de octal a binario");
                String nuOctal2=teclado.nextLine();
                String Binar=Integer.toBinaryString(Integer.parseInt(nuOctal2, 8));
                System.out.println("El numero "+ nuOctal2+ " en binario "+ Binar);
                break;
                
            case "34"://programa para convertir un número octal a decimal.
                System.out.println("Ingrese el numero que quieres convertir de octal a binario");
                String nuOctaal=teclado.nextLine();
                int decimmal=Integer.parseInt(nuOctaal,8);
                System.out.println("El numero "+ nuOctaal+ " en decimal es: "+ decimmal);
                break;
                
            case "35"://programa para convertir un número octal a hexadecimal.
                System.out.println("Ingrese el numero que quieres convertir de octal a binario");
                String nuOctaal5=teclado.nextLine();
                int decimmal5=Integer.parseInt(nuOctaal5,8);
                String Hexadecimal5=Integer.toHexString(decimmal5);
                System.out.println("El numero "+ nuOctaal5+ " en decimal es: "+ Hexadecimal5);
                break;
                
            case "36"://programa para encontrar el complemento a 1 de un número en Java.
                int nummee=teclado.nextInt();
                System.out.println("El complemento es: "+ ~nummee);
                break;
                
            case "37":
                System.out.println("");
                break;
                
            case "38"://programa para imprimir la serie de Fibonacci hasta n términos.
                System.out.println("Ingrese n para imprimir la serie Fibonacci");
                int nn=teclado.nextInt();
                
                break;

            case "45":
                System.out.println("Ingrese un numero para sacar sus factores primos: ");
                int numEntra=teclado.nextInt();
                int numm=2;
                while (numEntra!=1){
                    
                    while (numEntra% numm==0){
                        System.out.println(numm);
                        numEntra/=numm;
                        
                    }
                    numm++;
                }
                break;
                
            default: System.out.println("opcion invalida");
       
                
        }
        
    }
    
}
