package com.smartherd.navigationbasicpractice

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController

@Composable
fun DetailScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(modifier = Modifier.clickable {
            navController.navigate(Screens.HomeScreen.route){
                popUpTo(Screens.HomeScreen.route)
            }
        },text = "Detail Screen",
            fontWeight = FontWeight.Bold,
            color = Color.Red,
            fontSize = MaterialTheme.typography.bodyLarge.fontSize)
    }

}