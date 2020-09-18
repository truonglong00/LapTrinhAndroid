package com.example.myclass.model

class Student {
    private var name=""
    private var birthday=""
    private var image=-1
    private var order = 0

    constructor(name: String, birthday: String, image: Int, order: Int) {
        this.name = name
        this.birthday = birthday
        this.image = image
        this.order = order
    }

    fun getName():String{
        return name
    }

    fun getBirthday():String{
        return birthday
    }

    fun getImage():Int{
        return image
    }

    fun getOrder():Int{
        return order
    }
}