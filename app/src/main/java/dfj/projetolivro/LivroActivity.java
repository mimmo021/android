package dfj.projetolivro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class LivroActivity extends AppCompatActivity
        implements ListaLivroFragment.AoClicarNoLivro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livro);
    }

    @Override
    public void clicounoLivro(Livro livro) {
        if(getResources().getBoolean(R.bool.fone)) {

            Intent it = new Intent(this, DetalheLivroActivity.class);
            it.putExtra("livro", livro);
            startActivity(it);
        }else{
            DetalheLivroFragment dlf = DetalheLivroFragment.novaInstancia(livro);

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.detalhe, dlf)
                    .commit();
        }
    }
}
