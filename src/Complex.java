public class Complex extends Hanger{


    public Complex(int dimension) {
        super(dimension);
    }


    @Override
    public void addClothes(Clothes clothe) {
        if (verifyIfIsEmpty(clothe.type)){
            System.out.println("The clothe is on hanger");
            clothes.add(clothe);
        }

    }

    @Override
    public void removeClothes(Clothes clothe) {
        clothes.remove(clothe);
    }

    public void removeAll(){
        for(Clothes clothe : clothes){
            clothes.remove(clothe);
        }
    }

    @Override
    public boolean verifyIfIsEmpty(TypeOfClothes type) {
        int spaceOnHanger = 0;
        if(clothes.size() >= dimension){
            System.out.println("Not enough space in complex wardrobe");
            return false;
        }
        else {
            for (Clothes clothe : clothes) {
                if(type.equals(TypeOfClothes.SKIRT) || type.equals(TypeOfClothes.TROUSERS) ){
                    if (clothe.type.equals(TypeOfClothes.SKIRT) || clothe.type.equals(TypeOfClothes.TROUSERS)) {
                        spaceOnHanger++;
                        System.out.println( "You don't have space for this type!");
                    }
                }
                if(type.equals(TypeOfClothes.SHIRT) || type.equals(TypeOfClothes.BLOUSE) ){
                    if (clothe.type.equals(TypeOfClothes.SHIRT) || clothe.type.equals(TypeOfClothes.BLOUSE)) {
                        spaceOnHanger++;
                        System.out.println( "You don't have space for this type!");
                    }
                }

            }
            return spaceOnHanger == 0;
        }
    }



}
