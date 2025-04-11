package co.edu.poli.ces3.pitagorasapi.Servlet;

import co.edu.poli.ces3.pitagorasapi.DAO.Cursos;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.rmi.ServerException;
import java.util.ArrayList;


@WebServlet(name = "servletcurso", value = {"/cursos" , "/cursos/facultad"})
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

}
