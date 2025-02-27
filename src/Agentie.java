import java.util.ArrayList;

public class Agentie {
    private String name;
    private int rating;

    private ArrayList<tur> tururi;
    private String locatie;

    public String get_name()
    {
        return this.name;
    }
    public int get_rating()
    {
        return this.rating;
    }
    public String get_locatie()
    {
        return this.locatie;
    }

    public void Agentie()
    {
        this.name = "Empty";
        this.rating = 0;
        this.locatie = "Empty";
    }
    public Agentie(String nume,String locatie,int rating)
    {
        this.name = nume;
        this.rating = rating;
        this.locatie = locatie;
    }

    private void add_tur(tur)
    {

    }



}
