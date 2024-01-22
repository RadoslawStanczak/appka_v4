package com.example.appka_v4.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.appka_v4.Navigation


@Composable
fun Home(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(text = "lol")
        Button(onClick = { navController.navigate(Navigation.Details.route) }) {

        }
    }
}