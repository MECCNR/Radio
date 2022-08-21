import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    @Test
    public void setStationLessThanZero() {
        Radio radio = new Radio(-1);
        radio.setStation(radio.getCurrentStation());
        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseNumber() {
        Radio radio = new Radio(11);
        radio.setStation(radio.getCurrentStation());
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseNumberIfEqualsNine() {
        Radio radio = new Radio(11);
        radio.setStation(radio.getCurrentStation());
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NumberEqualsStations() {
        Radio radio = new Radio(11);
        radio.setNumber(11);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumber() {
        Radio radio = new Radio(11);
        radio.setNumber(2);
        radio.prev();
        int expected = 1;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumberIfZero() {
        Radio radio = new Radio(11);
        radio.setStation(radio.getCurrentStation());
        radio.prev();
        int expected = 11;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolume() {
        Radio radio = new Radio(11);
        radio.setStation(radio.getCurrentStation());
        radio.setVolume(1);
        radio.plusVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTen() {
        Radio radio = new Radio(11);
        radio.setStation(radio.getCurrentStation());
        radio.setVolume(100);
        radio.plusVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio(11);
        radio.setStation(radio.getCurrentStation());
        radio.setVolume(5);
        radio.minusVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeZero() {
        Radio radio = new Radio(11);
        radio.setStation(radio.getCurrentStation());
        radio.setVolume(0);
        radio.minusVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
