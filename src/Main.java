public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int age = 3;
        if (age >= 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы несовершеннолетний, нужно немного подождать");
        }
        System.out.println("\nTask 2");
        int weather = 2;
        if (weather > 5) {
            System.out.println("На улице тепло, " + weather + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, " + weather + " градусов, нужно надеть шапку");
        }
        System.out.println("\nTask 3");
        int speed = 50;
        if (speed < 60) {
            System.out.printf("Если скорость %s, то можно ездить спокойно %n", speed);
        } else {
            System.out.printf("Если скорость %s, то придется заплатить штраф %n", speed);
        }
        System.out.println("\nTask 4");
        int years = 8;
        if (years >= 2 && years <= 6) {
            System.out.println("Если человеку " + years + " то ему нужно ходить в детский сад");
        } else if (years >= 7 && years <= 17)
        {System.out.println("Если человеку " + years + " то ему нужно ходить в школу");}
          else if (years >= 18 && years <= 24) {
            System.out.println("Если человеку " + years + " то ему нужно ходить в университет");}
          else if (years > 24) {
            System.out.println("Если человеку " + years + " то ему пора ходить на работу");
          }
        System.out.println("\nTask 5");
          if (years < 5) {
              System.out.println("Если ребенку " + years + " то он ему нельзя кататься на аттракционах");
          } else if (years >= 5 && years <= 14) {
              System.out.println("Если ребенку " + years + " то ему можно кататься на аттракционах только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
          } else if (years > 14) {
              System.out.println("Если ребенку " + years + " то он может кататься на аттракционах без сопровождния взрослого. ");
          }
        System.out.println("\nTask 6");
          int passengersAmount = 12;
          if (passengersAmount  < 60) {
              System.out.println("Если в вагон вошли " + passengersAmount + " то в вагоне доступны и сидячие и стоячие места") ;
          }
          else if (passengersAmount < 102 && passengersAmount >= 60) {
              System.out.println("Если в вагон вошли " + passengersAmount + " то в вагоне доступны только стоячие места");
          }
          else if (passengersAmount >= 102) {
              System.out.println("Если в вагон вошли " + passengersAmount + " то в вагоне мест нет");
          }
        System.out.println("\nTask 7");
          int one = 1;
          int two = 2;
          int three = 3;
          if (one > two && one > three) {
            System.out.println("Первое число больше");
        }
         else if (two > one && two > three) {
            System.out.println("Второе число больше");
        }
         else if (three > two && three > one) {
            System.out.println("Третье число больше");
        }




    }}