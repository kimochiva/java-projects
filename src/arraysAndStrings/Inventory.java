package arraysAndStrings;

public class Inventory {
    private String[] productName = {"Golden Apple", "Lemon", "Strawberry", "Plum", "Cherry"};
    private double[] productPrice = {1000.0, 500.0, 300.0, 200.0, 100.0};

    public int getProductIndex(String product) {
        int index = 0;
        int result = -1;
        for (String item: productName) {
            if (item.equals(product)) {
                result = index;
                break;
            }
            else {
                index++;
            }
        }
        return result;
    }
    public Double getProductPrice(int index) {
        return productPrice[index];
    }
}
