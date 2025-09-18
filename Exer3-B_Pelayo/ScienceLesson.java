public class ScienceLesson extends Lesson {
    public ScienceLesson() {
        super("Science",
            new String[]{
                "Science Page 1: Introduction",
                "Science Page 2: Water Cycle",
                "Science Page 3: Examples",
                "Science Page 4: Summary & Practice"
            },
            new String[][]{
                {"Water is essential?"},
                {"Water boils at 100°C?"},
                {"Evaporation is water turning to vapor?"},
                {"Precipitation can be snow?"}
            },
            new String[][]{
                {"Right"}, {"Right"}, {"Right"}, {"Right"}
            }
        );
    }
}
