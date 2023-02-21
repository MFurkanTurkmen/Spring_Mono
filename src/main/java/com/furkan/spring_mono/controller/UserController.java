package com.furkan.spring_mono.controller;

import com.furkan.spring_mono.dto.request.LoginRequestDto;
import com.furkan.spring_mono.dto.request.RegisterRequestDto;
import com.furkan.spring_mono.dto.response.UserControllerFindAllResponseDto;
import com.furkan.spring_mono.exception.ErrorType;
import com.furkan.spring_mono.exception.SpringMonoException;
import com.furkan.spring_mono.repository.entity.User;
import com.furkan.spring_mono.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static com.furkan.spring_mono.constants.EndPoints.*;
@RestController
@RequestMapping(USER)
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    /**
     * http://localhost:8080/v1/dev/user/register?username=muhammet&password=123&email=m@m.com
     * @param dto
     * @return
     */
    @GetMapping(REGISTER)
    public ResponseEntity<Boolean> register(RegisterRequestDto dto){
        return ResponseEntity.ok(userService.registerMapper(dto));
    }

    public ResponseEntity<User> doLogin(LoginRequestDto dto){
        return ResponseEntity.ok(null);
    }

    /**
     * http://localhost:8080/v1/dev/user/findall
     * @return
     */
    @GetMapping(FINDALL)
    public ResponseEntity<List<UserControllerFindAllResponseDto>> findAll(){
        return ResponseEntity.ok(userService.findAllResponseDtos());
    }


    @GetMapping("/findbyid")
    public ResponseEntity<User> findById(Long id){
        Optional<User> user = userService.findById(id);
        if(user.isEmpty()) throw new SpringMonoException(ErrorType.KULLANICI_BULUNAMADI);
        return ResponseEntity.ok(user.get());
    }

}
