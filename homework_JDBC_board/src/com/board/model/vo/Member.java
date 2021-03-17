package com.board.model.vo;

import java.util.Objects;

public class Member {
    private int indexMember;
    private String memberId;
    private String memberPwd;
    private String memberName;
    private String email;
    private String address;
    private String phone;
    private String enrollDate;

    public Member() {
    }

    public Member(String memberId, String memberPwd, String memberName, String email, String address, String phone) {
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.memberName = memberName;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public Member(int indexMember, String memberId, String memberPwd, String memberName, String email, String address, String phone, String enrollDate) {
        this.indexMember = indexMember;
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.memberName = memberName;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.enrollDate = enrollDate;
    }

    public int getIndexMember() {
        return indexMember;
    }

    public void setIndexMember(int indexMember) {
        this.indexMember = indexMember;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPwd() {
        return memberPwd;
    }

    public void setMemberPwd(String memberPwd) {
        this.memberPwd = memberPwd;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(String enrollDate) {
        this.enrollDate = enrollDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return indexMember == member.indexMember && Objects.equals(memberId, member.memberId) && Objects.equals(memberPwd, member.memberPwd) && Objects.equals(memberName, member.memberName) && Objects.equals(email, member.email) && Objects.equals(address, member.address) && Objects.equals(phone, member.phone) && Objects.equals(enrollDate, member.enrollDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexMember, memberId, memberPwd, memberName, email, address, phone, enrollDate);
    }

    @Override
    public String toString() {
        return "Member{" +
                "indexMember=" + indexMember +
                ", memberId='" + memberId + '\'' +
                ", memberPwd='" + memberPwd + '\'' +
                ", memberName='" + memberName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", enrollDate='" + enrollDate + '\'' +
                '}';
    }

}
