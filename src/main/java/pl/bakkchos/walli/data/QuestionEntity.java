package pl.bakkchos.walli.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"questions\"")
public class QuestionEntity {
    @Id
    private Integer id;
    private String title;
    private String content;
    private Integer authorid;

    public QuestionEntity(Integer id, String title, String content, Integer authorid) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.authorid = authorid;
    }

    public QuestionEntity() {
    }
    public QuestionEntity(QuestionEntity questionEntity) {
        this.id=questionEntity.id;
        this.authorid=questionEntity.authorid;
        this.content=questionEntity.content;
        this.title=questionEntity.title;
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

    public Integer getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Integer authorid) {
        this.authorid = authorid;
    }
}
