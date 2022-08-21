public class CreditPaymentService {
        // n - срок кредита, кол-во месяцев; s - сумма кредита; p - годовой процент.
        public double annuity(int n, int s) {
                double results; // Ежемесячный платеж result = k * s, где k - коэффициент аннуитета, k = a / b;

                double a; // числитель a = i * x, где i = f2 / 100, где f = p / 12; х = y ^ n, где y = 1 + i.

                double b; // знаменатель b = x - 1.
                double p = 9.99;

                double f = p / 12;
                for (int g=1; g <= 1; g++) {
                        p /= 12;
                }

                double i;
                i = f / 100;


                double y;
                y = 1 + i;
                double x = y;
                for(int g = 0; g < (n-1); g++) {
                        y *= x;
                }
                a = i * y;
                b = y - 1;
                results = (a/b) * s;

                        return results;

        }
}
