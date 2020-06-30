import java.util.ArrayList;
import java.util.List;

public abstract class Hanger {
    boolean isEmpty;
    List <Clothes> clothes;
    int dimension;

    public Hanger(int dimension) {
        isEmpty = false;
        clothes = new ArrayList<>();
        this.dimension = dimension;
    }

    public abstract void addClothes(Clothes clothe);
    public abstract void removeClothes(Clothes clothe);
    public abstract boolean verifyIfIsEmpty(TypeOfClothes type);

    @Override
    public String toString() {
        return "Hanger{" +
                "isEmpty=" + isEmpty +
                ", clothes=" + clothes +
                ", dimension=" + dimension +
                '}';
    }
    // remove all
}
