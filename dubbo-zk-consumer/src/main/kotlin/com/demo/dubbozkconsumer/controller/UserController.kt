package com.demo.dubbozkconsumer.controller

import com.demo.iservice.IUserService
import org.apache.dubbo.config.annotation.Reference
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController {

    @Reference
    private lateinit var userService: IUserService

    @RequestMapping("/getName")
    fun getName():String{
        return userService.getName()
    }

}