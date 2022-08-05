package com.example.twitter_demo.model

class Post {

    var profile: Int
    var post_1: Int
    var post_2: Int=0
    var fullname:String

    constructor(profile: Int,post_1: Int,fullname:String){
        this.post_1=post_1
        this.profile=profile
        this.fullname=fullname
    }

    constructor(profile: Int,post_1: Int, post_2: Int,fullname:String){
        this.profile=profile
        this.post_1=post_1
        this.post_2=post_2
        this.fullname=fullname
    }

}