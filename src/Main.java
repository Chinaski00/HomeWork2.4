import java.util.*;


public class Main {
    static Queue<String> queue1 = new ArrayDeque<>(5);
    static Queue<String> queue2 = new ArrayDeque<>(5);

    public static void addHuman(String name) {
        if (queue1.size() >= queue2.size()) {
            queue2.offer(name);
        } else {
            queue1.offer(name);
        }
        if (queue1.size() == 5 || queue2.size() == 5) {
            System.out.println("Позвать Галю");
        }
    }

    public static void removeHuman() {
        Random random = new Random(2);
        int max = 2;
        int min = 1;
        max -= min;
        int rnd = (int) ((Math.random() * ++max) + min);
        if (rnd == 2) {
            queue1.poll();
        } else {
            queue2.poll();
        }
    }

    public static void main(String[] args) {

        queue1.add("Костя");
        queue1.add("Катя");
        queue1.add("Андрей");
        queue1.add("Сергей");
        queue1.add("Максим");

        queue2.add("Людмила");
        queue2.add("Анатолий");
        queue2.add("Евгений");
        queue2.add("Татьяна");
        queue2.add("Олег");


        //Задача 3 шахматы
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                if (i % 2 == j % 2){
                    biDemArrList.get(i).add(j, "◯");
                } else {
                    biDemArrList.get(i).add(j, "●");
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}