public class Hogwarts {
    private String name;
    private int magic;
    private int range;
    public Hogwarts(String studentName, int magicPower, int trangressRange){
        this.name = studentName;
        this.magic = magicPower;
        this.range = trangressRange;
    }
    
    public int getMagicPower() {
        return magic;
    }

    public void setMagicPower(int magic) {
        this.magic = magic;
    }

    public String getStudentName() {
        return name;
    }

    public void setStudentName(String name) {
        this.name = name;
    }

    public int getTrangressRange() {
        return range;
    }

    public void setTrangressRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Студент(ка) " + this.name + ", сила магии: " + this.magic + ", расстояние трансгрессии: " + this.range;
    }

    public String compareByMagic(Hogwarts student) {
        if(this.magic > student.magic) {
            return this.name + " обладает большей мощностью магии, чем " + student.name;
        } else if(this.magic == student.magic) {
            return this.name + " и " + student.name + " имеют одинаковое расстояние трансгрессии";
        } else {
            return this.name + " обладает меньшей мощностью магии, чем " + student.name;
        }
    }

    public String compareByRange(Hogwarts student) {
        if(this.range > student.range) {
            return this.name + " обладает большим расстоянием трансгрессии, чем " + student.name;
        } else if(this.range == student.range) {
            return this.name + " и " + student.name + " имеют одинаковую мощность магии";
        } else {
            return this.name + " обладает меньшим расстоянием трансгрессии, чем " + student.name;
        }
    }
}
