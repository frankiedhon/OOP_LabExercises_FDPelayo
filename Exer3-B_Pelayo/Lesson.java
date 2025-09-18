public class Lesson {
    private final String title;
    private final String[] pages;
    private final String[][] questions;
    private final String[][] answers;

    public Lesson(String title, String[] pages, String[][] questions, String[][] answers) {
        this.title = title;
        this.pages = pages;
        this.questions = questions;
        this.answers = answers;
    }

    public String getTitle() {
        return title;
    }

    public String[] getPages() {
        return pages;
    }

    public String[][] getQuestions() {
        return questions;
    }

    public String[][] getAnswers() {
        return answers;
    }
}
