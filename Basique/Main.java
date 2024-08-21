public class Main {
    public static void main(String[] args) {
        Basique Voiture = new Basique();
        // Basique typeVoiture = new Basique();
        Basique secondVoiture = new Basique("Mercedes");
        Basique thirdVoiture = new Basique("GLK", 2021);


        Voiture.setTypes("Ferrari");
        System.out.println(Voiture.getTypes());

        Voiture.setModels("Rails");
        System.out.println(Voiture.getModels());

        Voiture.setAnnées(2022);
        System.out.println(Voiture.getAnnées());

        Voiture.setPrix(22000);
        System.out.println(Voiture.getPrix());

        Voiture.setCouleurs("Red");
        System.out.println(Voiture.getCouleurs());

        // Voiture.accelerer();
        // secondVoiture.ralentir();
        // thirdVoiture.freiner();
        Basique.accelerer();
        Basique.ralentir();
        Basique.freiner();
        

      }
}
