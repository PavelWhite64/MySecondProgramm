public class main {
    public static void main(String[] args) {
        int Score = 100;
        int Amoun = 1100;
        int Bonus;
        if (Amoun > 1000) {
            Bonus = Amoun / 100;
        } else {
            Bonus = 0;
        }
        int finishScore = Score + Amoun + Bonus;

        System.out.println("Пополнение счета составило " + Amoun);
        System.out.println("Бонусные баллы = " + Bonus);
        System.out.println("Баланс = " + finishScore);


    }
}
