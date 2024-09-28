package com.example.task19.layout.components

import android.app.AlertDialog
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task19.model.Contact
import com.example.task19.model.contacts

@Composable
fun ContactList(contacts: List<Contact>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
    ) {

        contacts.forEach { contact ->
            var showDetails by remember { mutableStateOf(false) }

            if (showDetails) {
                ContactBox(contact = contact, onClose = { showDetails = false })
            } else
            ContactDetails(contact, onClick = { showDetails = true })
        }
    }


}

@Composable
fun ContactDetails(contact: Contact, onClick: () -> Unit) {
    Card(modifier = Modifier
        .padding(8.dp)
        .fillMaxWidth()
        .height(75.dp), onClick = {
        onClick()
    }
        ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray)
                .padding(12.dp)
                ,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = contact.name,
                modifier = Modifier.weight(1f),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )

            Column(
                modifier = Modifier.weight(2f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = contact.phoneNumber)
                Text(text = contact.address)
            }
        }
    }
    Spacer(modifier = Modifier.height(4.dp))

}
@Composable
fun ContactBox(contact: Contact,onClose: () -> Unit) {
 AlertDialog(title = { Text(text = contact.name)}, text = {
     Column {
         Text(text = contact.phoneNumber)
         Text(text = contact.address)
     }
 }, onDismissRequest = { onClose()}, confirmButton = { Button(onClick = { onClose() }){ Text(text = "Close")} }, dismissButton = {})
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ContactListPreview() {
    ContactList(contacts = contacts)
}