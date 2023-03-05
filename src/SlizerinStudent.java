public class SlizerinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public SlizerinStudent(String name, int magic, int transgression, int cunning, int determination, int ambition) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
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

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    private int ability() {
        return cunning + determination + ambition + resourcefulness + thirstForPower ;
    }

    public void compareSlizerinStudent(SlizerinStudent slizerinStudent) {
        int ability1 = ability();
        int ability2 = slizerinStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Слизериндец %s лучше, чем Слизериндец %s: %d VS %d%n",
                    getName(),
                    slizerinStudent.getName(),
                    ability1,
                    ability2
            );
        } else if (ability2 > ability1) {
            System.out.printf("Слизериндец %s лучше, чем Слизериндец %s: %d VS %d%n",
                    getName(),
                    slizerinStudent.getName(),
                    ability1,
                    ability2
            );
        } else {
            System.out.printf("Слизериндец %s такой же, как Слизериндец %s: %d VS %d%n",
                    getName(),
                    slizerinStudent.getName(),
                    ability2,
                    ability1
            );
        }
    }
    @Override
    public String toString() {
        return String.format("%s, хитрость: %d; решительсть: %d, амбициозность: %d, super.toString(), cunning, determination,  ambition,  resourcefulness, thirstForPower");
    }
}