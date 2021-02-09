package mcm.edu.ph.mascardo_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDecision1 = findViewById(R.id.btnDecision1);
        Button btnDecision2 = findViewById(R.id.btnDecision2);

        TextView txtLore = findViewById(R.id.txtLore);
        txtLore.setText("Kirby just got back to his humble abode after a long and tiring adventure, The Pink Puffball is both tired and hungry. Will he go to bed and rest or will he eat a tasty snack?");


        btnDecision1.setOnClickListener(this);
        btnDecision2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){

        TextView txtDecision = findViewById(R.id.txtDecision);



        switch(view.getId()) {
            case R.id.btnDecision1:
                txtDecision.setText("Kirby jumped into his bed and fell asleep right away, ending another wonderful day.");
                break;
            case R.id.btnDecision2:
                txtDecision.setText("Kirby took a tasty cupcake with a cherry ontop and gobbles it right up, he smiles in satisfaction as he enjoyed the tasty treat.");
                break;
        }
    }
}