package com.dongzj.common.dongzj.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @mbg.generated
 */
public class Article implements Serializable {
    /**
     * @mbg.generated
     */
    private Integer id;

    /**
     * @mbg.generated
     */
    private String title;

    /**
     * @mbg.generated
     */
    private String author;

    /**
     * @mbg.generated
     */
    private String fileName;

    /**
     * 状态
     * @mbg.generated
     */
    private Short state;

    /**
     * 创建时间
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * 更新时间
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     * @mbg.generated
     */
    private String content;

    /**
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * @mbg.generated
     */
    private Map<String, Boolean> selectiveColumns = new HashMap<String, Boolean>();

    /**
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * @mbg.generated
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @mbg.generated
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * @mbg.generated
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @mbg.generated
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * @mbg.generated
     */
    public Short getState() {
        return state;
    }

    /**
     * @mbg.generated
     */
    public void setState(Short state) {
        this.state = state;
    }

    /**
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", author=").append(author);
        sb.append(", fileName=").append(fileName);
        sb.append(", state=").append(state);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }

    /**
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Article other = (Article) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getFileName() == null ? other.getFileName() == null : this.getFileName().equals(other.getFileName()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    /**
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getFileName() == null) ? 0 : getFileName().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    /**
     * @mbg.generated
     */
    public static Article.Builder builder() {
        return new Article.Builder();
    }

    /**
     * @mbg.generated
     */
    public boolean hasSelective() {
        return this.selectiveColumns.size() > 0;
    }

    /**
     * @mbg.generated
     */
    public boolean hasSelective(String column) {
        return this.selectiveColumns.get(column) != null;
    }

    /**
     * @mbg.generated
     */
    public Article selective(Column ... columns) {
        this.selectiveColumns.clear();
        if (columns != null) {
            for (Column column : columns) {
                this.selectiveColumns.put(column.value(), true);
            }
        }
        return this;
    }

    /**
     * @mbg.generated
     */
    public static class Builder {
        /**
         * @mbg.generated
         */
        private Article obj;

        /**
         * @mbg.generated
         */
        public Builder() {
            this.obj = new Article();
        }

        /**
         * @mbg.generated
         */
        public Builder id(Integer id) {
            obj.setId(id);
            return this;
        }

        /**
         * @mbg.generated
         */
        public Builder title(String title) {
            obj.setTitle(title);
            return this;
        }

        /**
         * @mbg.generated
         */
        public Builder author(String author) {
            obj.setAuthor(author);
            return this;
        }

        /**
         * @mbg.generated
         */
        public Builder fileName(String fileName) {
            obj.setFileName(fileName);
            return this;
        }

        /**
         * @mbg.generated
         */
        public Builder state(Short state) {
            obj.setState(state);
            return this;
        }

        /**
         * @mbg.generated
         */
        public Builder gmtCreate(Date gmtCreate) {
            obj.setGmtCreate(gmtCreate);
            return this;
        }

        /**
         * @mbg.generated
         */
        public Builder gmtModified(Date gmtModified) {
            obj.setGmtModified(gmtModified);
            return this;
        }

        /**
         * @mbg.generated
         */
        public Builder content(String content) {
            obj.setContent(content);
            return this;
        }

        /**
         * @mbg.generated
         */
        public Article build() {
            return this.obj;
        }
    }

    /**
     * @mbg.generated
     */
    public enum Column {
        id("id"),
        title("title"),
        author("author"),
        fileName("file_name"),
        state("state"),
        gmtCreate("gmt_create"),
        gmtModified("gmt_modified"),
        content("content");

        /**
         * @mbg.generated
         */
        private final String column;

        /**
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * @mbg.generated
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * @mbg.generated
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * @mbg.generated
         */
        public String asc() {
            return this.column + " ASC";
        }
    }

    public static void main(String[] args) {
        Article article = new Article();
        article.setContent("一本具有中国特色的小说");
        article.setAuthor("刘慈欣");
        article.setTitle("三体");
        article.setFileName("Three body problem");
        System.out.println(article.toString());
    }
}