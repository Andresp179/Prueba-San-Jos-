package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(Model model){
        log.info("ejecutando el controlador Spring MVC");
        
        
        var saludo="Hola mundo thymeleaf";
        
        
        var persona= new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("Juanperez@gmail.com");
        persona.setTelefono("3105875521");
        model.addAttribute("mensaje",saludo);
        model.addAttribute("persona",persona);
        return "index";
    }
}
