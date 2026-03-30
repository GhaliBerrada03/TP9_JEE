package ma.fstg.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @GetMapping("/")
    @ResponseBody
    public String afficherAccueil() {
        return "Bienvenue sur la page d'accueil après authentification.";
    }

    @GetMapping("/user/dashboard")
    @ResponseBody
    public String afficherEspaceUser() {
        return "Tableau de bord utilisateur : accès autorisé pour USER et ADMIN.";
    }

    @GetMapping("/admin/dashboard")
    @ResponseBody
    public String afficherEspaceAdmin() {
        return "Tableau de bord administrateur : accès réservé au rôle ADMIN.";
    }
}