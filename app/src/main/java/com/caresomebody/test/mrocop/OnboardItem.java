package com.caresomebody.test.mrocop;

public class OnboardItem {
    String Judul,Deskripsi;
    int OnboardImage;

    public OnboardItem(String judul, String deskripsi, int onboardImage) {
        Judul = judul;
        Deskripsi = deskripsi;
        OnboardImage = onboardImage;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    public void setOnboardImage(int onboardImage) {
        OnboardImage = onboardImage;
    }

    public String getJudul() {
        return Judul;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public int getOnboardImage() {
        return OnboardImage;
    }
}
