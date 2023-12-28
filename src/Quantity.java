public class Quantity {
    private int quantityInPieces;
    private int quantityInGrams;

    public Quantity(int quantityInPieces, int quantityInGrams) {
        this.quantityInPieces = quantityInPieces;
        this.quantityInGrams = quantityInGrams;
    }

    public int getQuantityInPieces() {
        return quantityInPieces;
    }

    public void setQuantityInPieces(int quantityInPieces) {
        this.quantityInPieces = quantityInPieces;
    }

    public int getQuantityInGrams() {
        return quantityInGrams;
    }

    public void setQuantityInGrams(int quantityInGrams) {
        this.quantityInGrams = quantityInGrams;
    }
}


