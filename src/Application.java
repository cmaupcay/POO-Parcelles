import activites.Activite;
import activites.Recolte;
import activites.Traitement;
import parcelles.AucuneActivite;
import parcelles.NumeroNegatif;
import parcelles.Parcelle;
import periodes.Journee;

class Application
{
    public static void main(String[] args) throws Exception
    {
        Parcelle p;
        try
        {
            p = new Parcelle(-1, "SUD", 8);
        }
        catch (NumeroNegatif e)
        {
            System.err.println(e);
        }
        p = new Parcelle(0, "NORD", 7);
        System.out.println(p);

        try
        {
            p.getActivitePlusChere();
        }
        catch (AucuneActivite e)
        {
            System.err.println(e);
        }

        p.getActivites().add(new Recolte("blé", 200, Journee.MATIN, Recolte.Materiel.MAIN));
        p.getActivites().add(new Traitement("puceron", "haute", 400));
        
        Activite a = p.getActivitePlusChere();
        System.out.println(a);
        
        System.out.println("Aide associée : " + a.estimerAide(p.getSuperficie()) + "€");
        System.out.println("Consommation d'eau : " + a.calculerEauConsommee(p.getSuperficie()) + " litres");
    }   
}