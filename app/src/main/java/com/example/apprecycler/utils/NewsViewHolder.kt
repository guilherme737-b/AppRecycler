package com.example.apprecycler.utils

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apprecycler.databinding.DefaultItemBinding
import com.example.apprecycler.model.News

class NewsViewHolder(private val binding: DefaultItemBinding, private val context: Context) :
    RecyclerView.ViewHolder(binding.root) {
        fun bind(news: News, onClick:(News) -> Unit){

            binding.run {
                title.text = news.title
                Glide.with(context).load(news.imgUrl).into(binding.image)

                container.setOnClickListener{
                    onClick(news)

                }
            }


        }

   companion object{
       fun typeViewHolder(
           parent: ViewGroup,
           context: Context,
           index: Int
       ): NewsViewHolder {
           val binding = DefaultItemBinding.inflate(
               LayoutInflater.from(parent.context),
               parent,
               false
           )
           return NewsViewHolder(binding, context)

       }

   }

}