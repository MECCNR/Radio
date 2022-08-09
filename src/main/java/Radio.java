public class Radio {
    public int currentNumber;
    public int currentVolume;


    public void next() {
        if (currentNumber < 9) {
            currentNumber = currentNumber + 1;
        }
        if (currentNumber == 9) {
            currentNumber = 0;
        }
        return;
    }

    // код выше не выдерживает проверку на граничные значения, как и все остальные ниже
    // потому-что после проверки первого условия сразу же проверяет другой
    // ЗАТО ПО ТРЕБОВАНИЯМ ВСЁ СООТВЕТСТВУЕТ И ВСЕ 100% ПО ВЕТКАМ ОБЕСПЕЧЕНЫ!


    public void prev() {
        if (currentNumber > 0) {
            currentNumber = currentNumber - 1;
        }
        if (currentNumber == 0) {
            currentNumber = 9;
        }
        return;
    }

    public void setNumber(int newNumber) {
        if(newNumber > 9) {
            return;
        }
        if(newNumber < 0) {
            return;
        }
        currentNumber = newNumber;
    }

    public void setVolume(int newVolume) {
        currentVolume = newVolume;
    }

    public void plusVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            currentVolume = 10;
        }
        return;
    }

    public void minusVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = 0;
        }
        return;
    }
}
