package co.gov.fna.okeda.persitencia.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import co.gov.fna.contract.PersistanceContract;
import co.gov.fna.contract.ViviendaContract;

/**
 * Created by Alexis-PC on 19/07/2014.
 */
public class AccessorSqliteOpenHelper extends SQLiteOpenHelper {

    private static final String TAG = AccessorSqliteOpenHelper.class.getSimpleName();

    public AccessorSqliteOpenHelper(Context context) {
        super(context, PersistanceContract.DATABASE_NAME, null, PersistanceContract.DATABASE_VERSION);
        Log.d(TAG, "Se creo la Base de datos");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String viviendasTableSqlCreator = String.format("CREATE TABLE %s (%s TEXT PRIMARY KEY,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL," +
                "%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL" +
                ",%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL," +
                "%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL" + ",%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL," +
                "%s TEXT NOT NULL,%s TEXT NOT NULL" + ",%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL" +
                ",%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL,%s TEXT NOT NULL )",
                ViviendaContract.Column.PARTITION_KEY,
                ViviendaContract.Column.ACABADOS,
                ViviendaContract.Column.APLICA_SUBSIDIO,
                ViviendaContract.Column.AREA_DESDE,
                ViviendaContract.Column.AREA_HASTA,
                ViviendaContract.Column.BARRIO,
                ViviendaContract.Column.CANTIDADDE_INMUEBLES_DISPONIBLES,
                ViviendaContract.Column.CARACTERISTICAS_PROYECTO,
                ViviendaContract.Column.CLASE_DE_VIVIENDA,
                ViviendaContract.Column.CREDITO_FNA,
                ViviendaContract.Column.CIUDAD,
                ViviendaContract.Column.CUOTA_INICIAL,
                ViviendaContract.Column.CUOTA_MENSUAL,
                ViviendaContract.Column.DEPARTAMENTO,
                ViviendaContract.Column.DIA_DE_ATENCION_DESDE,
                ViviendaContract.Column.DIA_DE_ATENCION_HASTA,
                ViviendaContract.Column.DIRECCION_PROYECTO,
                ViviendaContract.Column.DIRECCION_SALA_DE_VENTAS,
                ViviendaContract.Column.DIRECCION_SEDE_PRINCIPAL_CONSTRUCTORA,
                ViviendaContract.Column.EMAIL_CONSTRUCTORA,
                ViviendaContract.Column.ESTADO_OBRA,
                ViviendaContract.Column.FECHA_DE_ENTREGA,
                ViviendaContract.Column.HORA_DE_ATENCION_HASTA,
                ViviendaContract.Column.HORARIO_DE_ATENCION_DESDE,
                ViviendaContract.Column.IMAGEN_PRINCIPAL,
                ViviendaContract.Column.IMAGEN1,
                ViviendaContract.Column.IMAGEN2,
                ViviendaContract.Column.IMAGEN3,
                ViviendaContract.Column.IMAGEN4,
                ViviendaContract.Column.IMAGEN5,
                ViviendaContract.Column.LATITUD,
                ViviendaContract.Column.LOCALIDAD_O_ZONA,
                ViviendaContract.Column.LONGITUD,
                ViviendaContract.Column.NIT_CONSTRUCTORA,
                ViviendaContract.Column.NOMBRE_CONSTRUCTORA,
                ViviendaContract.Column.NOMBRE_CONTACTO_CONSTRUCTORA,
                ViviendaContract.Column.NOMBRE_CONTACTO_SALA_DE_VENTA,
                ViviendaContract.Column.NOMBRE_PROYECTO,
                ViviendaContract.Column.NOMBRE_REPRESENTANTE_LEGAL_CONSTRUCTORA,
                ViviendaContract.Column.PRECIO_DESDE,
                ViviendaContract.Column.PRECIO_HASTA,
                ViviendaContract.Column.TELEFONO_CELULAR_SALA_DE_VENTAS,
                ViviendaContract.Column.TELEFONO_CONTACTO_CONSTRUCTORA,
                ViviendaContract.Column.TELEFONO_FIJO_SALA_DE_VENTAS,
                ViviendaContract.Column.TIPO_DE_INMUEBLE_OFRECIDO,
                ViviendaContract.Column.VALOR_INMUBLE);

        Log.d(TAG, viviendasTableSqlCreator);

        db.execSQL(viviendasTableSqlCreator);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(String.format("DROP TABLE IF EXISTS %s", ViviendaContract.TABLE_NAME));

        this.onCreate(db);

    }
}
