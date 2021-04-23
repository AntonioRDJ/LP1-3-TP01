/*
  Vitor Hugo Chaves Silva Reis
  Antonio Rodrigues Dantas Junior

  10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e 
  exibir sua temperatura equivalente em Fahrenheit.
*/

import java.util.Scanner;

public class tp01exercicio10 {
   public static void main(String[] args){
	   
       Scanner sc = new Scanner(System.in);
	   
       System.out.print("Digite a temperatura em graus Celsius: ");
       double c = sc.nextDouble();
	   
       double f = (c * 1.8) + 32;
	   
       System.out.print("A temperatura em Fahrenheint é: " + f);
	   
       sc.close();
   } 
}