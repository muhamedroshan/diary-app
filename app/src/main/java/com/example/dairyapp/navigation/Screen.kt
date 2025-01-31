package com.example.dairyapp.navigation

import com.example.dairyapp.util.Constants.WRITE_SCREEN_ARGUMENT_KEY

sealed class Screen(val route: String) {
    object Authentication: Screen(route = "authentication_screen")
    object Home: Screen(route = "home_screen")
    object Write: Screen(route = "write_screen?$WRITE_SCREEN_ARGUMENT_KEY={$WRITE_SCREEN_ARGUMENT_KEY}"){
        fun passDeviceId(deviceId: String) =
            "write_screen?$WRITE_SCREEN_ARGUMENT_KEY=$deviceId"
    }
}