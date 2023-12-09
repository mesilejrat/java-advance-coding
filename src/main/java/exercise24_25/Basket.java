package exercise24_25;

public class Basket {
    private Integer item;

    public Basket(){
        item = 0;
    }

    public void addToBasket(){
        if (item < 10) {
            item += 1;
        } else{
            throw  new UncheckedBasketFullException("Shporta eshte plot Unchecked");
        }
    }

    public void removeFromBasket() throws CheckedBasketEmptyException {
        if(item > 0) {
            item -= 1;
        } else {
            throw new CheckedBasketEmptyException("Shporta eshte bosh nuk mund te heqim asgje");
        }
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }
}
