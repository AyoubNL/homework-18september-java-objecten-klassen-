import org.w3c.dom.ls.LSOutput;

public class ApplePieRecipe {

    Ingredient butter = new Ingredient(200, "ongezouten roomboter", "gram");
    Ingredient casterSugar = new Ingredient(200, "witte bastard suiker", "gram");
    Ingredient flour = new Ingredient(400, "zelfrijzend bakmeel", "gram");
    Ingredient egg = new Ingredient(1, "ei", "stuk");
    Ingredient vanillaSugar = new Ingredient(8, "vanillesuiker", "gram");
    Ingredient salt = new Ingredient(1, "zout", "snuf");
    Ingredient apples = new Ingredient(1.5, "zoetzure apples", "kilo's");
    Ingredient crystalSugar = new Ingredient(75, "kristal suiker", "gram");
    Ingredient cinnamon = new Ingredient(3, "kaneel", "theelepels");
    Ingredient crumbs = new Ingredient(15, "paneermeel", "gram");


    public void printIngredient() {
        System.out.println(butter.getAmount() + " " + butter.getUnit() + " " + butter.getName());
        System.out.println(casterSugar.getAmount() + " " + casterSugar.getUnit() + " " + casterSugar.getName());
        System.out.println(flour.getAmount() + " " + flour.getUnit() + " " + flour.getName());
        System.out.println(egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
        System.out.println(vanillaSugar.getAmount() + " " + vanillaSugar.getUnit() + " " + vanillaSugar.getName());
        System.out.println(salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
        System.out.println(apples.getAmount() + " " + apples.getUnit() + " " + apples.getName());
        System.out.println(crystalSugar.getAmount() + " " + crystalSugar.getUnit() + " " + crystalSugar.getName());
        System.out.println(cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName());
        System.out.println(crumbs.getAmount() + " " + crumbs.getUnit() + " " + crumbs.getName());
        System.out.println();
    }

    public void printRecipe() {
        heat();
        egg();
        butter();
        cut();
        flour();
        sprinkle();
        mix();
        thin();
        finish();
        bake();
    }

    public void heat() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte).");
    }

    public void egg() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void butter() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void cut() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void flour() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
    }

    public void sprinkle() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void mix() {
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void thin() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void finish() {
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void bake() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin");
    }

}
