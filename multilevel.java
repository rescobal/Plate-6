public class multilevel extends Student {
    private int year;

    public multilevel() {
        super();
        year = 0;
    }

    public multilevel(String name, String gender, int age, int studentId, String course, int year) {
        super(name, gender, age, studentId, course);
        this.year = year;
    }

    

    @Override
    public String getPersonInfo() {
        return super.getPersonInfo() + "\t" + year;
    }

    @Override
    public String getPersonInfo2() {
        return super.getPersonInfo2() + "Year\t: " + year + "\n";
    }
}