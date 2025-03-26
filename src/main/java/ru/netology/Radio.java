package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    final int stationQuantity;

    public Radio(int stationQuantity) {
        this.stationQuantity = stationQuantity;
    }

    public Radio() {
        this.stationQuantity = 10;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0 || newCurrentStation > stationQuantity-1) {
            currentStation = -1;  // ошибка в установке радиостанции
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0 || newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getStationQuantity() {
        return stationQuantity;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextStation() {
        if (currentStation < stationQuantity-1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            if (currentStation == 0) {
                currentStation = stationQuantity-1;
            }
        }
    }
}
