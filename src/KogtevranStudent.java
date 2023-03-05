public class KogtevranStudent extends HogwartsStudent {
    private int cleverness;
    private int wisdom;
    private int wit;
    private int creativity;

    public KogtevranStudent(String name, int magic, int transgression, int cleverness, int wisdom, int wit) {
        super(name, magic, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
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
    private int ability() {
        return cleverness + wisdom + wit + creativity;
    }

    public void compareKogtevranStudent(KogtevranStudent kogtevranStudent) {
        int ability1 = ability();
        int ability2 = kogtevranStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Когтеврандец %s лучше, чем Когтеврандец %s: %d VS %d%n",
                    getName(),
                    kogtevranStudent.getName(),
                    ability1,
                    ability2
            );
        } else if (ability2 > ability1) {
            System.out.printf("Когтеврандец %s лучше, че Когтеврандец %s: %d VS %d%n",
                    getName(),
                    kogtevranStudent.getName(),
                    ability1,
                    ability2
            );
        } else {
            System.out.printf("Когтеврандец %s такой же, как  Когтеврандец %s: %d VS %d%n",
                    getName(),
                    kogtevranStudent.getName(),
                    ability2,
                    ability1
            );
        }
    }
    @Override
    public String toString() {
        return String.format("%s, ,ум: %d; мудрость: %d, остроумеие: %d, творчество: %d,  super.toString(), cleverness, wisdom, wit,  creativity");
    }
}
