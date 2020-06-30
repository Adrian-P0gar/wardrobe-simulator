import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    int spaceLimit;
    List< Hanger> stock = new ArrayList<>();

    public Wardrobe(int spaceLimit) {
        this.spaceLimit = spaceLimit;
    }

    public void addInWardrobe(Hanger hanger){
        System.out.println("Add new hanger");
        stock.add(hanger);
    }

    public void removeOfWardrobe(Hanger hanger){
        stock.remove(hanger);
    }

    public boolean verifyIfIsEmpty(){
        if( stock.size() >= spaceLimit ){
            return false;
        }
        return true;
    };

    public boolean verifyIfIsSpaceOnTopHanger(Clothes clothes){
        if(verifyIfIsEmpty()){
                    System.out.println("Is enough space in wardrobe");
                    return true;

                }
        if (!verifyIfIsEmpty()){
                for(Hanger hanger: stock){
                    System.out.println("Is enough space  in wardrobe");
                    if(hanger.verifyIfIsEmpty(clothes.type)){
                        return true;
                    }
            }
                return false;
        }
        return false;
    }

    public void removeCloth(int id){
        for (Hanger hanger : stock){
            for(Clothes coat : hanger.clothes){
                if(coat.id == id){
                    System.out.println("I found it!");
                    hanger.removeClothes(coat);
                }
            }
        }
    }
}
