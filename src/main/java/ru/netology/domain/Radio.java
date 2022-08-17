package ru.netology.domain;

public class Radio {

    private int currentStationNumber;
    private int currentVolume;
    private int stationAmount;
    private int maxStation;

    public Radio(int stationAmount) {
       this.stationAmount = stationAmount;
       this.maxStation = this.stationAmount - 1;
    }

    public Radio() {
        this.stationAmount = 10;
        this.maxStation = this.stationAmount - 1;
    }

    public int getStationAmount() {
        return stationAmount;
    }
    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber > maxStation) {
            return;
        }

        if (newCurrentStationNumber < 0) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void nextStationNumber() {
        if (currentStationNumber < maxStation) {
            currentStationNumber++;
        } else {
            currentStationNumber = 0;
        }
    }

    public void prevStationNumber() {
        if (currentStationNumber > 0) {
            currentStationNumber--;
        } else {
            currentStationNumber = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

}
