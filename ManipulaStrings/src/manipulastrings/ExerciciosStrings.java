
package manipulastrings;


class ExerciciosStrings {

    static int contaCaracteres() { // sempre que nao está a void, vai ter de devolver um valor
        String s,s1;
        System.out.println("Insira um texto");
        s = ManipulaStrings.ler.next();
        s1 = ManipulaStrings.ler.nextLine();
        s = s+s1;
        return s.length();
    }
    
}
