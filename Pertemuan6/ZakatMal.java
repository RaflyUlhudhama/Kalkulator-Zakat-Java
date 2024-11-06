
public class ZakatMal extends Zakat {
    private static final double NISAB_ZAKAT_MAL = 85000000;
    private static final double PERSENTASE_ZAKAT_MAL = 0.025;

    public ZakatMal(double amount) {
        super(amount);
    }

    @Override
    public double calculateZakat() {
        if (amount >= NISAB_ZAKAT_MAL) {
            return amount * PERSENTASE_ZAKAT_MAL;
        } else {
            return 0;
        }
    }
}
