import activites.Activite;
import activites.Recolte;
import parcelles.AucuneActivite;
import parcelles.Parcelle;
import periodes.Journee;

class Application
{
    public static void main(String[] args) throws AucuneActivite
    {
        Parcelle p = new Parcelle(0, "NORD", 7);
        System.out.println(p);
        p.getActivites().add(new Recolte("blé", 200, Journee.MATIN, Recolte.Materiel.MAIN));
        Activite a = p.getActivitePlusChere();
        System.out.println(a);
    }   
}