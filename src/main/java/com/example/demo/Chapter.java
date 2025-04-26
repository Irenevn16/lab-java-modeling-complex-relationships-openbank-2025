package com.example.demo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Chapter")
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "district")
    private String district;

    @JoinColumn(name = "president")
    @OneToOne
    private Member member;

    @OneToMany
    @JoinColumn(name = "list")
    private List<Member> memberList;

    public Chapter() {
    }

    public Chapter(String name, String district, Member member, List<Member> memberList) {
        this.name = name;
        this.district = district;
        this.member = member;
        this.memberList = memberList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", district='" + district + '\'' +
                ", member=" + member +
                ", memberList=" + memberList +
                '}';
    }
}
