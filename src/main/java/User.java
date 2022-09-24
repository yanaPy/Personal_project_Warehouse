public class User {

    private final String name;
    private final String surname;
    private final String patronymic;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public User(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;

    }

    @Override
    public String toString() {
        return "User{" +
                "name: '" + name + '\'' +
                ", surname: '" + surname + '\'' +
                ", patronymic: '" + patronymic + '\'' +
                '}';
    }
}
