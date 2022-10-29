package com.murat.a1_homework_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.murat.a1_homework_7.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private val list = arrayListOf<Model>()
    companion object {
      const val BUNDLE_KEY = "bundle_key"
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list.clear()
        loadData()
        val adapter = Adapter(list,this::onClick)
        binding.recycle.adapter = adapter
    }

    private fun loadData() {
        list.add(Model("Rick Sanchez","Alive",R.drawable.ic_rick))
        list.add(Model("Morty Smith","Alive",R.drawable.ic_morty))
        list.add(Model("Albert Einstein","Alive",R.drawable.ic_albert))
        list.add(Model("Jerry Smith","Alive",R.drawable.ic_jerry))

    }

private fun onClick(position : Int){
    findNavController().navigate(R.id.secondFragment, bundleOf(BUNDLE_KEY to list[position]))


}


}