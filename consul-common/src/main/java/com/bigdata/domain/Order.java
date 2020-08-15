package com.bigdata.domain;

public class Order {

    public Order() {
    }

    public Order(Long oid, Integer uid, String username, Integer pid, String pname, Double pprice, Integer number) {
        this.oid = oid;
        this.uid = uid;
        this.username = username;
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
        this.number = number;
    }

    private Long oid;//订单id
    private Integer uid;// 用 户 id
    private String username;//用户名
    private Integer pid;// 商 品 id
    private String pname;//商品名称
    private Double pprice;//商品单价
    private Integer number;//购买数量

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getPprice() {
        return pprice;
    }

    public void setPprice(Double pprice) {
        this.pprice = pprice;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
