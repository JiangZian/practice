package com.practice.practice.command;

import com.alibaba.cola.dto.Response;
import com.practice.practice.convertor.UserProfileConvertor;
import com.practice.practice.domain.user.UserProfile;
import com.practice.practice.dto.UserProfileUpdateCmd;
import com.practice.practice.domain.gateway.UserProfileGateway;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserProfileUpdateCmdExe{

    @Resource
    private UserProfileGateway userProfileGateway;

    public Response execute(UserProfileUpdateCmd cmd) {
        UserProfile userProfile = UserProfileConvertor.toEntity(cmd.getUserProfileCO());
        userProfileGateway.update(userProfile);
        return Response.buildSuccess();
    }
}