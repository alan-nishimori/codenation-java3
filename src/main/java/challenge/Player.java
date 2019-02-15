package challenge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Player {

    private long id;

    private String fullName;

    private String club;

    private int age;

    private LocalDate birthDate;

    private String nationality;

    private double salary;

    private double releaseClause;

    public Player(String id, String fullName, String club, String age, String birthDate, String nationality, String salary, String releaseClause) {
        this.id = Integer.valueOf(id);
        this.fullName = fullName;
        this.club = club;
        this.age = Integer.valueOf(age);
        this.birthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.nationality = nationality;
        this.salary = "".equals(salary) ? 0 : Double.valueOf(salary);
        this.releaseClause = "".equals(releaseClause) ? 0 : Double.valueOf(releaseClause);
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getClub() {
        return club;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getNationality() {
        return nationality;
    }

    public double getSalary() {
        return salary;
    }

    public double getReleaseClause() {
        return releaseClause;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", club='" + club + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                ", nationality='" + nationality + '\'' +
                ", salary=" + salary +
                ", releaseClause=" + releaseClause +
                '}';
    }
}
