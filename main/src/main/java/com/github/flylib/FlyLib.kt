package com.github.flylib

import com.github.flylib.event.MainListener
import com.github.flylib.state.State
import org.bukkit.plugin.java.JavaPlugin

class FlyLib(var plugin: JavaPlugin) {
    companion object{
        var instance:FlyLib? = null
        fun isExist() = instance!=null
        fun get(): FlyLib? {
            if(isExist()) return instance
            throw FlyLibNotReadyException()
        }
    }

    init {
        plugin.server.pluginManager.registerEvents(MainListener.instance, plugin)
        instance = this
    }

    var state = State()
}

class FlyLibNotReadyException:Exception("FlyLib is not ready")