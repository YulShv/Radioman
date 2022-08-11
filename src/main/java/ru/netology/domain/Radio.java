package ru.netology.domain;

public class Radio {

    Radio() {
        currentStationNumber = 0;
        currentVolume = 0;
    }

    private int currentStationNumber;
    private int currentVolume;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < 0) {
            return;
        }
        if (newCurrentStationNumber > 9) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void nextStationNumber() {
        if (currentStationNumber < 9) {
            currentStationNumber++;
        } else {
            currentStationNumber = 0;
        }
    }

    public void prevStationNumber() {
        if (currentStationNumber > 0) {
            currentStationNumber--;
        } else {
            currentStationNumber = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

}
