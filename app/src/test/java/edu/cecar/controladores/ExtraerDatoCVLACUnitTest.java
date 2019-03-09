package edu.cecar.controladores;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExtraerDatoCVLACUnitTest {
    @Rule
    public GestionTestExtraerDatoCVLAC gestionTestExtraerDatoCVLAC = new GestionTestExtraerDatoCVLAC();
    @Test
    public void validarDatosCVLAC() {

        // se definen los datos de referencia con los que se probara el metodo extraerDatos

        Investigador investigador1 = ExtraerDatoCVLAC.getDatos("http://scienti.colciencias.gov.co:8081/cvlac/visualizador/generarCurriculoCv.do?cod_rh=0001376707");
        Investigador investigador2 = ExtraerDatoCVLAC.getDatos("http://scienti.colciencias.gov.co:8081/cvlac/visualizador/generarCurriculoCv.do?cod_rh=0000787132");
        // se define los datos esperados
        String nombreInvestigador1 = "Guillermo Carlos Hernández Hernández";
        String nombreInvestigador2 = "Namuel Francisco Solórzano Peralta";

        // se comprueba o testea el valor esperado con el obtenido

        assertEquals(nombreInvestigador1,investigador1.getNombres());
        assertEquals(nombreInvestigador2,investigador2.getNombres());
    }
     @Test
      public void testDatosCVLACUno () {
         // se obtienen los dartos del investigador.
         Investigador investigador = ExtraerDatoCVLAC.getDatos("http://scienti.colciencias.gov.co:8081/cvlac/visualizador/generarCurriculoCv.do?cod_rh=0000402478");

         //se define los datos esperados.
         String nombreInvestigador = "Luty Del Carmen Gomezcaceres Peréz";
         assertEquals(nombreInvestigador, investigador.getNombres());
     }

     }


