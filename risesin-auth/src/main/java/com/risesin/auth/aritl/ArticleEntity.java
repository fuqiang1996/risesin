package com.risesin.auth.aritl;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "article", schema = "risesin", catalog = "")
public class ArticleEntity {
    private int pkId;
    private Integer fkExtComUserId;
    private String artTitle;
    private String artSubhead;
    private String artRemark;
    private Integer artOntop;
    private Timestamp artLastmodify;
    private String artKeywords;
    private Integer artIselite;
    private String artIntro;
    private String artImg;
    private Integer artHits;
    private Integer artDelflag;
    private String artCopyfrom;
    private String artContent;
    private String artAuthor;
    private Timestamp artAddtime;

    @Id
    @Column(name = "pk_id", nullable = false)
    public int getPkId() {
        return pkId;
    }

    public void setPkId(int pkId) {
        this.pkId = pkId;
    }

    @Basic
    @Column(name = "fk_ext_com_user_id", nullable = true)
    public Integer getFkExtComUserId() {
        return fkExtComUserId;
    }

    public void setFkExtComUserId(Integer fkExtComUserId) {
        this.fkExtComUserId = fkExtComUserId;
    }

    @Basic
    @Column(name = "art_title", nullable = true, length = 50)
    public String getArtTitle() {
        return artTitle;
    }

    public void setArtTitle(String artTitle) {
        this.artTitle = artTitle;
    }

    @Basic
    @Column(name = "art_subhead", nullable = true, length = 50)
    public String getArtSubhead() {
        return artSubhead;
    }

    public void setArtSubhead(String artSubhead) {
        this.artSubhead = artSubhead;
    }

    @Basic
    @Column(name = "art_remark", nullable = true, length = 500)
    public String getArtRemark() {
        return artRemark;
    }

    public void setArtRemark(String artRemark) {
        this.artRemark = artRemark;
    }

    @Basic
    @Column(name = "art_ontop", nullable = true)
    public Integer getArtOntop() {
        return artOntop;
    }

    public void setArtOntop(Integer artOntop) {
        this.artOntop = artOntop;
    }

    @Basic
    @Column(name = "art_lastmodify", nullable = true)
    public Timestamp getArtLastmodify() {
        return artLastmodify;
    }

    public void setArtLastmodify(Timestamp artLastmodify) {
        this.artLastmodify = artLastmodify;
    }

    @Basic
    @Column(name = "art_keywords", nullable = true, length = 50)
    public String getArtKeywords() {
        return artKeywords;
    }

    public void setArtKeywords(String artKeywords) {
        this.artKeywords = artKeywords;
    }

    @Basic
    @Column(name = "art_iselite", nullable = true)
    public Integer getArtIselite() {
        return artIselite;
    }

    public void setArtIselite(Integer artIselite) {
        this.artIselite = artIselite;
    }

    @Basic
    @Column(name = "art_intro", nullable = true, length = 50)
    public String getArtIntro() {
        return artIntro;
    }

    public void setArtIntro(String artIntro) {
        this.artIntro = artIntro;
    }

    @Basic
    @Column(name = "art_img", nullable = true, length = 50)
    public String getArtImg() {
        return artImg;
    }

    public void setArtImg(String artImg) {
        this.artImg = artImg;
    }

    @Basic
    @Column(name = "art_hits", nullable = true)
    public Integer getArtHits() {
        return artHits;
    }

    public void setArtHits(Integer artHits) {
        this.artHits = artHits;
    }

    @Basic
    @Column(name = "art_delflag", nullable = true)
    public Integer getArtDelflag() {
        return artDelflag;
    }

    public void setArtDelflag(Integer artDelflag) {
        this.artDelflag = artDelflag;
    }

    @Basic
    @Column(name = "art_copyfrom", nullable = true, length = 50)
    public String getArtCopyfrom() {
        return artCopyfrom;
    }

    public void setArtCopyfrom(String artCopyfrom) {
        this.artCopyfrom = artCopyfrom;
    }

    @Basic
    @Column(name = "art_content", nullable = true, length = -1)
    public String getArtContent() {
        return artContent;
    }

    public void setArtContent(String artContent) {
        this.artContent = artContent;
    }

    @Basic
    @Column(name = "art_author", nullable = true, length = 50)
    public String getArtAuthor() {
        return artAuthor;
    }

    public void setArtAuthor(String artAuthor) {
        this.artAuthor = artAuthor;
    }

    @Basic
    @Column(name = "art_addtime", nullable = true)
    public Timestamp getArtAddtime() {
        return artAddtime;
    }

    public void setArtAddtime(Timestamp artAddtime) {
        this.artAddtime = artAddtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleEntity that = (ArticleEntity) o;
        return pkId == that.pkId &&
                Objects.equals(fkExtComUserId, that.fkExtComUserId) &&
                Objects.equals(artTitle, that.artTitle) &&
                Objects.equals(artSubhead, that.artSubhead) &&
                Objects.equals(artRemark, that.artRemark) &&
                Objects.equals(artOntop, that.artOntop) &&
                Objects.equals(artLastmodify, that.artLastmodify) &&
                Objects.equals(artKeywords, that.artKeywords) &&
                Objects.equals(artIselite, that.artIselite) &&
                Objects.equals(artIntro, that.artIntro) &&
                Objects.equals(artImg, that.artImg) &&
                Objects.equals(artHits, that.artHits) &&
                Objects.equals(artDelflag, that.artDelflag) &&
                Objects.equals(artCopyfrom, that.artCopyfrom) &&
                Objects.equals(artContent, that.artContent) &&
                Objects.equals(artAuthor, that.artAuthor) &&
                Objects.equals(artAddtime, that.artAddtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkId, fkExtComUserId, artTitle, artSubhead, artRemark, artOntop, artLastmodify, artKeywords, artIselite, artIntro, artImg, artHits, artDelflag, artCopyfrom, artContent, artAuthor, artAddtime);
    }
}
