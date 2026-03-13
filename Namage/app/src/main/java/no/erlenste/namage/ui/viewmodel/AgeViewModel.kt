package no.erlenste.namage.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import no.erlenste.namage.data.repository.AgeRepository

class AgeViewModel : ViewModel() {

    private val _names = MutableStateFlow<List<String>>(emptyList())
    val names: StateFlow<List<String>> = _names.asStateFlow()

    fun getAge(name: String) {
        viewModelScope.launch {
            val response = AgeRepository().getAge(name)
            val ageText = "${response.name} personen er ${response.age} år"
            _names.value += ageText
        }
    }
}