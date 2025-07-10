package com.example.projectnoveai;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ChatAiActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EditText inputMessage;
    private Button buttonSend;
    private ChatAdapter chatAdapter;
    private List<ChatMessage> chatList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_ai);

        recyclerView = findViewById(R.id.recyclerView);
        inputMessage = findViewById(R.id.inputMessage);
        buttonSend = findViewById(R.id.buttonSend);

        chatList = new ArrayList<>();
        chatAdapter = new ChatAdapter(chatList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(chatAdapter);

        buttonSend.setOnClickListener(v -> {
            String message = inputMessage.getText().toString().trim();
            if (!message.isEmpty()) {
                addMessage(message, true); // user
                inputMessage.setText("");

                new Handler().postDelayed(() -> {
                    String aiReply = generateResponse(message);
                    addMessage(aiReply, false); // AI
                }, 500);
            }
        });
    }

    private void addMessage(String text, boolean isUser) {
        chatList.add(new ChatMessage(text, isUser));
        chatAdapter.notifyItemInserted(chatList.size() - 1);
        recyclerView.scrollToPosition(chatList.size() - 1);
    }

    private String generateResponse(String input) {
        if (input.toLowerCase().contains("hai") || input.toLowerCase().contains("halo")) {
            return "Halo juga! Ada yang bisa aku bantu?";
        } else if (input.toLowerCase().contains("siapa kamu")) {
            return "Aku adalah AI lokal Yang akan membantu mu Memilih rekomendasi Novel!";
        } else if (input.contains("rekomendasi novel")) {
            return "Beberapa rekomendasi novel: 'Laskar Pelangi', 'Bumi', 'Dilan 1990', dan 'Perahu Kertas'.";
        } else if (input.contains("terima kasih")) {
            return "Sama-sama! Senang bisa membantu 😊";
        } else if (input.contains("kamu bisa apa")) {
            return "Aku bisa memberikan rekomendasi novel dan menjawab pertanyaan seputar cerita!";
        } else {
            return "Maaf, aku belum mengerti maksudmu 😅";
        }
    }
}
