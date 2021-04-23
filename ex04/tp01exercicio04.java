/*
  Vitor Hugo Chaves Silva Reis
  Antonio Rodrigues Dantas Junior

  4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área. 
*/

import java.util.Scanner;

public class  tp01exercicio04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite o valor da base do triângulo: ");
        double base = sc.nextDouble();
		
        System.out.print("Digite o valor da altura do triângulo: ");
        double altura = sc.nextDouble();
		
        double area = (base * altura) / 2;
        System.out.print("A área do triângulo é: " + area);
		
        sc.close();
    }
    
}
