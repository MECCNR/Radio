import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    @Test
    public void increaseNumber() {
        Radio radio = new Radio(1, 10);
        radio.setCurrentNumber(radio.getCurrentNumber());
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseNumberIfEqualsNine() {
        Radio radio = new Radio(11,11);
        radio.setCurrentNumber(radio.getCurrentNumber());
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumber() {
        Radio radio = new Radio(5,10);
        radio.setCurrentNumber(radio.getCurrentNumber());
        radio.prev();
        int expected = 4;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumberIfZero() {
        Radio radio = new Radio(0,11);
        radio.setCurrentNumber(radio.getCurrentNumber());
        radio.prev();
        int expected = 11;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumber() {
        Radio radio = new Radio(1, 10);
        radio.setCurrentNumber(radio.getCurrentNumber());
        int expected = 1;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberMoreThanNine() {
        Radio radio = new Radio(12, 11);
        radio.setCurrentNumber(radio.getCurrentNumber());
        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberLessThanZero() {
        Radio radio = new Radio(-1, 10);
        radio.setCurrentNumber(radio.getCurrentNumber());
        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio(1, 10);
        radio.setCurrentVolume(1);
        radio.plusVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTen() {
        Radio radio = new Radio(1, 10);
        radio.setCurrentVolume(100);
        radio.plusVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio(1, 10);
        radio.setCurrentVolume(5);
        radio.minusVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeZero() {
        Radio radio = new Radio(1, 10);
        radio.setCurrentVolume(0);
        radio.minusVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
