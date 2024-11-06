public class ZakatPertanian extends Zakat {
    private static final double NISAB_PERTANIAN = 520;
    private static final double PERSENTASE_PERTANIAN_IRIGASI = 0.05;
    private static final double PERSENTASE_PERTANIAN_NON_IRIGASI = 0.10;
    private boolean isIrrigated;

    public ZakatPertanian(double amount, boolean isIrrigated) {
        super(amount);
        this.isIrrigated = isIrrigated;
    }

    public boolean getIsIrrigated() {
        return isIrrigated;
    }

    public void setIsIrrigated(boolean isIrrigated) {
        this.isIrrigated = isIrrigated;
    }

    @Override
    public double calculateZakat() {
        if (amount < NISAB_PERTANIAN) {
            System.out.println("Jumlah hasil panen belum memenuhi syarat nisab untuk zakat pertanian.");
            return 0;
        }
        return amount * (isIrrigated ? PERSENTASE_PERTANIAN_IRIGASI : PERSENTASE_PERTANIAN_NON_IRIGASI);
    }
}