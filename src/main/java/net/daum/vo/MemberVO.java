package net.daum.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@Data
@AllArgsConstructor //모든 속성들에 대해서 생성자를 만들어준다
public class MemberVO {

    private int mno;
    private String mid;
    private String mpw;
    private String mname;
    private Timestamp regdate;
}
