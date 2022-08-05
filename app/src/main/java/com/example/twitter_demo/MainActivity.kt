package com.example.twitter_demo

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.twitter_demo.adapter.PostAdapter
import com.example.twitter_demo.adapter.StoryAdapter
import com.example.twitter_demo.model.Post
import com.example.twitter_demo.model.Story


class MainActivity : AppCompatActivity() {
    lateinit var mediaController: MediaController
    lateinit var video: VideoView

    lateinit var rv_post:RecyclerView
    lateinit var rv_story:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }
    fun initView(){

        rv_story=findViewById(R.id.rv_story)
        rv_story.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        refreshStory(getAllStory())

        rv_post=findViewById(R.id.rv_post)
        rv_post.layoutManager=GridLayoutManager(this,1)
        refreshFeed(getAllPost())
    }

    fun refreshStory( story:ArrayList<Story>){
        var adapter=StoryAdapter(this,story)
        rv_story.adapter=adapter

    }
    fun getAllStory():ArrayList<Story>{
        var story=ArrayList<Story>()

        story.add(Story(R.drawable.user_1,"Ali"))
        story.add(Story(R.drawable.user_2,"Vali"))
        story.add(Story(R.drawable.user_3,"Soli"))
        story.add(Story(R.drawable.user_4,"Karima"))
        story.add(Story(R.drawable.user_1,"Ali"))
        story.add(Story(R.drawable.user_2,"Vali"))
        story.add(Story(R.drawable.user_3,"Soli"))
        story.add(Story(R.drawable.user_4,"Karima"))
        story.add(Story(R.drawable.user_1,"Ali"))
        story.add(Story(R.drawable.user_2,"Vali"))
        story.add(Story(R.drawable.user_3,"Soli"))
        story.add(Story(R.drawable.user_4,"Karima"))


        return story
    }


    fun refreshFeed(post:ArrayList<Post>){
        var adapter=PostAdapter(this,post)
        rv_post.adapter=adapter
    }
    fun  getAllPost():ArrayList<Post>{
        var post=ArrayList<Post>()

        post.add(Post(R.drawable.user_1,R.drawable.post_1,"Ali"))
        post.add(Post(R.drawable.user_2,R.drawable.post_2,"Vali"))
        post.add(Post(R.drawable.user_3,R.drawable.post_3,"Soli"))
        post.add(Post(R.drawable.user_1,R.drawable.post_1,R.drawable.post_2,"Ali"))
        post.add(Post(R.drawable.user_2,R.drawable.post_2,"Vali"))
        post.add(Post(R.drawable.user_3,R.drawable.post_3,"Soli"))
        post.add(Post(R.drawable.user_2,R.drawable.post_3,R.drawable.post_2,"Ali"))
        post.add(Post(R.drawable.user_3,R.drawable.post_1,R.drawable.post_3,"Ali"))


        return post
    }
}