package com.example.natureapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.natureapp.models.Nature

@Composable
fun NatureScreen(innerPadding: PaddingValues) {
    val casa = Nature.nature
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Lugares Naturales", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        LazyColumn(modifier = Modifier.fillMaxWidth().padding(5.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            items(casa) {
                Card(modifier = Modifier.fillMaxWidth().padding(5.dp)) {
                    Column(modifier = Modifier.fillMaxWidth().padding(5.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = rememberAsyncImagePainter(model = it.imagen),
                            contentDescription = it.nombre,
                            Modifier.height(100.dp).width(200.dp),
                            contentScale = ContentScale.Crop,
                        )
                        Spacer(Modifier.size(5.dp))
                        Text(text = it.nombre, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                        Spacer(Modifier.size(5.dp))
                        Text(text = it.descripcion, fontSize = 15.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}

