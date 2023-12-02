package com.yblog.domain.main.service;


import com.yblog.entitiy.Member;
import com.yblog.repositroy.MemberRepository;

import javax.transaction.Transactional;

@Transactional
public class RegisterServiceImpl implements IRegisterService{

    private final MemberRepository repository;

    public RegisterServiceImpl(MemberRepository repository) {
        this.repository = repository;
    }

    @Override
    public Member createMember(Member member) {
        return repository.save(member);
    }
}
