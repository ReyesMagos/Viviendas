package co.gov.fna.contract;

import java.util.List;

import co.gov.fna.vivienda.modelo.entidades.Vivienda;
import co.gov.fna.vivienda.utilidades.FactoryVivienda;

/**
 * Created by Alexis-PC on 19/07/2014.
 */
public class ViviendaContract extends PersistanceContract {

    public static final String TABLE_NAME = "VIVIENDAS";

    private ViviendaContract(){
        super();
    }

    public static final class Column {

        public static final String ACABADOS = "acabados";
        public static final String APLICA_SUBSIDIO = "aplica_subsidio";
        public static final String AREA_DESDE = "area_desde";
        public static final String AREA_HASTA = "area_hasta";
        public static final String BARRIO = "barrio";
        public static final String CANTIDADDE_INMUEBLES_DISPONIBLES = "cantidad_inmuebles-disponibles";
        public static final String CARACTERISTICAS_PROYECTO = "caracteristicas_proyecto";
        public static final String CLASE_DE_VIVIENDA = "clase_de_vivienda";
        public static final String CREDITO_FNA = "credito_fna";
        public static final String CIUDAD = "ciudad";
        public static final String CUOTA_INICIAL = "cuota_inicial";
        public static final String CUOTA_MENSUAL = "cuota_mensual";
        public static final String DEPARTAMENTO = "departamento";
        public static final String DIA_DE_ATENCION_DESDE = "dia_de_atencion_desde";
        public static final String DIA_DE_ATENCION_HASTA = "dia_de_atencion_hasta";
        public static final String DIRECCION_PROYECTO = "direccion_proyecto";
        public static final String DIRECCION_SALA_DE_VENTAS = "direccion_sala_ventas";
        public static final String DIRECCION_SEDE_PRINCIPAL_CONSTRUCTORA = "direccion_sede_principal_constructora";
        public static final String EMAIL_CONSTRUCTORA = "email_constructora";
        public static final String ESTADO_OBRA = "estado_obra";
        public static final String FECHA_DE_ENTREGA = "fecha_de_entrega";
        public static final String HORARIO_DE_ATENCION_DESDE = "horario_de_atencion_desde";
        public static final String HORA_DE_ATENCION_HASTA = "horario_de_atencion_hasta";
        public static final String IMAGEN_PRINCIPAL = "imagen_principal";
        public static final String IMAGEN1 = "imagen1";
        public static final String IMAGEN2 = "imagen2";
        public static final String IMAGEN3 = "imagen3";
        public static final String IMAGEN4 = "imagen4";
        public static final String IMAGEN5 = "imagen5";
        public static final String LATITUD = "latitud";
        public static final String LOCALIDAD_O_ZONA = "localidad_o_zona";
        public static final String LONGITUD = "longitud";
        public static final String NIT_CONSTRUCTORA = "nit_constructora";
        public static final String NOMBRE_CONTACTO_CONSTRUCTORA = "nombre_constructora";
        public static final String NOMBRE_CONTACTO_SALA_DE_VENTA = "nombre_contacto_sala_de_venta";
        public static final String NOMBRE_CONSTRUCTORA = "nombre_constructora";
        public static final String NOMBRE_PROYECTO = "nombre_proyecto";
        public static final String NOMBRE_REPRESENTANTE_LEGAL_CONSTRUCTORA = "nombre_representante_legal_constructora";
        public static final String PARTITION_KEY = "partition_key";
        public static final String PRECIO_DESDE = "precio_desde";
        public static final String PRECIO_HASTA = "precio_hasta";
        public static final String TELEFONO_CONTACTO_CONSTRUCTORA = "telefono_contacto_constructora";
        public static final String TELEFONO_CELULAR_SALA_DE_VENTAS = "telefono_celular_sala_de_ventas";
        public static final String TELEFONO_FIJO_SALA_DE_VENTAS = "telefono_fijo_sala_de_ventas";
        public static final String TIPO_DE_INMUEBLE_OFRECIDO = "tipo_de_inmueble_ofrecido";
        public static final String VALOR_INMUBLE= "valor_inmueble";


        public static final String[] getAllColumns(){

            //TODO:retornar todas las columnas de ser necesario
                return(null);
        }









    }
}
