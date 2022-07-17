package org.qcri.farase.spellchecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@SpringBootApplication
@RestController
public class SpellCheckerAPI {
    SpellChecker spell = new SpellChecker();
    public static void main(String[] args) {
        // String arg;
        // String host = "";
        // String port = "";
        // while (i < args.length)
        // {
        //     arg = args[i++];
        //     // 
        //     if (arg.equals("--help") || arg.equals("-h") || (args.length != 0 && args.length != 2 && args.length != 4 && args.length != 6 && args.length != 8))
        //     {
        //         System.out.println("Usage: SpellChecker <--help|-h> <[-i|--input] [in-filename]> <[-o|--output] [out-filename]>");
        //         System.exit(-1);
        //     }

        //     if (arg.equals("--host") || arg.equals("-h"))
        //     {
        //         host = args[i];   
        //     }
        //     if (arg.equals("--port") || arg.equals("-p"))
        //     {
        //         port = args[i];
        //     }
        // }

        SpringApplication.run(SpellCheckerAPI.class, args);
    }
    @RequestMapping("/spellcheck")
    public String spellcheck(@RequestParam(value="word", defaultValue="") String word) {
        boolean formatInput, formatOutput, considerContext;
        formatInput = false; //
        formatOutput = false; // true for site display
        considerContext = true; // Use the context or not
        // int nofCorrectionEntries = spell.init(considerContext);
        // String line="ان الحياه دقائق وثوانى"; // utf-8 string
        String output = spell.spellCheck(word, formatInput, formatOutput, considerContext);
        return output;
    
}
}