package sg.edu.rp.c346.id20016584.democontextmenutranslation2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTranslateView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslateView=findViewById(R.id.textviewtranslate);
        registerForContextMenu(tvTranslateView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.englishselection){
            tvTranslateView.setText("Hello");
            return true;
        }else if(id==R.id.italianselection){
            tvTranslateView.setText("Ciao");
            return true;
        }else{
            tvTranslateView.setText("Error translation");
        }
        return super.onContextItemSelected(item);
    }
}