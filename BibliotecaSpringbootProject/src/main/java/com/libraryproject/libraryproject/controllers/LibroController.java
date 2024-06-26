package com.libraryproject.libraryproject.controllers;

import com.libraryproject.libraryproject.entities.Autor;
import com.libraryproject.libraryproject.entities.Editorial;
import com.libraryproject.libraryproject.entities.Libro;
import com.libraryproject.libraryproject.entities.Usuario;
import com.libraryproject.libraryproject.exceptions.MyException;
import com.libraryproject.libraryproject.services.AutorService;
import com.libraryproject.libraryproject.services.EditorialService;
import com.libraryproject.libraryproject.services.LibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/libro")
public class LibroController {

    @Autowired
    private LibroService libroService;
    @Autowired
    AutorService autorService;
    @Autowired
    EditorialService editorialService;

    @GetMapping("")
    public String libros(Model m, HttpSession session) {
        List<Libro> libros = libroService.listarLibros();
        Usuario logueado = (Usuario) session.getAttribute("usuariosession");

        m.addAttribute("usuario", logueado);
        m.addAttribute("libros", libros);

        return "libros";
    }

    @GetMapping("/crear")
    public String crearLibro(Model m, HttpSession session) {
        List<Autor> autores = autorService.listarAutores();
        List<Editorial> editoriales = editorialService.listarEditoriales();
        Usuario logueado = (Usuario) session.getAttribute("usuariosession");

        m.addAttribute("usuario", logueado);
        m.addAttribute("autores", autores);
        m.addAttribute("editoriales", editoriales);

        return "create/crearLibro";
    }

    @PostMapping("/registrar")
    public String register(
            Model m, HttpSession session,
            @RequestParam(required = false) Long isbn,
            @RequestParam String titulo,
            @RequestParam String idAutor,
            @RequestParam String idEditorial,
            @RequestParam(required = false) Integer ejemplares) {
        Usuario logueado = (Usuario) session.getAttribute("usuariosession");
        m.addAttribute("usuario", logueado);

        try {
            libroService.crearLibro(isbn, titulo, ejemplares, idAutor, idEditorial);
            m.addAttribute("exito", "El libro se creo con exito");
        } catch (MyException e) {
            m.addAttribute("error", e.getMessage());
            return this.libros(m, session);
        }
        return this.libros(m, session);
    }

    @GetMapping("/actualizar/{isbn}")
    public String update(Model m, HttpSession session, @PathVariable Long isbn) {
        Libro libro = libroService.obtenerLibroPorId(isbn);
        List<Autor> autores = autorService.listarAutores();
        List<Editorial> editoriales = editorialService.listarEditoriales();
        Usuario logueado = (Usuario) session.getAttribute("usuariosession");

        m.addAttribute("usuario", logueado);
        m.addAttribute("libro", libro);
        m.addAttribute("autores", autores);
        m.addAttribute("editoriales", editoriales);

        return "edit/editarLibro";
    }

    @PutMapping("/guardar/{isbn}")
    public String update(Model m, HttpSession session, @PathVariable Long isbn, @RequestParam String titulo,
            @RequestParam Integer ejemplares,
            @RequestParam String idAutor, @RequestParam String idEditorial) {
        Usuario logueado = (Usuario) session.getAttribute("usuariosession");
        m.addAttribute("usuario", logueado);

        try {
            libroService.modificarLibro(isbn, titulo, ejemplares, idAutor, idEditorial);
            m.addAttribute("exito", "El libro se edito con exito");
        } catch (MyException e) {
            m.addAttribute("error", e.getMessage());
            return this.libros(m, session);
        }

        return this.libros(m, session);
    }

    @DeleteMapping("/eliminar/{isbn}")
    public String delete(Model m, HttpSession session, @PathVariable Long isbn) {
        libroService.eliminarLibro(isbn);
        Usuario logueado = (Usuario) session.getAttribute("usuariosession");

        m.addAttribute("usuario", logueado);
        m.addAttribute("exito", "El libro se elimino con exito");

        return this.libros(m, session);
    }
}
