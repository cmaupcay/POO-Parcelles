package activites;

public class Traitement extends Activite
{
    public static final String PREFIX = "Traitement anti-";
    public static final double AIDE_BONUS = 2000.00D;
    public static final double EAU_PAR_HECTARE = 100.D;

    private final String insecte;
    private final String ferocite;

    public Traitement(String insecte, String ferocite, double coutAnnuel)
    {
        super(PREFIX + insecte, coutAnnuel);
        this.insecte = insecte;
        this.ferocite = ferocite;
    }

    public final String getInsecte() { return this.insecte; }

    public final String getFerocite() { return this.ferocite; }

    @Override
    public double estimerAide(double hectares)
    {
        return super.estimerAide(hectares) + AIDE_BONUS;
    }

    @Override
    public double calculerEauConsommee(double hectares)
    {
        return hectares * EAU_PAR_HECTARE;
    }
}
