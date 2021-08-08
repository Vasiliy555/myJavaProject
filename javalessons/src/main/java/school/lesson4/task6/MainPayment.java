package school.lesson4.task6;

public class MainPayment {
    public static void main(String[] args) {
        // В данном случае мы из уже созданных экземпляров выбирает что и сколько купить
        Payment pay1 = new Payment();
        pay1.s1.buy();
        pay1.sh1.buy("Puma", 5);

        // В данном случае мы создаем экземпляр и именно его покупаем в нужном количестве
        Payment.Socks pay2 = new Payment().new Socks();
        pay2.buy(10);
    }
}
