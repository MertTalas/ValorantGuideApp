package com.mert.valorantguideapp.ui.agents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mert.valorantguideapp.R
import com.mert.valorantguideapp.databinding.FragmentAgentsBinding

class AgentsFragment : Fragment() {

    private lateinit var binding: FragmentAgentsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAgentsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvDummy.text = "Message from viewbinding"
    }
}