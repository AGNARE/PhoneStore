package com.agn.phonestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.agn.phonestore.RecicleViewPhone.ImgAdapter
import com.agn.phonestore.RecicleViewPhone.ImgModel
import com.agn.phonestore.databinding.FragmentPhoneBinding

class PhoneFragment : Fragment() {

    lateinit var binding: FragmentPhoneBinding
    lateinit var adapter: ImgAdapter
    var arrayList: ArrayList<ImgModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPhoneBinding.inflate(inflater,container,false)
        return binding.root
        fillRecicler()
        binding.recicleView.adapter = adapter
    }

    private fun fillRecicler() {
        arrayList.add(ImgModel(R.drawable.samsunggalaxyfirst,1000,"fasjfjoij"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxysecond,12097,"sdfjfjoij"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,46637,"sdfjffhdfww j"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,46637,"sdfjffhdfww j"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,46637,"sdfjffhdfww j"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,46637,"sdfjffhdfww j"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,46637,"sdfjffhdfww j"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,46637,"sdfjffhdfww j"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,46637,"sdfjffhdfww j"))
        arrayList.add(ImgModel(R.drawable.samsunggalaxythird,46637,"sdfjffhdfww j"))
        adapter = ImgAdapter(arrayList)
        binding.recicleView.adapter
    }
}
