public class Calculations {
    public static int getRandomDepartment() {
        return (int) (Math.random() * 5) + 1;
    }

    public static int getRandomSalary() {
        return (int) (Math.random() * 40_000) + 500;
    }

    public static String getRandomName() {
        String[] names = new String[]{"Ivan", "Peter", "Sergei", "Ilia"};
        String[] surnames = new String[]{"Ivanov", "Petrov", "Sidorov", "Sokolov"};
        String[] patronymic = new String[]{"Ivanovich", "Vasilevic", "Petrovic", "Valerevic"};
        return surnames[(int) (Math.random() * 4)] + " " + names[(int) (Math.random() * 4)] + " " + patronymic[(int) (Math.random() * 4)];
    }
}
