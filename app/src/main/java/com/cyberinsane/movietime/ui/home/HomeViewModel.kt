package com.cyberinsane.movietime.ui.home

import androidx.lifecycle.*
import com.cyberinsane.movietime.model.Movie
import com.cyberinsane.movietime.repository.MovieRepository
import com.cyberinsane.movietime.ui.home.state.HomeStateEvent
import com.cyberinsane.movietime.ui.home.state.HomeViewState
import com.cyberinsane.movietime.util.AbsentLiveData

class HomeViewModel(private val movieRepo: MovieRepository) : ViewModel() {

    private val _viewState: MutableLiveData<HomeViewState> = MutableLiveData()
    private val _stateEvent: MutableLiveData<HomeStateEvent> = MutableLiveData()

    val trendingLiveData = liveData {
        val update = getCurrentViewState()
        emit(movieRepo.getTrendingMovies().results)
    }

    val viewState: LiveData<HomeViewState>
        get() = _viewState

    val dataState: LiveData<HomeViewState> = Transformations
        .switchMap(_stateEvent) { stateEvent ->
            handleStateEvent(stateEvent)
        }

    private fun handleStateEvent(stateEvent: HomeStateEvent): LiveData<HomeViewState> {
        when (stateEvent) {
            is HomeStateEvent.GetTrendingMoviesEvent -> {
                return AbsentLiveData.create()
            }
        }
    }

    fun setTrendingMovies(movies: List<Movie>) {
        val update = getCurrentViewState()
        update.trendingMovies = movies
        _viewState.value = update
    }

    fun getCurrentViewState(): HomeViewState {
        val value = viewState.value?.let {
            it
        } ?: HomeViewState()
        return value
    }

    fun setStateEvent(event: HomeStateEvent) {
        _stateEvent.value = event
    }
}