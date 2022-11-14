public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");

        People maxim = new People(" Максим", "Минск", 1983, "бренд менеджер");
        People aya = new People("Аня", "Москва", 1993, "методист образовательных программ");
        People katya = new People(" Катя", "Калининград", 1995, "продакт менеджер");
        People artem = new People(" Артем", "Москва", 1992, "директор по развитию бизнеса");

        maxim.znakomstvo();
        aya.znakomstvo();
        katya.znakomstvo();
        artem.znakomstvo();

        System.out.println("\n");
        maxim.znakomstvoAndJob();
        aya.znakomstvoAndJob();
        katya.znakomstvoAndJob();
        artem.znakomstvoAndJob();
    }
}