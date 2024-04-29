package com.example.golf.repository;

import com.example.golf.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,String>  {
}
