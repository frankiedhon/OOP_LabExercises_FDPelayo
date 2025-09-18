public class MathLesson extends Lesson {
    public MathLesson() {
        super("Math",
            new String[]{
                "Math Page 1: Introduction",
                "Math Page 2: Addition",
                "Math Page 3: Subtraction",
                "Math Page 4: Summary & Practice"
            },
            new String[][]{
                {"7 + 5 = 12?"},
                {"15 - 9 = 6?"},
                {"4 × 3 = 12?"},
                {"12 ÷ 4 = 3?"}
            },
            new String[][]{
                {"Right"}, {"Right"}, {"Right"}, {"Right"}
            }
        );
    }
}
