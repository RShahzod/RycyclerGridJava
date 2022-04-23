package uz.shox.rycyclergridjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import uz.shox.rycyclergridjava.adapter.UserAdapter;
import uz.shox.rycyclergridjava.model.User;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(R.drawable.lambo,"Lambo"));
        users.add(new User(R.drawable.ferra,"Ferra"));
        users.add(new User(R.drawable.mers,"Mers"));
        users.add(new User(R.drawable.bmw,"BMW"));

        UserAdapter userAdapter = new UserAdapter(this,users);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(userAdapter);
    }
}