package org.gfn.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

/**
 * @author H-Bahiraei
 * Created on 10/24/2022
 */
@Controller
public class AlienController {

    @Autowired
    AlienRepository alienRepository;


    @PostMapping("/alien") // it returns json
    @ResponseBody
    public Alien addAAlien(Alien alien) {
        alienRepository.save(alien);
        return alien;
    }

    @PutMapping(value = "/alien", consumes = {"application/json"}) // it returns json
    @ResponseBody
    public Alien addOrUpdateAlien(@RequestBody Alien alien) {
        alienRepository.save(alien);
        return alien;
    }

    @RequestMapping("/addAlien1")
    @ResponseBody
    public String addAlien1(Alien alien) { // it returns ResponseBody
        alienRepository.save(alien);
        return alien.toString();
    }

    @RequestMapping("/addAlien2")
    public String addAlien2(Alien alien) { // it returns web home.jsp
        alienRepository.save(alien);
        return "home.jsp";
    }


    @RequestMapping("alien/{aid}")
    @ResponseBody
    public Optional<Alien> getOneAlien(@PathVariable("aid") int aid) {
        return alienRepository.findById(aid);
    }

    @RequestMapping("/aliens")
    @ResponseBody
    public List<Alien> getAliens() {
        return alienRepository.findAll();
    }


    @DeleteMapping("/alien/{aid}")
    public String deleteAlien(@PathVariable int aid) {
        Alien alien = alienRepository.findById(aid).orElse(null);
        alienRepository.delete(alien);
        return "deleted";
    }


    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam("aid") int aid) {
        Alien alien = alienRepository.findById(aid).orElse(new Alien());
        ModelAndView modelAndView = new ModelAndView("showAlien.jsp");
        modelAndView.addObject(alien);
//        System.out.println("*** "+alienRepository.findByAidGreaterThan(1));
        System.out.println("*** " + alienRepository.findByMyQuery("java"));
        return modelAndView;
    }

    @RequestMapping("/getAlienByTech")
    public ModelAndView getAlien(@RequestParam("tech") String tech) {
        List<Alien> aliens = alienRepository.findByTech(tech);
        ModelAndView modelAndView = new ModelAndView("showAlien.jsp");
        modelAndView.addObject(aliens.get(1));
        return modelAndView;
    }

}
