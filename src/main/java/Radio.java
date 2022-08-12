public class Radio {
    private int currentNumber;
    private int currentVolume;

    private int defaultStation = 10;
    private int currentStation = defaultStation;

    public Radio(int currentNumber, int currentStation) {
        this.currentNumber = currentNumber;
        this.currentStation = currentStation;
    }

    public Radio(int currentNumber) {
        this.currentNumber = currentNumber;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void next() {
        if (currentNumber == currentStation) {
            currentNumber = 0;
        } else {
            currentNumber = currentNumber + 1;
        }
        return;
    }

    public void prev() {
        if (currentNumber == 0) {
            currentNumber = currentStation;
        } else {
            currentNumber = currentNumber - 1;
        }
        return;
    }

    public void setNumber(int newNumber) {
        if (newNumber > currentStation) {
            currentNumber = 0;
            return;
        }
        if (newNumber < 0) {
            currentNumber = 0;
            return;
        }
        currentNumber = newNumber;
    }

    public void setVolume(int newVolume) {
        currentVolume = newVolume;
    }

    public void plusVolume() {
        if (currentVolume == 100) {
            currentVolume = 100;
        } else {
            currentVolume = currentVolume + 1;
        }
        return;
    }

    public void minusVolume() {
        if (currentVolume == 0) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
        return;
    }
}
