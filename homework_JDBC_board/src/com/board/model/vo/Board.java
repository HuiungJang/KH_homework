package com.board.model.vo;

import java.util.Objects;

public class Board {
    private int writeNumber;
    private String div;
    private String title;
    private String content;
    private String date;

    public Board() {
    }

    public Board(int writeNumber, String div, String title, String content, String date) {
        this.writeNumber = writeNumber;
        this.div = div;
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public Board(String div, String title, String content) {
        this.div = div;
        this.title = title;
        this.content = content;
    }

    public int getWriteNumber() {
        return writeNumber;
    }

    public void setWriteNumber(int writeNumber) {
        this.writeNumber = writeNumber;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return writeNumber == board.writeNumber && Objects.equals(div, board.div) && Objects.equals(title, board.title) && Objects.equals(content, board.content) && Objects.equals(date, board.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(writeNumber, div, title, content, date);
    }

    @Override
    public String toString() {
        return "Board{" +
                "writeNumber=" + writeNumber +
                ", div='" + div + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
