package springboot.gof_challenge.template.controller;

public interface ResponseEntity {

    static Object noContent() {
        
        throw new UnsupportedOperationException("Unimplemented method 'noContent'");
    }

}
