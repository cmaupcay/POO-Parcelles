package activites;

import periodes.Journee;

public class Recolte extends Activite
{
    public static final String PREFIX = "Récolte de ";
    public static final double EAU_PAR_HECTARE = 200.D;

    private final Journee periodeFavorable;
    private final Materiel materiel;

    public Recolte(
        String culture, double coutAnnuel,
        Journee periodeFavorable, Materiel materiel
    )
    {
        super(PREFIX + culture, coutAnnuel);
        this.periodeFavorable = periodeFavorable;
        this.materiel = materiel;
    }

    public final Journee getPeriodeFavorable() { return this.periodeFavorable; }

    public final Materiel getMateriel() { return this.materiel; }

    @Override
    public double calculerEauConsommee(double hectares)
    {
        return hectares * EAU_PAR_HECTARE;
    }

    public enum Materiel
    {
        MAIN,
        MOISSONNEUSE,
        FAUCHEUSE    
    }
}
