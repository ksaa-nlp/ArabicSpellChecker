package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spellchecker.SpellChecker;

@RestController
public class HelloController {

	@GetMapping("/spellcheck")
	public String index(@RequestParam(value="word", defaultValue="") String word) {
		SpellChecker spell = new SpellChecker();
		spell.init(true);
		String output = spell.spellCheck(word, false, false, true);

		return output;
	}

}
