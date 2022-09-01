public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

        public static void task1(){
            int age = 15;
            if (age >= 18) {
                System.out.println("Поздравляем с совершеннолетием!!!");
            }
            if (age < 18) {
                System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
            }
        }
        public static void task2() {
            int age = 9;
            if (age >= 7 && age < 18) {
                System.out.println("Ребенок ходит в школу");
            }
            if (age >= 18 && age < 24) {
                System.out.println("Человек уже закончил школу и может отправляться в университет");
            }
            if (age >= 24) {
                System.out.println("Человек окончил университет и ему пора искать первую работу");
            }
        }
        public static void task3() {
            int places = 102;
            int seating = 60;
            int standing = places - seating;
            int passengers = 55;

            if (passengers < seating) {
                System.out.printf("В вагоне %d сидячих и %d стоячих мест\n", seating - passengers, standing);
            }
            if (passengers >= seating && passengers < places) {
                System.out.printf("В вагоне 0 сидячих и %d стоячих мест\n", standing - (passengers%seating));
            }
            if (passengers >= places) {
                System.out.printf("В вагоне нет мест\n");
            }
        }
        public static void task4(){
            int age = 15;
            if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!!!");
            } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
            }
        }
    public static void task5() {
        int age = 9;
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        } else {
            if (age >= 18 && age < 24) {
                System.out.println("Человек уже закончил школу и может отправляться в университет");
            } else {
                if (age >= 24) {
                    System.out.println("Человек окончил университет и ему пора искать первую работу");
                }
            }
        }
    }
    public static void task6() {
        int places = 102;
        int seating = 60;
        int standing = places - seating;
        int passengers = 68;

        if (passengers < seating) {
            System.out.printf("В вагоне %d сидячих и %d стоячих мест\n", seating - passengers, standing);
        } else {
            if (passengers >= seating && passengers < places) {
                System.out.printf("В вагоне 0 сидячих и %d стоячих мест\n", standing - (passengers % seating));
            } else {
                if (passengers >= places) {
                    System.out.printf("В вагоне нет мест\n");
                }
            }
        }
    }

    public static void task7() {
        int age = 15;
        if (age > 2 && age <= 6) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад\n", age);
        } else {
            if (age > 6 && age <= 18) {
                System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу\n", age);
            } else {
                if (age > 18 && age <= 24) {
                    System.out.printf("Если возраст человека равен %d, то ему нужно ходить в университет\n", age);
                } else {
                    if (age > 24) {
                        System.out.printf("Если возраст человека равен %d, то ему нужно ходить на работу\n", age);
                    }
                }
            }
        }
    }
    public static void task8() {
        int age = 10;
        if (age < 5) {
            System.out.println("Вы не можете кататься на атракционе");
        } else {
            if (age >= 5 && age < 14) {
                System.out.println("Вы можете кататься на атракционе только в сопровождении взрослого");
            } else {
                if (age >= 14) {
                    System.out.println("Вы можете кататься на атракционе");
                }
            }
        }
    }

    public static void task9() {
        int one = 19;
        int two = 6;
        int free = 9;

        if (one > two && one > free) {
            System.out.printf("число %d больше всех\n", one);
        } else {
            if (two > one && two > free) {
                System.out.printf("число %d больше всех\n", two);
            } else {
                if (free > one && free > two) {
                    System.out.printf("Число %d больше всех\n", free);
                }
            }
        }
    }
}