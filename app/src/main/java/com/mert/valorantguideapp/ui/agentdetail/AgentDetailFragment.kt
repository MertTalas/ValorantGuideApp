package com.mert.valorantguideapp.ui.agentdetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mert.valorantguideapp.R
import com.mert.valorantguideapp.databinding.FragmentAgentDetailBinding

class AgentDetailFragment : Fragment() {

    private lateinit var binding: FragmentAgentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAgentDetailBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvDummy.text = "Custom Dialog Fragment"
    }
}