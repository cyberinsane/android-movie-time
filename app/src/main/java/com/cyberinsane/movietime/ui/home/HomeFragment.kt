package com.cyberinsane.movietime.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.cyberinsane.movietime.R
import com.cyberinsane.movietime.ui.home.state.HomeStateEvent
import org.koin.android.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {

    private val homeViewModel: HomeViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeViewModel.setStateEvent(HomeStateEvent.GetTrendingMoviesEvent())

        homeViewModel.dataState.observe(viewLifecycleOwner, Observer { dataState ->
            println("Debug: DataState: $dataState")
            dataState.trendingMovies?.let { movies ->
                homeViewModel.setTrendingMovies(movies)
            }
        })

        homeViewModel.viewState.observe(viewLifecycleOwner, Observer { viewState ->
            println("Debug: ViewState: $viewState")
            viewState.trendingMovies?.let { movies ->
                println("Debug: View Data: $movies")
            }
        })
    }

}
