package com.github.flylib

import com.github.flylib.util.FlatList

fun main(args:Array<String>){
//    Test().FlatListTest()
    Example().ChestGUI()
}

class Example{
    fun ChestGUI(){

    }
}

class Test{
    @Suppress("FunctionName")
    fun FlatListTest(){
        // PASSED!
        val list = FlatList<String>()
        list.set(1,1,"1,1")
        list.set(2,1,"2,1")
        list.set(1,3,"1,3")
        print("2,1:")
        println(list.getEntryForce(2,1).t)
    }
}