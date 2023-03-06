import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        GryffindorStudent harry = generateGryffindorStudent("Гарри Потер");
        GryffindorStudent germiona = generateGryffindorStudent("Гермиона Грейнджер");
        GryffindorStudent ron = generateGryffindorStudent("Рон Уизли");
        PuffenduiStudent zaharia = generatePuffenduiStudent("Захария Смит");
        PuffenduiStudent sedric = generatePuffenduiStudent("Седрик Диггори");
        PuffenduiStudent djastin = generatePuffenduiStudent("Джастин Финч-Флетчли");
        KogtevranStudent chjou = generateKogtevranStudent("Чжоу Чанг");
        KogtevranStudent padma = generateKogtevranStudent("Падма Патил");
        KogtevranStudent markus = generateKogtevranStudent("Маркус Белби");
        SlizerinStudent drako = generateSlizerinStudent("Драко Малфой");
        SlizerinStudent graham = generateSlizerinStudent("Грэхэм Монтегю");
        SlizerinStudent gregory = generateSlizerinStudent("Грегори Гойл");

        harry.print();
        germiona.print();
        ron.print();
        zaharia.print();
        sedric.print();
        djastin.print();
        chjou.print();
        padma.print();
        markus.print();
        harry.print();
        drako.print();
        graham.print();
        gregory.print();

        harry.compareHogwarts(drako);
        germiona.compareHogwarts(gregory);
        harry.compareGryffindorStudent(ron);
        germiona.compareGryffindorStudent(harry);
        zaharia.comparePuffenduiStudent(djastin);
        chjou.compareKogtevranStudent(padma);
        drako.compareSlizerinStudent(gregory);
    }

    private static PuffenduiStudent generatePuffenduiStudent(String name) {
        return new PuffenduiStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static GryffindorStudent generateGryffindorStudent(String name) {
        return new GryffindorStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static KogtevranStudent generateKogtevranStudent(String name) {
        return new KogtevranStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static SlizerinStudent generateSlizerinStudent(String name) {
        return new SlizerinStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

}