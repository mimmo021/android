package dfj.projetolivro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by mimmo on 10/10/2015.
 *
 * criar novo Layout Resourse
 *
 * Classe DetalheLivroFragment extends de Fragment(support)
 *
 * código abaixo;
 *
 *
 */
public class DetalheLivroFragment extends Fragment{

    public static  DetalheLivroFragment novaInstancia(Livro l){
        Bundle args = new Bundle();
        args.putSerializable("livro", l);

        DetalheLivroFragment dlf = new DetalheLivroFragment();
        dlf.setArguments(args);
        return dlf;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Livro livro =(Livro)getArguments().getSerializable("livro");

        View layout = inflater.inflate(R.layout.fragment_detalhe_livro, null);

        TextView txtTitulo =(TextView)layout.findViewById(R.id.textView);
        TextView txtAutor =(TextView)layout.findViewById(R.id.textView2);
        TextView txtAno =(TextView)layout.findViewById(R.id.textView3);

        txtTitulo.setText(livro.titulo);
        txtAutor.setText(livro.autor);
        txtAno.setText(String.valueOf(livro.ano));

        return layout;
    }
}
