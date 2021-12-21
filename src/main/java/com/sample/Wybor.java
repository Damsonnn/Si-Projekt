package com.sample;

public class Wybor{
    public String pytanie;
    public String wybor;

    public Wybor() {
    }

    public Wybor(String pytanie, String odpowiedz) {
        this.pytanie = pytanie;
        this.wybor = odpowiedz;
    }

    public String getPytanie() {
        return pytanie;
    }

    public void setPytanie(String pytanie) {
        this.pytanie = pytanie;
    }

    public String getWybor() {
        return wybor;
    }

    public void setWybor(String wybor) {
        this.wybor = wybor;
    }
}