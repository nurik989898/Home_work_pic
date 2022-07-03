package com.example.home_work_pic

import android.net.Uri
import android.view.LayoutInflater
import androidx.recyclerview.widget.GridLayoutManager
import com.example.home_work_pic.adapter.AdapterSecond
import com.example.home_work_pic.databinding.ActivitySecondBinding

class SecondActivity :Base<ActivitySecondBinding>() {
    private val adapter = AdapterSecond()
    override fun inflateVB(inflater: LayoutInflater): ActivitySecondBinding {
        return ActivitySecondBinding.inflate(inflater)
    }

    override fun initListener() {
        val uri: ArrayList<Uri>? = intent.getParcelableArrayListExtra(MainActivity.KEY_IMG)
        if (uri != null){
            adapter.addImage(uri)

        }
    }

    override fun initView() {
        binding.recyclerView.layoutManager = GridLayoutManager(this@SecondActivity,3)
        binding.recyclerView.adapter = adapter
    }
}