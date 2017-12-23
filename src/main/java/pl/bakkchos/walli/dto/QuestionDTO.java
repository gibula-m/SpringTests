package pl.bakkchos.walli.dto;

public class QuestionDTO {
    private Integer id;
    private String title;
    private String content;
    private Integer author_id;


    public QuestionDTO(Integer id, String title, String content, Integer author_id) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author_id = author_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }
}
