package com.tambadenis.pastebinclone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PastebinController {
    @Autowired
    private PastebinRepository pastebinRepo;
    @GetMapping("/pastebins")
    public ModelAndView getAllPastebins() {
        ModelAndView mav = new ModelAndView("list-pastebins");
        mav.addObject("pastebin", pastebinRepo.findAll());
        return mav;
    }
    @GetMapping("/addpastebin")
    public ModelAndView addEmployeeForm() {
        ModelAndView mav = new ModelAndView("add-pastebin-form");
        Pastebin newPastebin = new Pastebin();
        mav.addObject("pastebin", newPastebin);
        return mav;
    }
    @PostMapping("/savepastebin")
    public String savePastebin(@ModelAttribute Pastebin pastebin) {
        pastebinRepo.save(pastebin);
        return "redirect:/pastebins";
    }
}
