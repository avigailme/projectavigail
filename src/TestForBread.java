public class TestForBread {
    public static void main(String[] args) {

        Bread b = new Bread();
        b.setPrice(20);
        b.setProducerCompnay("KG");
        b.setWeight(5);
        b.bake();
        b.pack();
        System.out.println(b);

        Lepeshka lone = new Lepeshka();
        lone.setRadius(50);
        lone.setPrice(100);
        lone.setProducerCompnay("UZ");
        lone.setWeight(4);
        lone.pack();
        lone.bake();
        System.out.println(lone);

        Lavash lavash = new Lavash();
        lavash.setPrice(500);
        lavash.setWeight(3);
        lavash.setProducerCompnay("US");
        lavash.setNameOfBread("Elitnyi lavash");
        lavash.bake();
        lavash.zavernut();
        System.out.println(lavash);

        Baget baget = new Baget();
        baget.setPrice(450);
        baget.setWeight(2);
        baget.setProducerCompnay("FR");
        baget.setNameOfBread("Provansalskiy");
        baget.bake();
        baget.scarp();
        baget.getQuan();
        System.out.println(baget);
        System.out.println("Loshad"+ "Svoistvo:ves, rost, poroda, vozrast, zanimaetsya sportom:: Methods: runs, eats ");
        System.out.println("Arabskay Loshad"+ "Svoistvo:ves, rost, poroda, vozrast:: Methods: runs, eats(nelzya morkovku), hodit, participates in sports");
        System.out.println("Brambi Loshad ++ KOKBORU if ves not 100 to ne sozdaem"+ "Svoistvo:ves, rost, poroda, boretsya, vozrast:: Methods: runs(ogranichenie v skorosti), eats, participates in sports");
        System.out.println("Abstang Loshad"+ "Svoistvo:ves, rost, poroda, vozrast:: Methods: runs, eats, participates in sports");

    }
}
