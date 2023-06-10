package com.myblog.myblog.member;

import com.myblog.myblog.dto.MemberEnrollment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public List<Member> memberList(){
        return memberRepository.findAll();
    }
    public Member currentMembers(String id){
        return memberRepository.findAllById(id);
    }

    public void createUsers(MemberEnrollment e){

        Member member = new Member();

        member.setSeq(null);
        member.setId(e.getId());
        member.setPassword(e.getPassword());
        memberRepository.save(member);
    }

    public void updateUsers(String id, String password) {
        Member member = memberRepository.findAllById(id);
        member.setPassword(password);
        memberRepository.save(member);
    }

    public boolean login(Member member){
        Member findUser = memberRepository.findAllById(member.getId());
        if(findUser == null){
            return false;
        }
        if(!findUser.getPassword().equals(member.getPassword())){
            return false;
        }
        return true;
    }


}
