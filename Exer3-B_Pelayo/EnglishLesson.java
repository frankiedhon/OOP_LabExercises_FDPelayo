public class EnglishLesson extends Lesson {
    public EnglishLesson() {
        super("English",
            new String[]{
                "English Page 1: Introduction",
                "English Page 2: Subject-Verb Agreement",
                "English Page 3: Examples",
                "English Page 4: Practice"
            },
            new String[][]{
                {"Is 'He runs fast' correct?"},
                {"They run fast?"},
                {"She plays the guitar?"},
                {"Is 'They is happy' correct?"}
            },
            new String[][]{
                {"Right"}, {"Right"}, {"Right"}, {"Wrong"}
            }
        );
    }
}
