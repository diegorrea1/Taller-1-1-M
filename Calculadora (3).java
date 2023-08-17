

import java.util.Scanner;


public class Calculadora {

    
   
         public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.println("Escriba la operacion que quiere hacer");
          System.out.println("1. suma");
          System.out.println("2. resta");
          System.out.println("3. multiplicacion");
          System.out.println("4. division");
          System.out.println("5. seno");
          System.out.println("6. coseno");
          System.out.println("7. tangente");
          System.out.println("8. potencia");
    
          char operacion = sc.next().charAt(0);

          System.out.println("Escriba el primer numero: ");
          float num1 = sc.nextFloat();
          
          System.out.println("Escriba el segundo numero: ");
          int num2 = sc.nextInt();
          float resultado;

          switch(operacion) {
            case '1':
                  resultado = num1 + num2;
                  operacion = '+';
                  break;
            case '2':
                  resultado = num1 - num2;
                  operacion = '-';
                  break;      
            case '3':
                  resultado = num1 * num2;
                  operacion = '*';
                  break;      
            case '4':
                  resultado = num1 / num2;
                  operacion = '/';
                  if(num2==0){
                      System.out.println("***ERROR***");
                  }
                  break;
            case '5':
                  int resultado2 = (int) Math.toRadians(num1);
                  resultado = (float) Math.sin(resultado2);  
                  
                  break; 

              case '6':      
                  int resultado3 = (int) Math.toRadians(num1);
                  resultado = (float) Math.cos(resultado3);
                  
                  break; 

              case '7':
                  int resultado4 = (int) Math.toRadians(num1);
                  resultado = (float) Math.tan(resultado4);
                 
                  break;
            case '8':
                resultado = (float)Math.pow(num1,num2);
                operacion = '^';
                break;

              default:
                  System.out.println("**Operacion invalida**");
                  return;
          }
          System.out.println("El resultado es: ");
          System.out.println(num1 + " " + operacion + " " + num2 + " = " + resultado);
      }
  }


    
    