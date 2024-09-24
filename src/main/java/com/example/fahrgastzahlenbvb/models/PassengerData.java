package com.example.fahrgastzahlenbvb.models;

import java.time.LocalDate;

public class PassengerData {
    private LocalDate startdatumKalenderwocheMonat;
    private int fahrgaesteEinsteiger;
    private Integer kalenderwoche;
    private String granularitat;
    private LocalDate datumDerMonatswerte;

    // Getters and setters
    public LocalDate getStartdatumKalenderwocheMonat() {
        return startdatumKalenderwocheMonat;
    }

    public void setStartdatumKalenderwocheMonat(LocalDate startdatumKalenderwocheMonat) {
        this.startdatumKalenderwocheMonat = startdatumKalenderwocheMonat;
    }

    public int getFahrgaesteEinsteiger() {
        return fahrgaesteEinsteiger;
    }

    public void setFahrgaesteEinsteiger(int fahrgaesteEinsteiger) {
        this.fahrgaesteEinsteiger = fahrgaesteEinsteiger;
    }

    public Integer getKalenderwoche() {
        return kalenderwoche;
    }

    public void setKalenderwoche(Integer kalenderwoche) {
        this.kalenderwoche = kalenderwoche;
    }

    public String getGranularitat() {
        return granularitat;
    }

    public void setGranularitat(String granularitat) {
        this.granularitat = granularitat;
    }

    public LocalDate getDatumDerMonatswerte() {
        return datumDerMonatswerte;
    }

    public void setDatumDerMonatswerte(LocalDate datumDerMonatswerte) {
        this.datumDerMonatswerte = datumDerMonatswerte;
    }
}
