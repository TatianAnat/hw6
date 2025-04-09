public class Main {
    public static void main(String[] args) {
        // task1
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        // task2
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " можно идти без шапки");
        }
        // task3
        int speed = 55;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ",то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ",то можно ездить спокойно");
        }

    }
}

