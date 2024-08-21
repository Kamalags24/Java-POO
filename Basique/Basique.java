public class Basique {
    private String types = "Range Rover";
    private String models = "Velar";
    int années =  2020;
    int prix = 12500;
    String couleurs = "Black";
    

    Basique() {
        System.out.println("Instanciation...");  
      }

    Basique(String type) {
        this.types = type;

        System.out.println(type);
      }

    Basique(String model, int année) {
        this.models=model;
        this.années=année;  

        System.out.println(model);
        System.out.println(année);
      }

    public String getTypes() {
        return types;
    }

    public void setTypes(String newType) {
        this.types = newType;
    }



    public String getModels() {
        return models;
    }

    public void setModels(String newModel) {
        this.types = newModel;
    }


    
    public int getAnnées() {
        return années;
    }

    public void setAnnées(int newYear) {
        this.années = newYear;
    }


    
    public int getPrix() {
        return prix;
    }

    public void setPrix(int newPrice) {
        this.prix = newPrice;
    }



    public String getCouleurs() {
        return couleurs;
    }

    public void setCouleurs(String newCouleur) {
        this.couleurs = newCouleur;
    }


    public static void accelerer() {
        System.out.println("Vous pouvez à présent accélérer...");
    }

    public static void ralentir() {
        System.out.println("Vous devez à présent ralentir...");
    }

    public static void tourner() {
        System.out.println("Vous pouvez à présent tourner...");
    }

    public static void freiner() {
        System.out.println("Vous êtes arrivé à destination. Veuillez à présent freiner...");
    }
}
