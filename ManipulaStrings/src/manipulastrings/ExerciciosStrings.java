
package manipulastrings;


class ExerciciosStrings {
    static String s, s1;
    static void lerStrings(String texto){
        System.out.println(texto);
        s = ManipulaStrings.ler.next();
        s1 = ManipulaStrings.ler.nextLine();
        s = s+s1;
        
    }
    static int contaCaracteres() { // sempre que nao está a void, vai ter de devolver um valor
        lerStrings("Insira um texto");
        return s.length();
    }

    static void arvoreCharAt() {
        int x,y;
        lerStrings("Insira uma palavra");
        for(x=0;x<s.length();x++){
            for(y=0;y<=x; y++){
                System.out.print(s.charAt(y));
            }
            System.out.println();
            
        }
        
        for(x=s.length()-1;x>=0;x--){
            for(y=0;y < x; y++){
                System.out.print(s.charAt(y));
            }
            System.out.println();
        
        }    
        
    }

    static void capitalizaLetras() {
    
      lerStrings("Insira um texto em maiusculas");
      System.out.println(s.toLowerCase());
      lerStrings("Insira um texto em minusculas");
      System.out.println(s.toUpperCase());
    }
    
}
