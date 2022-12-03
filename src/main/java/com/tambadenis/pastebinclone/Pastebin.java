package com.tambadenis.pastebinclone;
import jakarta.persistence.*;

@Entity
@Table(name = "pastebins")
public class Pastebin {
    @Id
    @SequenceGenerator(
            name = "pastebins_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "pastebins_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;
    private String title;
    private String content;
    public Long getId() {
        return id;
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
}