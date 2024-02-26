public class Main {
    public static void main(String[] args) {
        //task 1
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно еще подождать");
        }

        //task 2
        int temperature = 6;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        //task 3
        int speed = 60;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ехать спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }

        //task 4
        int difAge = 26;
        if (difAge >= 2 && difAge <= 6) {
            System.out.println("Если возраст человека равен " + difAge + ", то ему нужно ходить в детский сад");
        }
        else if (difAge >= 7 && difAge <= 17) {
            System.out.println("Если возраст человека равен " + difAge + ", то ему нужно ходить в школу");
        }
        else if (difAge >= 18 && difAge <= 24) {
            System.out.println("Если возраст человека равен " + difAge + ", то ему нужно ходить в университет");
        }
        else if (difAge > 24) {
            System.out.println("Если возраст человека равен " + difAge + ", то ему нужно ходить на работу");
        }

        //task 5
        int childAge = 13;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка " + childAge + ", то кататься на атракционе нельзя");
        }
        else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка " + childAge + ", то кататься на атракционе можно в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка " + childAge + ", то кататься на атракционе можно без сопровождения взрослого");
        }

        //task 6
        int totalAvailableSeats = 102;
        int seat = 60;
        int people = 103;
        if (people <= seat) {
            System.out.println("Есть сидячие места");
        }
        else if (people > seat && people < totalAvailableSeats) {
            System.out.println("Есть стоячие места");
        } else {
            System.out.println("Мест нет, вагон переполнен");
        }

        //task 7 прикольнее было бы со сканером делать
        int one = 11;
        int two = 12;
        int three = 100;
        if(one > two && one > three) {
            System.out.println("Число " + one + " является наибольшим");
        }
        else if (two > one && two > three) {
            System.out.println("Число " + two + " является наибольшим");
        } else {
            System.out.println("Число " + three + " является наибольшим");
        }
    }
}