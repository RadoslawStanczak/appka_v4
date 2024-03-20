package com.example.appka_v4.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.appka_v4.Navigation
import com.example.appka_v4.ViewModel
import com.example.appka_v4.ui.theme.Appka_v4Theme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavController, viewModel: ViewModel) {
    val textState = remember { mutableStateOf(TextFieldValue())
    }
    Appka_v4Theme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier
                    .padding(16.dp),
                color = MaterialTheme.colorScheme.onBackground,
                text = "Wpisz coś do pola"
            )

            OutlinedTextField(
                value = textState.value,
                onValueChange = { newValue ->
                    // Aktualizacja stanu po zmianie tekstu
                    textState.value = newValue
                },
                label = { Text("Wpisz tekst") },
            )

            OutlinedButton(
                modifier = Modifier
                    //.background(MaterialTheme.colorScheme.tertiary) // Ustaw kolor tła przycisku
                    .padding(8.dp),
                colors = ButtonDefaults.buttonColors(contentColor = MaterialTheme.colorScheme.secondary),
                onClick = {
                    navController.navigate(Navigation.Details.route)
                    val text = textState.value.text
                    viewModel.submitText(text)
                }
            ) {
                Text(
                    color = MaterialTheme.colorScheme.tertiaryContainer,
                    text = "Wyślij"
                )
            }
        }
    }
}
