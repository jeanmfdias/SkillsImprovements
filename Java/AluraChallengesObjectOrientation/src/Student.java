public class Student {
    private String name;
    private int age;
    private double score1;
    private double score2;
    private double score3;
    private double score4;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore1() {
        return score1;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public double getScore3() {
        return score3;
    }

    public void setScore3(double score3) {
        this.score3 = score3;
    }

    public double getScore4() {
        return score4;
    }

    public void setScore4(double score4) {
        this.score4 = score4;
    }

    public void details() {
        String message = """
                Name: %s
                Age: %d
                """.formatted(name, age);
        System.out.println(message);
    }

    public double getAverege() {
        double sum = this.score1 + this.score2 + this.score3 + this.score4;
        if (sum > 0) {
            return sum / 4;
        }
        return 0;
    }
}
