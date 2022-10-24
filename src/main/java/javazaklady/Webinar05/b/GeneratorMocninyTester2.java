package javazaklady.Webinar05.b;




public class GeneratorMocninyTester2
{
    public class Main {

        public static void main(String[] args) {
            GeneratorMocniny generatorMocniny = new GeneratorMocniny(10);
            for (int i = 1; i <= 10; i++) {
                System.out.println(generatorMocniny.dalsiaMocnina());
            }
        }

    }
}
