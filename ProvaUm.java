// Por: Rogério Lopes da Silva Filho Curso: Ciência da Computação Github: @rogxrin

import java.util.Scanner;

public class ProvaUm {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
  
System.out.print("Insira o nome do funcionário: ");
String nome = scanner.nextLine();

System.out.print("Insira o peso atual dele em kg: ");
double peso = scanner.nextDouble();

System.out.print("Insira a quantidade de água já ingerida no dia, em litros: ");
double aguaIngerida = scanner.nextDouble();

double quantidadeIdealAgua = (peso * 35.0) / 1000.0;
double quantidadeAIngerir = quantidadeIdealAgua - aguaIngerida;

System.out.println("\nDados do funcionário:");
System.out.println("Nome: " + nome);
System.out.println("Peso: " + peso + " kg");
System.out.println("Quantidade de água já ingerida no dia: " + aguaIngerida + " litros");
System.out.println("Quantidade ideal de água a ser ingerida no dia: " + quantidadeIdealAgua + " litros");
      
      if (quantidadeAIngerir <= 0.0) {
         System.out.println("Parabéns,você atingiu a meta de hidratação diária!");
      } else {
         System.out.println("Continue se hidratando, por hoje ainda faltam " + Math.ceil(quantidadeAIngerir) + " litros! Você consegue!");
      }
      
      scanner.close();
   }
}