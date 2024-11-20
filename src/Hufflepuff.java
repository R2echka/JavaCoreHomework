public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyalty;
    private int honesty;
    public Hufflepuff(String studentName, int magicPower, int trangressRange, int hardworking, int loyalty, int honesty) {
        super(studentName, magicPower, trangressRange);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    
    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\nФакультет: Пуффендуй, трудолюбивость: "+ this.hardworking +", верность: "+ this.loyalty +", честность" + this.honesty;
    }

    public String compareByFaculty(Hufflepuff student) {
        int thisSum = this.hardworking + this.loyalty + this.honesty;
        int studentSum = student.hardworking + student.loyalty + student.honesty;
        if(thisSum > studentSum) {
            return this.getStudentName() + " лучший Пуффендуец, чем " + student.getStudentName();
        } else if(thisSum == studentSum) {
            return this.getStudentName() + " и " + student.getStudentName() + " одинаково хорошие Пуффендуйцы";
        } else {
            return this.getStudentName() + " худший Пуффендуец, чем " + student.getStudentName();
        }
    }
}
