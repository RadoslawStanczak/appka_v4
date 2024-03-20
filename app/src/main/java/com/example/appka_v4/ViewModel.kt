package com.example.appka_v4
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ViewModel : ViewModel() {
    // Stan do przechowywania przesłanego tekstu
    private val _submittedText = mutableStateOf("")
    val submittedText: State<String> = _submittedText

    fun submitText(text: String) {
        // Tutaj możesz wykonać działania na przesłanym tekście, na przykład zapis do bazy danych
        _submittedText.value = text

        // Możesz również wywołać inne metody ViewModel lub wykonać operacje asynchroniczne
        viewModelScope.launch {
            // Tu umieść asynchroniczne operacje, jeśli są potrzebne
        }
    }
}