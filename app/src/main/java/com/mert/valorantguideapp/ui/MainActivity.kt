package com.mert.valorantguideapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.findNavController
import com.mert.valorantguideapp.R
import com.mert.valorantguideapp.databinding.ActivityMainBinding
import com.mert.valorantguideapp.ui.agents.AgentsFragmentDirections
import com.mert.valorantguideapp.ui.agents.AgentsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val agentsViewModel: AgentsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fab.setOnClickListener {
            findNavController(R.id.nav_host_fragment_content_main).navigate(AgentsFragmentDirections.toAgentDetailFragment())
        }
        agentsViewModel.getAgents()
    }
}