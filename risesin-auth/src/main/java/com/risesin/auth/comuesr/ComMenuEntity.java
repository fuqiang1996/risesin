package com.risesin.auth.comuesr;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "com_menu", schema = "risesin", catalog = "")
public class ComMenuEntity {
    private int pkMenuId;
    private String menuName;
    private Integer menuParentId;
    private String menuType;
    private String menuUrl;
    private Integer menuIsOpen;
    private String menuIcon;
    private Timestamp menuAddtime;
    private Timestamp menuLastmodified;
    private Integer menuDelflag;
    private Integer menuOrderNum;

    @Id
    @Column(name = "pk_menu_id", nullable = false)
    public int getPkMenuId() {
        return pkMenuId;
    }

    public void setPkMenuId(int pkMenuId) {
        this.pkMenuId = pkMenuId;
    }

    @Basic
    @Column(name = "menu_name", nullable = true, length = 50)
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Basic
    @Column(name = "menu_parent_id", nullable = true)
    public Integer getMenuParentId() {
        return menuParentId;
    }

    public void setMenuParentId(Integer menuParentId) {
        this.menuParentId = menuParentId;
    }

    @Basic
    @Column(name = "menu_type", nullable = true, length = 50)
    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    @Basic
    @Column(name = "menu_url", nullable = true, length = 50)
    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    @Basic
    @Column(name = "menu_is_open", nullable = true)
    public Integer getMenuIsOpen() {
        return menuIsOpen;
    }

    public void setMenuIsOpen(Integer menuIsOpen) {
        this.menuIsOpen = menuIsOpen;
    }

    @Basic
    @Column(name = "menu_icon", nullable = true, length = 50)
    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    @Basic
    @Column(name = "menu_addtime", nullable = true)
    public Timestamp getMenuAddtime() {
        return menuAddtime;
    }

    public void setMenuAddtime(Timestamp menuAddtime) {
        this.menuAddtime = menuAddtime;
    }

    @Basic
    @Column(name = "menu_lastmodified", nullable = true)
    public Timestamp getMenuLastmodified() {
        return menuLastmodified;
    }

    public void setMenuLastmodified(Timestamp menuLastmodified) {
        this.menuLastmodified = menuLastmodified;
    }

    @Basic
    @Column(name = "menu_delflag", nullable = true)
    public Integer getMenuDelflag() {
        return menuDelflag;
    }

    public void setMenuDelflag(Integer menuDelflag) {
        this.menuDelflag = menuDelflag;
    }

    @Basic
    @Column(name = "menu_order_num", nullable = true)
    public Integer getMenuOrderNum() {
        return menuOrderNum;
    }

    public void setMenuOrderNum(Integer menuOrderNum) {
        this.menuOrderNum = menuOrderNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComMenuEntity that = (ComMenuEntity) o;
        return pkMenuId == that.pkMenuId &&
                Objects.equals(menuName, that.menuName) &&
                Objects.equals(menuParentId, that.menuParentId) &&
                Objects.equals(menuType, that.menuType) &&
                Objects.equals(menuUrl, that.menuUrl) &&
                Objects.equals(menuIsOpen, that.menuIsOpen) &&
                Objects.equals(menuIcon, that.menuIcon) &&
                Objects.equals(menuAddtime, that.menuAddtime) &&
                Objects.equals(menuLastmodified, that.menuLastmodified) &&
                Objects.equals(menuDelflag, that.menuDelflag) &&
                Objects.equals(menuOrderNum, that.menuOrderNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkMenuId, menuName, menuParentId, menuType, menuUrl, menuIsOpen, menuIcon, menuAddtime, menuLastmodified, menuDelflag, menuOrderNum);
    }
}
