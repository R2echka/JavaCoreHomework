public class Ravenclaw extends Hogwarts {
    private int intelegency;
    private int wisdom;
    private int wit;
    private int creativity;
    public Ravenclaw(String studentName, int magicPower, int trangressRange, int intelegency, int wisdom, int wit, int creativity) {
        super(studentName, magicPower, trangressRange);
        this.intelegency = intelegency;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelegency() {
        return intelegency;
    }

    public void setIntelegency(int intelegency) {
        this.intelegency = intelegency;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\nФакультет: Когтевран, ум: "+ this.intelegency +", мудрость: "+ this.wisdom +", остроумие" + this.wit +", творческие способности " + this.creativity;
    }

    public String compareByFaculty(Ravenclaw student) {
        int thisSum = this.intelegency + this.wisdom + this.wit + this.creativity;
        int studentSum = student.intelegency + student.wisdom + student.wit + student.creativity;
        if(thisSum > studentSum) {
            return this.getStudentName() + " лучший Когтевранец, чем " + student.getStudentName();
        } else if(thisSum == studentSum) {
            return this.getStudentName() + " и " + student.getStudentName() + " одинаково хорошие Когтевранцы";
        } else {
            return this.getStudentName() + " худший Когтевранец, чем " + student.getStudentName();
        }
    }
}
