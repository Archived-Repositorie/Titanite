package io.github.justfoxx.titanite;

import io.github.justfoxx.titanite.lang.Lang;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

class Main {
    public static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) throws Exception {
        Path path;
        if (args.length > 0) {
            path = Path.of(args[0]);
            if(!path.toFile().exists()) {
                throw new RuntimeException(String.format("File %s doesnt exist!", args[0]));
            }
        } else {
            path = Path.of("Main.tni");
            if(!path.toFile().exists()) {
                throw new RuntimeException("No Main.tni file");
            }
        }
        byte[] file = Files.readAllBytes(path);
        Lang.run(new String(file, Charset.defaultCharset()));
    }
}
