package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @PostMapping("/translate")
    public String dictionary(@RequestParam String txtSearch, Model model){
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("apple", "quả táo");
        dictionary.put("hello", "xin chào");
        dictionary.put("book", "quyển sách");
        dictionary.put("lemon", "quả chanh");
        dictionary.put("orange", "trái cam");

        String result = dictionary.get(txtSearch);
        String error="Không có từ này";
        if (result!=null){
            model.addAttribute("result",result);
            model.addAttribute("word",txtSearch);
        }else {
            model.addAttribute("error",error);
        }
        return "test";
    }
}
