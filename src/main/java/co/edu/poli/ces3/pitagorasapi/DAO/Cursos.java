package co.edu.poli.ces3.pitagorasapi.DAO;

import java.util.ArrayList;
import java.util.List;

public class Cursos {

    private Integer id;
    private String nombre;
    private String codigo;
    private String profesor;
    private Integer cupoMaximo;
    private Integer inscritos;
    private String facultad;
    private ArrayList<Cursos> prerrequisitos;
    private Integer nivel;
    private String fechaInicio;




    public Cursos() {
    }

    public Cursos(Integer id, String nombre, String codigo, String profesor, Integer cupoMaximo, Integer inscritos, String facultad, ArrayList<Cursos> prerrequisitos, Integer nivel, String fechaInicio) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.profesor = profesor;
        this.cupoMaximo = cupoMaximo;
        this.inscritos = inscritos;
        this.facultad = facultad;
        this.prerrequisitos = prerrequisitos;
        this.nivel = nivel;
        this.fechaInicio = fechaInicio;
    }





    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public Integer getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(Integer cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public Integer getInscritos() {
        return inscritos;
    }

    public void setInscritos(Integer inscritos) {
        this.inscritos = inscritos;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public ArrayList<Cursos> getPrerrequisitos() {
        return prerrequisitos;
    }

    public void setPrerrequisitos(ArrayList<Cursos> prerrequisitos) {
        this.prerrequisitos = new ArrayList<>(prerrequisitos);
    }


    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return this.id + " " + this.nombre + " " + this.codigo + " " + this.profesor
                + " " + this.cupoMaximo + " " + this.inscritos + " " + this.facultad
                + " " + this.prerrequisitos + " " + this.nivel + " " + this.fechaInicio;
    }

}
