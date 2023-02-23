public class main {
    public static void main(String[] args) {
        int score = 100;
        int amoun = 32176;
        int bonus;
        if (amoun >= 1000) {
            bonus = amoun / 100;
        } else {
            bonus = 0;
        }
        int finishScore = score + amoun + bonus;

        System.out.println("Пополнение счета составило " + amoun);
        System.out.println("Бонусные баллы = " + bonus);
        System.out.println("Баланс = " + finishScore);


    }
    }
