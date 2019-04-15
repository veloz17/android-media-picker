package com.turtlebody.mediapicker.ui.component.models

import java.io.Serializable

/**
 * Created by WANGSUN on 26-Mar-19.
 */
data class Video(var id: String = "",
                 var name: String = "",
                 var size: String?,
                 var filePath: String = "",
                 var thumbnailPath: String = "",
                 var duration: String = "",
                 var isSelected: Boolean = false ): Serializable {

    companion object {
        val ARG_BUNDLE = javaClass.canonicalName + ".bundle_arg"
        val ARG_LIST = javaClass.canonicalName + ".list_arg"
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }

        if (o == null) {
            return false
        }

        if (!(o is Video)) {
            return false
        }

        return id == o.id
    }
}
