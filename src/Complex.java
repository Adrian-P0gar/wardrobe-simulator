public class Complex extends Hanger{


    public Complex() {
        super(2);
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

        if(clothes.size() >= dimension){
            System.out.println("Not enough space in complex wardrobe");
            return false;
        }
        if(clothes.size() == 0){
            System.out.println("Is enough space!");
            return true;
        }
        else{
            if(type.equals(TypeOfClothes.SKIRT) || type.equals(TypeOfClothes.TROUSERS) ){
                if (clothes.get(0).type.equals(TypeOfClothes.SKIRT) || clothes.get(0).type.equals(TypeOfClothes.TROUSERS)) {
                    System.out.println( "You don't have space for this type!");
                    return false;
                }}
            if(type.equals(TypeOfClothes.SHIRT) || type.equals(TypeOfClothes.BLOUSE) ){
                if (clothes.get(0).type.equals(TypeOfClothes.SHIRT) || clothes.get(0).type.equals(TypeOfClothes.BLOUSE)){
                    System.out.println( "You don't have space for this type!");
                      return false;
                    } }
            return true;}}



}
