
package com.javasampleapproach.angularjs.model; /**
 * Created by akash on 19/7/17.
 */
import javax.persistence.*;

@Entity
@Table(name = "client_data")
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name="doing")
    private Integer doing;

    @Column(name="to_do")
    private Integer to_do;

    @Column(name="done")
    private Integer done;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String Title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getDoing() {
        return doing;
    }

    public void setDoing(Integer doing) {
        this.doing = doing;
    }

    public Integer getTo_do() {
        return to_do;
    }

    public void setTo_do(Integer to_do) {
        this.to_do = to_do;
    }

    public Integer getDone() {
        return done;
    }

    public void setDone(Integer done) {
        this.done = done;
    }

    public Data(){
    }
    public Data(String title,String content){
        this.title=title;
        this.content=content;
    }
}


