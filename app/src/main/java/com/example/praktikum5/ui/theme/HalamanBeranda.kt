package com.example.praktikum5.ui.theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum5.R

@Composable
fun HalamanBeranda(
    onNextButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxSize()
            // Background halaman jadi putih
            .background(Color.White)
            .padding(dimensionResource(R.dimen.padding_medium)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        // Teks Selamat Datang
        Text(
            text = stringResource(id = R.string.selamat_datang),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3F3A53)
        )
        // Logo
        Box(
            modifier = Modifier
                .padding(dimensionResource(R.dimen.padding_small)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_placeholder),
                contentDescription = "Logo",
                // Ukuran logo
                modifier = Modifier.size(500.dp)
            )
        }

        // Nama dan NIM
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Hanun Nisa Salsabila",
                fontSize = 23.sp,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray
            )
            Text(
                text = "20230140130",
                fontSize = 20.sp,
                color = Color.DarkGray
            )
        }
        // Tombol Submit
        Button(
            onClick = onNextButtonClicked,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = purpleButton), // Warna dari Color.kt
            shape = RoundedCornerShape(size = 25.dp)
        ) {
            Text(
                text = stringResource(id = R.string.submit),
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}