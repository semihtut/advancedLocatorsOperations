package salary;

public class Income {
    final private static int salary = 3500;

    public int allExpenses(){
        return ConfigReader.getAllExpensesAsMap().values()
                .stream()
                .mapToInt(Integer::valueOf)
                .sum();
    }

    public int moneyInMyPocket(){
        return salary-allExpenses();
    }
}
