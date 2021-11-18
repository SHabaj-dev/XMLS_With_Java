package XMLS_to_DB;

public class Structure {
    int Rank;
    String country;
    String population;
    String date;
    String percentage;

    public Structure(){}

    public Structure(int rank, String country, String population, String date, String percentage) {
        Rank = rank;
        this.country = country;
        this.population = population;
        this.date = date;
        this.percentage = percentage;
    }

    public int getRank() {
        return Rank;
    }

    public void setRank(int rank) {
        Rank = rank;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }
}
