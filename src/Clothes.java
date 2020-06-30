public class Clothes {
    static int counter = 0;
    int id;
    String brandName;
    TypeOfClothes type;

    Clothes(String brandName, String type){
        counter++;
        id = counter;
        this.brandName = brandName;
        this.type = TypeOfClothes.valueOf(type);


    }

    @Override
    public String toString() {
        return "Clothes{" +
                "counter=" + counter +
                ", id=" + id +
                ", brandName='" + brandName + '\'' +
                ", type=" + type +
                '}';
    }
}
