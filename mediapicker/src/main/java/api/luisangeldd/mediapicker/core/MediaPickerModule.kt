package api.luisangeldd.mediapicker.core

import android.content.Context
import api.luisangeldd.mediapicker.data.MediaPickerUseCase
import api.luisangeldd.mediapicker.data.repository.MediaPickerRepo
import api.luisangeldd.mediapicker.data.repository.MediaPickerRepoImpl

interface MediaPickerModule{
    val mediaPickerRepo: MediaPickerRepo
    val mediaPickerUseCase: MediaPickerUseCase
}

class MediaPickerModuleImpl (private val appContext: Context) : MediaPickerModule{
    override val mediaPickerRepo: MediaPickerRepo by lazy {
        MediaPickerRepoImpl(appContext)
    }
    override val mediaPickerUseCase: MediaPickerUseCase by lazy {
        MediaPickerUseCase(mediaPickerRepo)
    }
}
