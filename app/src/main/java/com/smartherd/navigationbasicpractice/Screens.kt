package com.smartherd.navigationbasicpractice

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "id"

sealed class Screens(val route: String) {

    object HomeScreen : Screens(route = "home_screen")
    object DetailScreen : Screens(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}"){
//        fun passId(id:Int):String{
//            return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
//        }
        fun passNameAndId(
            id:Int,
            name: String
        ):String{
            return "detail_screen/$id/$name"
        }
    }


}