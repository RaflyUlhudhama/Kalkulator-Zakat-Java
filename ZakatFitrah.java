
public class ZakatFitrah extends Zakat {
    private static final double ZAKAT_FITRAH_BERAS = 2.5;
    private static final double HARGA_BERAS_PER_KG = 12000;

    public ZakatFitrah(double amount) {
        super(amount);
    }

    @Override
    public double calculateZakat() {
        return ZAKAT_FITRAH_BERAS * HARGA_BERAS_PER_KG * amount;
    }
}
