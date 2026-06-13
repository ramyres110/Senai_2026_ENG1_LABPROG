package com.ramyres;

import java.io.File;
import java.net.URL;

public class ArquivoJogosResource {
    public ArquivoJogosResource() {
        
    }

    public static URL obterURL() {
        URL url = ArquivoJogosResource.class.getResource("/jogos.txt");
        if (url == null) {
            System.out.println("Arquivo inexistente.");
            return null;
        }
        return url;
    }

    public static File obterArquivo() {
        URL url = obterURL();
        if (url == null) {
            return null;
        }
        return new File(url.getFile());
    }
}
