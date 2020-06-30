public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe(2);

        Clothes jeans = new Clothes ("Zara", "TROUSERS");
        Clothes skirt1 = new Clothes("Gucci", "SKIRT");
        Clothes blouse1 = new Clothes("H&M", "BLOUSE");

        System.out.println(jeans);
        System.out.println(skirt1);
        System.out.println(blouse1);

        Hanger hanger1 = new Simple();
        Hanger hanger2 = new Complex();

        hanger1.addClothes(jeans);
        hanger1.addClothes(blouse1);

//        hanger2.addClothes(blouse1);
        hanger2.addClothes(skirt1);
        hanger2.addClothes(jeans);

        System.out.println(hanger1);
        System.out.println(hanger2);

        wardrobe.addInWardrobe(hanger1);
        wardrobe.addInWardrobe(hanger2);

        wardrobe.verifyIfIsSpaceOnTopHanger(jeans);

    }
}
