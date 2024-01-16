// import de package
import java.util.*;
public class WordSearch{
    // declaration des attributs
    String chaine;
    String mot_chercher;

    public static void main(String[] args) {
        // creation d'un objet mot
        WordSearch mot= new WordSearch();
        Scanner sc=null;
        sc=new Scanner(System.in);
        System.out.println("Saisissez un texe");
        mot.chaine=sc.nextLine();
        System.out.println("quel mot cherchez-vous dans le texte ?");
        // recuperation du chaine saisie par l'utilisateur
        mot.mot_chercher=sc.nextLine(); 
        // l'utilisation de indexOf() qui cherche un mot dans dans un texe et te renvoie la position source:javadoc
        int index=mot.chaine.indexOf(mot.mot_chercher);
        // verification par condition classique (index==-1)
        if(index==-1){
            System.out.println(""+mot.mot_chercher+" n'est pas dans le texte");
        }
        else{
            System.out.println(mot.mot_chercher+" est dans le texte a l'index "+index );
        }
        
    }
}