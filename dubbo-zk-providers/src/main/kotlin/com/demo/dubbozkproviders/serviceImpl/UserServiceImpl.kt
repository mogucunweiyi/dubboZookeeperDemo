package com.demo.dubbozkproviders.serviceImpl

import com.demo.iservice.IUserService
import org.apache.dubbo.config.annotation.Service

//注意这个@Service是dubbo的
@Service
class UserServiceImpl : IUserService {
    override fun getName(): String {
        return "mogu" + System.currentTimeMillis()
    }
}