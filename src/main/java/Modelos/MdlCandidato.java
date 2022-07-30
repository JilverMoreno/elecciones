/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.ClsCandidato;
import Clases.ClsJdbc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author lenovo
 */
public class MdlCandidato {

    ClsJdbc jdbc;

    public MdlCandidato() {
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }

    public boolean agregarCandidato(ClsCandidato candidato) {

        try {
            String sql = "INSERT INTO tbl_candidato VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, candidato.getNumeroCedula());
            sentencia.setString(2, candidato.getNombre());
            sentencia.setString(3, candidato.getCorreo());
            sentencia.setString(4, candidato.getTelefono());
            sentencia.setString(5, candidato.getDireccion());
            sentencia.setString(6, candidato.getPartido());
            sentencia.setString(7, candidato.getMensajeCampania());
            sentencia.setString(8, candidato.getDescripcion());
            sentencia.setString(9, candidato.getCiudadOrigen());

            int resultado = sentencia.executeUpdate();

            return resultado >= 1;
            
        } catch (Exception e) {

            return false;

        }

    }

    public LinkedList<ClsCandidato> ObtenerCandidatos() {

        try {

            LinkedList<ClsCandidato> lista = new LinkedList<>();

            String consulta = "SELECT * FROM tbl_candidato";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {

                String cedula = resultados.getString("id_candidato");
                String nombre = resultados.getString("nombre");
                String correo = resultados.getString("correo");
                String telefono = resultados.getString("telefono");
                String direccion = resultados.getString("direccion");
                String partido = resultados.getString("partido_politico");
                String mensajeCampania = resultados.getString("mensaje_campania");
                String descripcion = resultados.getString("descripcion");
                String ciudadOrigen = resultados.getString("ciudad_origen");

                ClsCandidato candidato = new ClsCandidato(partido, mensajeCampania,
                        descripcion, cedula, nombre, correo, telefono, ciudadOrigen, direccion);
                lista.add(candidato);
            }

            return lista;

        } catch (Exception e) {

            return null;

        }

    }
}
