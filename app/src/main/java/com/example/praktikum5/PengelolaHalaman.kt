package com.example.praktikum5.ui.theme

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

// Enum untuk menentukan rute navigasi
enum class Halaman {
    Beranda,
    List,
    Formulir
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PendaftaranApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier
    ) { innerPadding ->

    }
}