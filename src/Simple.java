public class Simple extends  Hanger{
    public Simple(int dimension) {
        super(dimension );
    }

    @Override
    public void addClothes(Clothes clothe) {
        if(verifyIfIsEmpty(clothe.type)){
            System.out.println("The clothe is on hanger");
            clothes.add(clothe);
        }

    }

    @Override
    public void removeClothes(Clothes clothe) {
        clothes.remove(clothe);
    }

    @Override
    public boolean verifyIfIsEmpty(TypeOfClothes type) {
        if(type.equals(TypeOfClothes.TROUSERS )  || type.equals(TypeOfClothes.SKIRT )){
            System.out.println("Wrong type");
            return false;
        }
        if(clothes.size() >= 1){
            System.out.println("Not enough space in simple hanger");
            return false;
        }
        return dimension >= clothes.size();

    }
}
