package com.myblog.myblog.users;

import com.myblog.myblog.dto.UsersEnrollment;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UsersService {

    private final UsersRepository usersRepository;
    public List<Users> getUserList(Long seq) {
        return usersRepository.findAllById(Collections.singletonList(seq));}
//    @Query("select m from Users m where name = :name and password = :password")
//    Users findMember(String email, String password);

    public void createUser(UsersEnrollment e){
        Users users = new Users();
        users.setId(null);
        users.setName(e.getName());
        users.setPassword(e.getPassword());

        usersRepository.save(users);
    }
//    public boolean login(Users users) {
//        Users findUser = usersRepository.findById(users.getName());
//        if(findUser == null){
//            return false;
//        }
//        if(!findUser.getPassword().equals(users.getPassword())){
//            return false;
//        }
//        return true;
//
//    }

}
