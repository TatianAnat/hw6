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
        int temperature = 8;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " можно идти без шапки");
        }
        // task3
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ",то придется заплатить штраф");
        } else if (speed <= 60) {
            System.out.println("Если скорость " + speed + ",то можно ездить спокойно");
        }

        // task4
        int age1 = 24;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        } else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        } else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
        } else if (age1 >= 24) {
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
        // task6
        int totalPlaces = 120;
        int seating = 60;
        int standingRoom = totalPlaces - seating;
        //вводим количество занятых сидячих мест
        int seatingPrint = 60;
        //вводим количество занятых стоячих мест
        int standingRoomPrint = 50;
        //ввычисляем сколько всего занято мест
        int totalPlacePrint = standingRoomPrint + seatingPrint;
        if (seatingPrint < 60 && totalPlacePrint < 120)  {
            System.out.println("В вагоне есть сидячие места");
        }
        if ( totalPlacePrint < 120 && standingRoomPrint < standingRoom) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("В вагоне мест нет");
        }
        // task7
        int one = 115;
        int two = 75;
        int three = 365;

        if (one > two && one > three) {
            System.out.println("Число " + one + " наибольшее");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " наибольшее");
        } else if (three > one && three > two) {
            System.out.println("Число " + three + " наибольшее");
        }

        }

    }



