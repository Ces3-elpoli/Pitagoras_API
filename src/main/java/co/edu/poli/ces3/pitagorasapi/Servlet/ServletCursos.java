package co.edu.poli.ces3.pitagorasapi.Servlet;

import co.edu.poli.ces3.pitagorasapi.DAO.Cursos;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "servletcurso", value = {"/cursos" , "/cursos/facultad" , "/cursos/ruta"})
public class ServletCursos extends HttpServlet {

    private ArrayList<Cursos> listaCursos;

    @Override
    public void init()  {
        Cursos curso = new Cursos();
        this.listaCursos = new ArrayList<>();

        this.listaCursos.add(new Cursos(1,
                "Ces",
                "ASK123",
                "Recaman",
                20,
                15,
                "Ingenieria",
                new ArrayList<>(),
                1,
                "febrero 18"
        ));

        this.listaCursos.add(new Cursos(2,
                "Ces2",
                "ASK223",
                "Pablo",
                20,
                18,
                "Ingenieria",
                new ArrayList<>(),
                2,
                "febrero 18"

        ));

        this.listaCursos.add(new Cursos(3,
                "Ces3",
                "ASK323",
                "Oscar",
                20,
                18,
                "Ingenieria",
                new ArrayList<>(),
                5,
                "febrero 18"

        ));

        this.listaCursos.add(new Cursos(4,
                "kinesiologia",
                "PE123",
                "Joel",
                20,
                18,
                "ED",
                new ArrayList<>(),
                1,
                "febrero 18"
        ));

    }



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/json");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();

        Gson gson = new Gson();

        String path = req.getServletPath();

        if (path.equals("/cursos")) {
            if (req.getParameter("id") == null) {
                out.print(gson.toJson(listaCursos));
            }else{
                int id = Integer.parseInt(req.getParameter("id"));
                Cursos BuscarCurso = null;
                for (Cursos curso : listaCursos) {
                    if (curso.getId() == id) {
                        BuscarCurso = curso;
                        break;
                    }
                }
                if (BuscarCurso != null) {
                    out.print(gson.toJson(BuscarCurso));
                } else {
                    out.print("{error\":\"No se encontro el curso\"}");
                }
            }



        } else if (path.equals("/cursos/facultad")) {
            if (req.getParameter("nombre") == null) {
                out.print(gson.toJson(listaCursos));
            } else {
                String nombre = req.getParameter("nombre");
                List<Cursos> CursosEnFacultad = BuscarCursosporFacultad(nombre);
                for (Cursos curso : CursosEnFacultad) {
                    out.print(gson.toJson(curso));
                }
            }

        }

    }



    private List<Cursos> BuscarCursosporFacultad(String facultad) {
        List<Cursos> listaCursosenFacultades = new ArrayList<>();
        for (Cursos curso : listaCursos) {
            if (curso.getFacultad().equalsIgnoreCase(facultad)) {
                listaCursosenFacultades.add(curso);
            }
        }
        return listaCursosenFacultades;
    }




}
