package finalexam.task1;

public class Post implements Drawable {
    private String title;
    private String content;
    private String author;

    public Post(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void addComment(String comment) {
        // Add the comment to the post
    }

    public void likePost() {
        // Increase the like count of the post
    }

    @Override
    public void draw() {
        System.out.println("Displaying post titled " + title + " by " + author);
    }
}