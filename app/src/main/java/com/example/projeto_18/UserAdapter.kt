package com.example.projeto_18

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projeto_18.databinding.RowUserBinding

class UserAdapter: RecyclerView.Adapter<UserViewHolder>() {

    private var userlist:List<UserModel> = listOf()
    private lateinit var listener: OnUserListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val item = RowUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(item, listener)
    }

    override fun getItemCount(): Int {
        return userlist.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(userlist[position])
    }

    fun updateUsers(list:List<UserModel>){
        userlist = list
        notifyDataSetChanged()
    }

    fun attachListener(userListener: OnUserListener){
        listener = userListener
    }
}