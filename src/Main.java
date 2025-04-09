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
        // task4
        int age1 = 59;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
        }
        if (age1 >= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
        }
        // task5
        int ageKids = 15;
        if (ageKids < 5) {
            System.out.println("Если возраст ребенка равен " + ageKids + ", то ему нельзя кататься на аттракционе");
        }
        if (ageKids >= 5 && ageKids < 14) {
            System.out.println("Если возраст ребенка равен " + ageKids + ", то ему можно кататься на аттракционе в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (ageKids > 14) {
            System.out.println("Если возраст ребенка равен " + ageKids + ", то может кататься без сопровождения взрослого");
        }


    }
}

