package com.ohgiraffers.common;

public class MemberDTO {

    private int sequence;

    private String id;

    private String qwd;

    private String name;

    public MemberDTO(int sequence, String id, String qwd, String name) {
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQwd() {
        return qwd;
    }

    public void setQwd(String qwd) {
        this.qwd = qwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "sequence=" + sequence +
                ", id='" + id + '\'' +
                ", qwd='" + qwd + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
