package com.murat.a1_homework_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.murat.a1_homework_7.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    lateinit var binding: FragmentSecondBinding
    lateinit var result :Model


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        result  = arguments?.getSerializable(FirstFragment.BUNDLE_KEY) as Model
        binding.detailAlive.text = result.alive
        binding.detailName.text = result.name
        binding.detailImage.setImageResource(result.image)
    }



}