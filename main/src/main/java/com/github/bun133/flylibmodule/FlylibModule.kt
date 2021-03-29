package com.github.bun133.flylibmodule

import com.github.flylib.FlyLib
import com.github.bun133.flyframe.FlyModulePlugin
import com.github.bun133.flyframe.Module
import com.github.bun133.flyframe.ModuleEvent


class FlylibModulePlugin : FlyModulePlugin() {
    val module: FlyLibModule = FlyLibModule()

    override fun onEnable() {
        // Plugin startup logic
        FlyLib(this)
    }

    override fun getModule(): Module {
        return module
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}

class FlyLibModule : Module {
    override var authorName: String = "Bun133"
    override var moduleName: String = "FlyLib"
    override var version: String = "1.0"

    override fun onEvent(e: ModuleEvent) {
        when (e) {
            ModuleEvent.LOADED_ALL_MODULE -> {
                println("LOADED_ALL_MODULE")
            }
            ModuleEvent.MODULE_REQUIRED -> {
                println("FlyLibModule is required!")
            }
        }
    }

    override fun onModuleDisable() {
        println("[FlyLib-Module]NowDisable!")
    }

    override fun onModuleEnable() {
        println("[FlyLib-Module]NowEnable!")
    }
}