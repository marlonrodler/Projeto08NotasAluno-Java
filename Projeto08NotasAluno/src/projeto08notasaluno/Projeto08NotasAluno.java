/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto08notasaluno;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Projeto08NotasAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Solicite ao usuario que informe o nome de um luno e suas tres notas 
        (de 0 a 10), e calcule a media e teste as condiçoes:
        1-se a media for menor ou igual a 5(reprova)
        2- se a media for menor ou igual a 7 (aprovado)
        3- se a media dor menr ou igual a 9 (muito bom)
        4- se a media for maior do que 9 (exelente) 
        
        */
        
        Scanner entrada = new Scanner(System.in);
        
        String nome, situacao; 
        float nota1, nota2, nota3, media;
        
        
        System.out.println("Inf o nome do aluno: ");
        nome = entrada.next();
        System.out.println("");
        System.out.println("Inf a 1º Nota: ");
        nota1 = entrada.nextInt();
        System.out.println("Inf a 2º Nota: ");
        nota2 = entrada.nextInt();
        System.out.println("Inf a 3º Nota: ");
        nota3 = entrada.nextInt();
        
        media = (nota1 + nota2 + nota3)/3;
       
        if(media <= 5){
            situacao = "Reprovado";
        }else if(media >= 5 && media <=7){
            situacao = "Aprovado";
        }else if(media >=7 && media <=9){
            situacao = "Muito Bom";
        }else{
            situacao = "Exelente";
        }
        
        System.out.println("");
        System.out.println("Aluno : " + nome);
        System.out.println("Media = "+ media);
        System.out.println("Situação = " + situacao);
        
         
        
        
        
        
        
        
    }
    
}
