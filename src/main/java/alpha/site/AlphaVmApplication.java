package alpha.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AlphaVmApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlphaVmApplication.class, args);
    }
}

@Controller
class SiteController {

    @GetMapping("/alpha")
    public String index() {
        return "alpha"; // abre templates/index.html
    }

    @GetMapping("/sobre")
    public String sobre() {
        return "sobre"; // abre templates/sobre.html
    }

    @GetMapping("/publicidade")
    public String publicidade() {
        return "publicidade"; // abre templates/publicidade.html
    }

    @GetMapping("/eventos")
    public String eventos() {
        return "eventos"; // abre templates/eventos.html
    }

    @GetMapping("/imoveis")
    public String imoveis() {
        return "imoveis"; // abre templates/imoveis.html
    }

    @GetMapping("/construcao")
    public String construcao() {
        return "construcao"; // abre templates/construcao.html
    }
}