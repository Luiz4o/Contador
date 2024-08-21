
package main;

import contador.Contador;
import excecao.ParametrosInvalidosException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main{
  public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        try{
        System.out.println("Informe o primeiro parâmetro");
        int primeiroParametro= read.nextInt();
        System.out.println("Informe o segundo parâmetro");
        int segundoParametro= read.nextInt();

        Contador.contar(primeiroParametro, segundoParametro);
        } catch(ParametrosInvalidosException e){
            System.out.println("Houve um erro na contagem, verifique os parâmetros fornecidos e tente novamente");
        } catch (InputMismatchException e){
            System.out.println("Houve um erro na descrição dos parâmetros, verifique se os parâmetros fornecidos são números inteiros e tente novamente");

        }
  }
}

