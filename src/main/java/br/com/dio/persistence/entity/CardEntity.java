package br.com.dio.persistence.entity;

import java.time.OffsetDateTime;

public class CardEntity {

    private Long id;
    private String title;
    private String description;
    private OffsetDateTime addedAt;
    private OffsetDateTime movedAt;
    private BoardColumnEntity boardColumn = new BoardColumnEntity();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BoardColumnEntity getBoardColumn() {
        return boardColumn;
    }

    public void setBoardColumn(BoardColumnEntity boardColumn) {
        this.boardColumn = boardColumn;
    }

    public OffsetDateTime getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(OffsetDateTime addedAt) {
        this.addedAt = addedAt;
    }

    public OffsetDateTime getMovedAt() {
        return movedAt;
    }

    public void setMovedAt(OffsetDateTime movedAt) {
        this.movedAt = movedAt;
    }
}
