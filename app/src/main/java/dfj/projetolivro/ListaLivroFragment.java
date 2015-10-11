package dfj.projetolivro;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.test.AndroidTestRunner;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mimmo on 10/10/2015.
 *
 * A classe ListaLivroFragment extend de ListFragment.
 *
 * Override onActivityCreated
 * mLivros
 * adicionar livros
 * setar adapter (contexto, layout, lista)
 *
 *
 *
 */
public class ListaLivroFragment extends android.support.v4.app.ListFragment{

    List<Livro> mLivros;


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mLivros = new ArrayList<>();
        mLivros.add(new Livro("Dominando o Android", "Glauber", 2015));
        mLivros.add(new Livro("Google Android","Acheta", 2014));
        mLivros.add(new Livro("Professional Android", "Meir", 2012));


        ArrayAdapter<Livro> adapter = new ArrayAdapter<Livro>(
                getActivity(), android.R.layout.simple_list_item_1, mLivros);

        setListAdapter(adapter);

        /**
         * Ir para o layout activity_livro
         * tornar linear e retirar o TextView do hello word.
         * inserir de Custom, <fragments>, ListaLivrofragment
         * dara um erro de Renderização, normal, não se preocupe.
         * coloque o Width em match parent
         *
         * Criar nova Activity DetalheLivroAtctivity.
         */
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Livro livro = mLivros.get(position);

        if(getActivity() instanceof AoClicarNoLivro){
            ((AoClicarNoLivro)getActivity()).clicounoLivro(livro);
        }

       }

    interface  AoClicarNoLivro{
        void clicounoLivro(Livro livro);
    }
}
