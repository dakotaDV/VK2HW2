public class PuffenduiStudent extends HogwartsStudent {
        private int hardworking;
        private int loyalty;
        private int honesty;

        public PuffenduiStudent(String name, int magic, int transgression, int hardworking, int loyalty, int honesty) {
            super(name, magic, transgression);
            this.hardworking = hardworking;
            this.loyalty = loyalty;
            this.honesty = honesty;
        }
        //hardworking loyal honest
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
        private int ability() {
            return hardworking + loyalty + honesty ;
        }

        public void comparePuffenduiStudent(PuffenduiStudent puffenduiStudent) {
            int ability1 = ability();
            int ability2 = puffenduiStudent.ability();
            if (ability1 > ability2) {
                System.out.printf("Пуффендуец %s лучше, чем Пуффендуец %s: %d VS %d%n",
                        getName(),
                        puffenduiStudent.getName(),
                        ability1,
                        ability2
                );
            } else if (ability2 > ability1) {
                System.out.printf("Пуффендуец %s лучше, чем Пуффендуец %s: %d VS %d%n",
                        getName(),
                        puffenduiStudent.getName(),
                        ability1,
                        ability2
                );
            } else {
                System.out.printf("Пуффендуец %s такой же, как Пуффендуец %s: %d VS %d%n",
                        getName(),
                        puffenduiStudent.getName(),
                        ability2,
                        ability1
                );
            }
        }

    @Override
    public String toString() {
        return "PuffenduiStudent{" +
                "трудолюбие=" + hardworking +
                ", верность=" + loyalty +
                ", честность=" + honesty +
                "} " + super.toString();
    }
}


