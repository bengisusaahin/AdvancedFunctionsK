package com.bengisusahin.advancedfunctionsk

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class Delegates {
}

interface LifecycleLogger{
    fun registerLifecycleOwner(owner:LifecycleOwner)
}

class LifecycleLoggerImplementation : LifecycleLogger, LifecycleEventObserver{
    override fun registerLifecycleOwner(owner: LifecycleOwner) {
        owner.lifecycle.addObserver(this)
    }

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
//        if (event == Lifecycle.Event.ON_RESUME){
//            println("on resume executed")
//        }
        when(event){
            Lifecycle.Event.ON_RESUME -> println("on resume executed")
            Lifecycle.Event.ON_PAUSE -> println("on pause executed")
            else -> Unit

        }

    }

}
