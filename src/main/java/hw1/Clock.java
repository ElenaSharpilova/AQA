package hw1;

public class Clock implements Readable {
    private int hour;
    private int minutes;
    private int seconds;

    // Конструктор для создания часов с заданным временем
    public Clock (int hour, int minutes, int seconds){
        this.hour=hour;
        this.minutes=minutes;
        this.seconds=seconds;
    }

    public void setHour (int hour){
        if (hour >= 0 && hour< 24){
            this.hour=hour;
        } else {
            System.out.println("Невалидное значение часов");
        }
    }
    public int getHour() {
        return this.hour;
    }


    public void setMinutes (int minutes){
        if (minutes >= 0 && minutes < 60){
            this.minutes=minutes;
        } else {
            System.out.println("Невалидное значение минут");
        }
    }
    public int getMinutes() {
        return this.minutes;
    }

    public void setSeconds (int seconds){
        if (seconds >= 0 && seconds < 60){
            this.seconds=seconds;
        } else {
            System.out.println("Невалидное значение секунд");
        }
    }
    public int getSeconds() {
        return this.seconds;
    }

    // Метод tick() для увеличения времени на одну секунду
    public void tick() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
    }

    @Override
    public void readTime() {
        System.out.printf("Текущее время: %02d:%02d:%02d%n", hour, minutes, seconds);
    }
}
