package com.mkl.home.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkl.home.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
	public List<Member> findByMemmbername(String name);
	//SELECT * FROM jpa_board WHERE membername=#{param1}
	
	public List<Member> findAllByOrderByMembernumDesc();//회원번호의 내림차순 정렬
	//SELECT * FROM jpa_board ORDER BY membernum DESC
	
	public Member findByMemberidAndMemberpw(String id, String pw);
	//SELECT * FROM jpa_board WHERE memberid=#{param1} AND memberpw=#{param2}

}
