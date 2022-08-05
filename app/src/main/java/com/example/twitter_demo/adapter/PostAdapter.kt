package com.example.twitter_demo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.twitter_demo.R
import com.example.twitter_demo.model.Post
import com.google.android.material.imageview.ShapeableImageView

class PostAdapter(var context: Context,var item:ArrayList<Post>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int {
                return item.size
    }
    var type_post_1=0
    var type_post_2=1

    override fun getItemViewType(position: Int): Int {
        if(item[position].post_2>0){
            return type_post_2
        }
        return type_post_1
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType==type_post_2){
            var view=LayoutInflater.from(parent.context).inflate(R.layout.item_feed_post_2,parent,false)
            return Post2ViewHolder(view)
        }
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_feed_post,parent,false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var post=item[position]

        if(holder is Post2ViewHolder){
            var iv_profile=holder.iv_profile
            var iv_post_1=holder.iv_post_1
            var iv_post_2=holder.iv_podt_2
            var tv_post_fullname=holder.tv_fullname


            iv_profile.setImageResource(post.profile)
            iv_post_1.setImageResource(post.post_1)
            iv_post_2.setImageResource(post.post_2)
            tv_post_fullname.text=post.fullname
        }

        if(holder is PostViewHolder){

            var iv_profile=holder.iv_profile
            var iv_post=holder.iv_post
            var tv_post_fullname=holder.tv_fullname


            iv_profile.setImageResource(post.profile)
            iv_post.setImageResource(post.post_1)
            tv_post_fullname.text=post.fullname
        }


    }

    class Post2ViewHolder(view: View):RecyclerView.ViewHolder(view){
        var iv_profile:ShapeableImageView
        var iv_post_1:ShapeableImageView
        var iv_podt_2:ShapeableImageView
        var tv_fullname:TextView

        init {
            iv_profile=view.findViewById(R.id.iv_post_profile)
            iv_post_1=view.findViewById(R.id.iv_post_1)
            iv_podt_2=view.findViewById(R.id.iv_post_2)
            tv_fullname=view.findViewById(R.id.tv_post_fullname)
        }
    }
    class PostViewHolder(view: View):RecyclerView.ViewHolder(view){
        var iv_profile:ShapeableImageView
        var iv_post:ShapeableImageView
        var tv_fullname:TextView

        init {
            iv_profile=view.findViewById(R.id.iv_post_profile)
            iv_post=view.findViewById(R.id.iv_post)
            tv_fullname=view.findViewById(R.id.tv_post_fullname)
        }
    }
}