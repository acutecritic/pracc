package com.example.pracc.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Comment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //여기에 쓰인것은 디비에 저장됨 그래서 패스워드 체크없음.
    @Id
    private Long id;

    @Column(nullable = false)
    private String content;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MEMBER_ID", nullable = false)
    private Member member;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "POST_ID", nullable = false)
    private Post post;


    public Comment(Member member,String content,Post post) {

        this.member = member;
        this.content = content;
        this.post = post;
    }
}
