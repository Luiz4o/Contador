/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador;

import excecao.ParametrosInvalidosException;
import java.util.Scanner;

/**
 *
 * @author henri
 */
public class Contador {
    public static void contar(int primeiroParametro,int segundoParametro)throws ParametrosInvalidosException{
        if(primeiroParametro > segundoParametro){
            System.out.println("Parâmetros inválidos para a contagem,o primeiro parâmetro deve ser menor que o segundo");
        }else {
            int contagem= segundoParametro-primeiroParametro;
            for(int i=1;i<=contagem;i++){
                System.out.printf("Contando %d... \n",i);
            }
        }
        
        
    }
    
    
}
