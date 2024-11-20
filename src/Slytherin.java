public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambitiousness;
    private int inventiveness;
    private int lustForPower;

    public Slytherin(String studentName, int magicPower, int trangressRange, int cunning, int determination,
    int ambitiousness, int inventiveness, int lustForPower) {
        super(studentName, magicPower, trangressRange);
        this.cunning = cunning;
        this.determination = determination;
        this.ambitiousness = ambitiousness;
        this.inventiveness = determination;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }
    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }
    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }
    public void setAmbitiousness(int ambitiousness) {
        this.ambitiousness = ambitiousness;
    }

    public int getInventiveness() {
        return inventiveness;
    }
    public void setInventiveness(int inventiveness) {
        this.inventiveness = inventiveness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\nФакультет: Слизерин, хитрость: "+ this.cunning +", решительность: "+ this.determination +", амбициозность " + this.ambitiousness +
        ", находчивость: " + this.inventiveness + ", жажда власти: " + this.lustForPower;
    }

    public String compareByFaculty(Slytherin student) {
        int thisSum = this.cunning + this.determination + this.ambitiousness + this.inventiveness + this.lustForPower;
        int studentSum = student.cunning + student.determination + student.ambitiousness + student.inventiveness + student.lustForPower;
        if(thisSum > studentSum) {
            return this.getStudentName() + " лучший Слизеринец, чем " + student.getStudentName();
        } else if(thisSum == studentSum) {
            return this.getStudentName() + " и " + student.getStudentName() + " одинаково хорошие Слизеринцы";
        } else {
            return this.getStudentName() + " худший Слизеринец, чем " + student.getStudentName();
        }
    }

}