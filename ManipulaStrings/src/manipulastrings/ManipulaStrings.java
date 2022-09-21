
package manipulastrings;

import java.util.Scanner;


public class ManipulaStrings {

    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
       int op;
       do{
           System.out.println(">>>>>>>>>MENU<<<<<<<<<<");
           System.out.println("1 - Tamanho String");
           System.out.println("2 - árvore de letras");
           
           
           
           System.out.println("0 - Sair");
           System.out.println("Insira a opção pretendida");
           op = ler.nextInt();
           switch(op){
               case 0: break;
               case 1:
                   System.out.println("A string Inserida tem: "+
                   ExerciciosStrings.contaCaracteres()+" caracteres");
                   break;
                   /*int t = ExerciciosStrings.contaCaracteres();
                   System.out.println("A string inserida tem; "+t+" caracteres");
                   */
               case 2: 
                   ExerciciosStrings.arvoreCharAt(); break;
               
               default:
                   System.out.println("Insira opção válida");
           }    
           
       }while(op!=0);
    }
    
}
