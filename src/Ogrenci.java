public class Ogrenci {
    private String ad;
    private String bolum;
    private int girisYili;
    private int ogrNo;
    private double gano;
    private static final int bolumKodu = 141;
    private static int count = 0;

    public Ogrenci() {
        this(null, null, 0, 1973);
    }

    public Ogrenci(String ad, String bolum) {
        this(ad, bolum, 0, 1985);
    }

    public Ogrenci(String ad, String bolum, double gano, int girisYili) {
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Gano negatif veya 4'ten büyük bir değer olamaz");
        }

        this.ad = ad;
        this.bolum = bolum;
        this.gano = gano;
        this.girisYili = girisYili;
        count++;

        ogrenciNoOlustur();
    }

    public void ogrenciNoOlustur() {
        if (count < 10) {
            ogrNo = Integer.parseInt(String.valueOf(girisYili) + String.valueOf(bolumKodu) + "00" + count);
        } else if (count < 100) {
            ogrNo = Integer.parseInt(String.valueOf(girisYili) + String.valueOf(bolumKodu) + "0" + count);
        } else {
            ogrNo = Integer.parseInt(String.valueOf(girisYili) + String.valueOf(bolumKodu) + count);
        }
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Gano negatif veya 4'ten büyük bir değer olamaz");
        }
        this.gano = gano;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public int getOgrNo() {
        return ogrNo;
    }

    public double harcHesapla(int dersSayisi) {
        return dersSayisi * 120;
    }

    public double harcHesapla(int dersSayisi, double uzatmaYili) {
        return dersSayisi * 120 * uzatmaYili;
    }
}
