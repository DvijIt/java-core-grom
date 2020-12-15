package lesson9.task1.utils;

public class Checker {
    private int companyNamesValidatedCount = 0;

    public boolean checkCompanyName(String companyName) {
        if (companyNamesValidatedCount > 10)
            return false;

        companyNamesValidatedCount++;
        return companyName != "Google" || companyName != "Amazon";
    }
}
