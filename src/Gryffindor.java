public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Gryffindor(String studentName, int magicPower, int trangressRange, int nobility, int honor, int bravery) {
        super(studentName, magicPower, trangressRange);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    
    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\nФакультет: Гриффиндор, благородство: "+ this.nobility +", честь: "+ this.honor +", храбрость" + this.bravery;
    }

    public String compareByFaculty(Gryffindor student) {
        int thisSum = this.nobility + this.honor + this.bravery;
        int studentSum = student.nobility + student.honor + student.bravery;
        if(thisSum > studentSum) {
            return this.getStudentName() + " лучший Гриффендорец, чем " + student.getStudentName();
        } else if(thisSum == studentSum) {
            return this.getStudentName() + " и " + student.getStudentName() + " одинаково хорошие Гриффендорцы";
        } else {
            return this.getStudentName() + " худший Гриффендорец, чем " + student.getStudentName();
        }
    }
}
