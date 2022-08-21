public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        java.text.DecimalFormat df = new java.text.DecimalFormat("#");

        // По заданию
        System.out.println();
        System.out.println("Сумма кредита: 1 000 000₽, срок кредита: 1год");
        System.out.println("Ежемесячный платеж: " + df.format(service.annuity(12, 1000000)) + " ₽");

        System.out.println();
        System.out.println("Сумма кредита: 1 000 000₽, срок кредита: 2года");
        System.out.println("Ежемесячный платеж: " + df.format(service.annuity(24, 1000000)) + " ₽");

        System.out.println();
        System.out.println("Сумма кредита:1 000 000₽, срок кредита: 3года:");
        System.out.println("Ежемесячный платеж: " + df.format(service.annuity(36, 1000000)) + " ₽");

        // Дополнительно
        System.out.println();
        System.out.println("Сумма кредита: 1 310 000₽, срок кредита: 1год 2месяца");
        System.out.println("Ежемесячный платеж: " + df.format(service.annuity(14, 1310000)) + " ₽");

        System.out.println();
        System.out.println("Сумма кредита: 5 000 000₽, срок кредита: 2года 1месяц");
        System.out.println("Ежемесячный платеж: " + df.format(service.annuity(25, 5000000)) + " ₽");

        System.out.println();
        System.out.println("Сумма кредита: 4 567 999₽, срок кредита: 4года");
        System.out.println("Ежемесячный платеж: " + df.format(service.annuity(48, 4567999)) + " ₽");

    }
}

