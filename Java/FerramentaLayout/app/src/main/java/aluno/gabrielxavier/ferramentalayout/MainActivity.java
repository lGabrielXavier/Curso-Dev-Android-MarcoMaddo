    package aluno.gabrielxavier.ferramentalayout;

    import androidx.appcompat.app.AppCompatActivity;

    import android.os.Bundle;
    import android.text.TextUtils;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.Switch;
    import android.widget.TextView;
    import android.widget.Toast;
    import android.widget.ToggleButton;

    public class MainActivity extends AppCompatActivity {

        //Apresentar o textos
        TextView txtTitulo;

        // Entrada de dados - formulários
        EditText editNomeCompleto;
        EditText editTextEmailAddress;

        //evento do botão.
        Button btnConfirmar;

        ToggleButton tbLigado;

        Switch swMostrar;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            txtTitulo = findViewById(R.id.txtTtitulo);
            editNomeCompleto = findViewById(R.id.editNomeCompleto);
            editTextEmailAddress= findViewById(R.id.editTextEmailAddress);
            tbLigado = findViewById(R.id.tbLigado);
            swMostrar = findViewById(R.id.swMostrar);

            btnConfirmar = findViewById(R.id.btnConfirmar);


            txtTitulo.setText("Retrato Principal");

            btnConfirmar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    boolean dadosOK = true; // TextUtils.isEmpty(editNomeCompleto.getText().toString()) < verifica se digitou.
                    if(TextUtils.isEmpty(editNomeCompleto.getText().toString())){
                        editNomeCompleto.setError("digite o nome completo por favor...");

                        dadosOK=false;
                    }

                    if(dadosOK) {
                        Toast.makeText(getBaseContext(), "voce digitou : " + editNomeCompleto.getText(),
                                Toast.LENGTH_LONG).show();
    //
                    }
                    tbLigado.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (tbLigado.isChecked()) editNomeCompleto.setEnabled(false);
                            else editNomeCompleto.setEnabled(true);
                        }


                    });
                }
            });
            swMostrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (swMostrar.isChecked()){

                        txtTitulo.setVisibility(View.GONE);

                    }else{

                        txtTitulo.setVisibility(View.VISIBLE);
                        String novoTitulo = txtTitulo.getText().toString().toUpperCase();
                        txtTitulo.setText(novoTitulo);
                    }
                }
            });


        }
    }