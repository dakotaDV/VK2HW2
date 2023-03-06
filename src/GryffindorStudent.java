public class GryffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudent(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
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

    private int ability() {
        return nobility + honor + bravery;
    }

    public void compareGryffindorStudent(GryffindorStudent gryffindorStudent) {
        int ability1 = ability();
        int ability2 = gryffindorStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Гриффиндорец %s лучше, чем Гриффиндорец %s: %d VS %d%n",
                    getName(),
                    gryffindorStudent.getName(),
                    ability1,
                    ability2
            );
        } else if (ability2 > ability1) {
            System.out.printf("Гриффиндорец %s лучше, чем Гриффиндорец %s: %d VS %d%n",
                    getName(),
                    gryffindorStudent.getName(),
                    ability1,
                    ability2
            );
        } else {
            System.out.printf("Гриффиндорец %s такой же, как  Гриффиндорец %s: %d VS %d%n",
                    getName(),
                    gryffindorStudent.getName(),
                    ability2,
                    ability1
            );
        }
    }

    @Override
    public String toString() {
        return "GryffindorStudent{" +
                "благородство=" + nobility +
                ", честь=" + honor +
                ", храбрость=" + bravery +
                "} " + super.toString();
    }
}