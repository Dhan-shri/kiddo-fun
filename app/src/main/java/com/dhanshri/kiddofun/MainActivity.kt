package com.dhanshri.kiddofun

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dhanshri.kiddofun.ui.theme.KiddoFunTheme
import com.dhanshri.kiddofun.ui.theme.screen.FunFactsNavigationGraph
import com.dhanshri.kiddofun.ui.theme.screen.Routes
import com.dhanshri.kiddofun.ui.theme.screen.UserInputScreen
import com.dhanshri.kiddofun.ui.theme.screen.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KiddoFunTheme {
                // A surface container using the 'background' color from the theme
                FunFactsApp()
            }
        }
    }

    @Composable
    fun FunFactsApp() {
        FunFactsNavigationGraph()
    }
}


