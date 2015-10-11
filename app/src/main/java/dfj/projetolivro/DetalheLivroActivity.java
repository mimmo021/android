package dfj.projetolivro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


/**
 * Criar DetalheLivroFragment (classe)
 * inserir 3 textviews (large, ,medium, plain)
 * setar o gravity em center
 * ir para DetalheLivrofragment
 *
 * em activity_detalhe_livro acrescentar o id= detalhe
 */
public class DetalheLivroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_livro);

        if (savedInstanceState == null) {
            Livro livro = (Livro) getIntent().getSerializableExtra("livro");

            DetalheLivroFragment dlf = DetalheLivroFragment.novaInstancia(livro);

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.detalhe, dlf)
                    .commit();
        }
    }
}
