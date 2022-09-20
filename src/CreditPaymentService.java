public class CreditPaymentService {
    // n - срок кредита, кол-во месяцев; s - сумма кредита; p - годовой процент; iR - Interest Rate (процентная ставка).
    public double annuity(int loanPeriod, int creditAmount) {
        double results; // Ежемесячный платеж result = k * s, где k - коэффициент аннуитета, k = a / b;

        double numeratorFormula; // числитель numeratorFormula = iRMonth * exponentiation, где iRMonth = iR / 12 / 100, где iR - годовая ставка по кредиту; exponentiation = iRMonth1 ^ loanPeriod, где iRMonth1 = 1 + iRMonth; loanPeriod — количество месяцев, в течение которых выплачивается кредит.
        double denominatorFormula; // знаменатель denominatorFormula = exponentiation - 1.
        double iR = 9.99;
        double iRMonth;
        iRMonth = iR / 12 / 100;

        double iRMonth1;
        iRMonth1 = 1 + iRMonth;

        double exponentiation = iRMonth1;
        for (int g = 0; g < (loanPeriod - 1); g++) {
            iRMonth1 *= exponentiation;
        }

        numeratorFormula = iRMonth * iRMonth1;
        denominatorFormula = iRMonth1 - 1;
        results = (numeratorFormula / denominatorFormula) * creditAmount;

        return results;

    }
}
