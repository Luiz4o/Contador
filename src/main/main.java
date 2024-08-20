
package main;

import contador.Contador;
import excecao.ParametrosInvalidosException;
import java.util.Scanner;

public class main{
  public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Informe o primeiro parâmetro");
        int primeiroParametro= read.nextInt();
        System.out.println("Informe o segundo parâmetro");
        int segundoParametro= read.nextInt();
        try{
        Contador.contar(primeiroParametro, segundoParametro);
        } catch(ParametrosInvalidosException e){
            System.out.println("Hoube um erro na contagem, verifique os parâmetros fornecidos e tente novamente");
        }
  }
}

