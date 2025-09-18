public class EducationAppTester {
    public static void main(String[] args) {
        Lesson math = new MathLesson();
        Lesson science = new ScienceLesson();
        Lesson english = new EnglishLesson();
        Lesson history = new HistoryLesson();

        System.out.println("Lesson: " + math.getTitle());
        System.out.println("Page 1: " + math.getPages()[0]);
        System.out.println();

        System.out.println("Lesson: " + science.getTitle());
        System.out.println("Page 1: " + science.getPages()[0]);
        System.out.println();

        System.out.println("Lesson: " + english.getTitle());
        System.out.println("Page 1: " + english.getPages()[0]);
        System.out.println();

        System.out.println("Lesson: " + history.getTitle());
        System.out.println("Page 1: " + history.getPages()[0]);
    }
}
