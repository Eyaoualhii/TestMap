import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        HashMap hash = new HashMap();
        hash.put(2,"nom1");
        hash.put("test","AL2");
        hash.put(2,"nom2");
        hash.put("test","AL3");
        hash.put(5.2,"AL3");


        Etudiant e1 = new Etudiant(1,"nom1","prenom1");
        Etudiant e2 = new Etudiant(2,"nom2","prenom2");
        Etudiant e3 = new Etudiant(3,"nom3","prenom3");
        Etudiant e4 = new Etudiant(3,"nom3","prenom3");
        HashMap<Etudiant,String> etudiants = new HashMap();

        etudiants.put(e2,"AL1");
        etudiants.put(e3,"AL3");
        etudiants.put(e1,"AL1");
        etudiants.put(e1,"AL5");

        etudiants.put(e4,"AL4");
        System.out.println(etudiants);
        System.out.println(etudiants.size());


        System.out.println(etudiants.containsKey(e1));
        System.out.println(etudiants.containsValue("AL1"));

        System.out.println(etudiants.remove(e4));

        System.out.println(etudiants.get(e1));

        System.out.println("Parcours des Clés :");
        for(Etudiant s : etudiants.keySet()){
            System.out.println(s);
        }
        System.out.println("Parcours des Valeurs :");

        for(String s : etudiants.values()){
            System.out.println(s);
        }
        System.out.println("Parcours des Clé/Valeurs :");

        for(Map.Entry<Etudiant,String > e : etudiants.entrySet()){
            System.out.println(e);
        }


    }
}