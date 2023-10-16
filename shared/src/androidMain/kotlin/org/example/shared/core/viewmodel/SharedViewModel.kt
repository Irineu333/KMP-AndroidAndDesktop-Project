package org.example.shared.core.viewmodel

import androidx.lifecycle.ViewModel
import org.example.shared.core.extension.callPrivateMethod
import androidx.lifecycle.viewModelScope as androidViewModelScope

actual abstract class SharedViewModel : ViewModel() {

    actual val viewModelScope get() = androidViewModelScope

    public actual override fun onCleared() {
        super.onCleared()
    }

    internal actual fun clear() {
        callPrivateMethod(
            clazz = ViewModel::class.java,
            name = "clear"
        )
    }
}