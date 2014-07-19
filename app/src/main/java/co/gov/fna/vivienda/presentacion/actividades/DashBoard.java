package co.gov.fna.vivienda.presentacion.actividades;


import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;

import com.example.usuario.tryww.R;

import java.util.ArrayList;
import java.util.List;

import co.gov.fna.vivienda.controlador.ControladorDashBoard;
import co.gov.fna.vivienda.modelo.entidades.OpcionesDashBoard;
import co.gov.fna.vivienda.presentacion.actividades.adaptadores.CustomAdapter;

public class DashBoard extends Activity{

    private GridView gridOpciones;
    private ControladorDashBoard controlador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        gridOpciones= (GridView)findViewById(R.id.gridView);
        controlador = new ControladorDashBoard(this);
        controlador.createGrid();

    }

    public GridView getGridOpciones() {
        return gridOpciones;
    }

    public void setGridOpciones(GridView gridOpciones) {
        this.gridOpciones = gridOpciones;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dash_board, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
