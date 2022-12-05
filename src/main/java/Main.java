import ru.netology.sqr.lessonPackages.services.SqrtService;

public class Main {

    public static void main(String[] args) {
        SqrtService service = new SqrtService();
        System.out.println(service.calcSqrt(10,99));
    }
}